package controladores;

import Helpers.Log;
import Helpers.clearScreen;
import interfaces.ServicioVentas;
import lombok.Getter;
import lombok.Setter;
import modelos.OrderList;
import modelos.Productos;
import modelos.Ventas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;


public class AdministradorVentaCompra implements ServicioVentas {

    @Getter @Setter
    private Double gananciasTotales;
    @Getter @Setter
    private Double gastosTotales;
    @Getter @Setter
    private List<Ventas> listaVentas;

    @Getter @Setter
    private List<Productos> listaProductos;
    private Ventas venta;
    private Scanner scanner;

    AdministradorCorreos correos = new AdministradorCorreos();


    public String ejecutarVenta(List<Productos> listaProductos) throws InterruptedException {

        Log.logger.log(Level.INFO, "Inicio ejecutarVenta");

        this.listaProductos = listaProductos;
        venta = new Ventas();

        System.out.println("Menu Principal/Crear venta");
        System.out.println("----------------------------------------");
        System.out.println("\n\t-> Creación de ventas\n");

        mostrarProductosDisponibles();

        agregarProductoAOrden();

        terminarVenta();

        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(500);

        return "menuPrincipal";
    }

    @Override
    public void mostrarProductosDisponibles() {

        int lengthNombre, lengthValor;
        System.out.println("\tProductos registrados");
        System.out.println("ID\t\t\t|Nombre\t\t\t\t\t\t|Valor unitario\t|Stock");
        for (Productos producto : this.listaProductos){
            if(producto.getStatus() == "Inactivo") continue;
            System.out.print(producto.getProductoId());
            System.out.print("\t");
            System.out.print(producto.getNombre());

            lengthNombre = producto.getNombre().length();
            if(lengthNombre < 4){
                System.out.print("\t\t\t\t\t\t\t");
            }else if(lengthNombre >= 4 && lengthNombre < 8){
                System.out.print("\t\t\t\t\t\t");
            }else if(lengthNombre >= 8 && lengthNombre < 12){
                System.out.print("\t\t\t\t\t");
            }else if(lengthNombre >= 12 && lengthNombre < 16){
                System.out.print("\t\t\t\t");
            }
            else if(lengthNombre >= 16 && lengthNombre < 20){
                System.out.print("\t\t\t");
            }else if(lengthNombre >= 20 && lengthNombre < 24){
                System.out.print("\t\t");
            }else{
                System.out.print("\t");
            }

            System.out.print("$" + String.format("%.02f", producto.getValorUnitario()));

            lengthValor = String.valueOf(producto.getStock()).length();
            if(lengthValor < 3){
                System.out.print("\t\t\t");
            }else if(lengthValor >= 3 && lengthValor < 7){
                System.out.print("\t\t");
            }else{
                System.out.println("\t");
            }

            System.out.print(producto.getStock() + " unidad(es)\n");
            Log.logger.log(Level.FINE, "mostrarProductosDisponibles ejecutado");
        }
    }

    @Override
    public void agregarProductoAOrden() {

        Log.logger.log(Level.INFO, "Inicio agregarProductoAOrden");

        System.out.println("\nEscribe el ID del producto que desees y haz enter para agregarlo");
        System.out.println("Cuando finalices, escribe Salir/salir");

        String productoId = "";
        String cantidad;

        Productos producto;
        Log.logger.log(Level.INFO, "Inicio toma de datos");
        do{
            productoId = getProductoId();
            if(productoId == "salir") break;

            cantidad = getCantidad(productoId);
            if(cantidad == "salir") break;

            Log.logger.log(Level.FINE, "Producto agregado a orden: " + productoId + ", " + cantidad);

            String finalProductoId = productoId;

            producto = listaProductos.stream()
                    .filter(p -> p.getProductoId().equals(finalProductoId))
                    .findAny().orElse(null);

            venta.agregarProductoOrden(producto, Integer.parseInt(cantidad));

        }while (productoId.trim().toLowerCase() != "salir");

        Log.logger.log(Level.INFO, "Fin agregarProductoAOrden");
    }


    @Override
    public void terminarVenta() {
        Log.logger.log(Level.INFO, "Inicio terminarVenta");

        this.scanner = new Scanner(System.in);
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        String mail;

        if(venta.getListaOrden().size() == 0) return;

        System.out.println("\t->Toma de productos finalizada");
        System.out.println("Digita el mail del cliente");

        do{
            mail = this.scanner.nextLine();

            if(mail.trim().length() == 0 || !Pattern.matches(regex, mail)){
                Log.logger.log(Level.WARNING, "Mail del cliente: " + mail + ", invalido");
                System.out.println("Debes ingresar un mail valido, intenta nuevamente");
                continue;
            }

            break;

        }while (true);

        Log.logger.log(Level.FINE, "Mail del cliente: " + mail);

        String valorRuta = crearComprobanteDePago();

        correos.enviarMail(mail,valorRuta);

        Log.logger.log(Level.INFO, "Fin terminarVenta");

    }

    public String getProductoId(){
        String productoId = "";
        Productos producto;
        this.scanner = new Scanner(System.in);

        do {

            System.out.print("\nID:");
            productoId = scanner.nextLine();

            if(productoId.trim().equalsIgnoreCase("salir"))
            {
                Log.logger.log(Level.FINE, "Salida de toma de datos");
                return "salir";
            }

            if(!esValidoProductoId(productoId)) {
                Log.logger.log(Level.WARNING, "ID de producto: " + productoId + ", invalido");
                System.out.print("\tPor favor, ingresa el ID del producto valido o digita Salir");
                continue;
            }

            return productoId;

        }while (true);
    }

    public boolean esValidoProductoId(String productoId)
    {
        //Validando si ha ingresado algo en la consola
        if(productoId.trim().length() == 0)
            return false;

        //Validando si ingreso un ID existente en la lista de productos
        Productos producto = listaProductos.stream()
                .filter(p -> p.getProductoId().equals(productoId))
                .findAny().orElse(null);

        if(producto == null || producto.getStatus() == "Inactivo")
            return false;

        return true;
    }

    private String getCantidad(String productoId) {

        String cantidad = "";

        this.scanner = new Scanner(System.in);

        do {

            System.out.print("\nCantidad:");
            cantidad = scanner.nextLine();

            if(cantidad.trim().equalsIgnoreCase("salir")) return "salir";

            if(!esValidaCantidad(productoId, cantidad))
            {
                Log.logger.log(Level.WARNING, "Cantidad ingresada: " + cantidad + ", invalida");
                System.out.print("\n\tPor favor, ingresa una cantidad valida o digita Salir");
                continue;
            }
            return cantidad;


        }while (true);
    }

    public boolean esValidaCantidad(String productoId, String cantidad)
    {

        try
        {
            //Validando si han escrito algo
            if(cantidad.trim().length() == 0)
                return false;

            //Validando que hayan escrito un valor numerico
            //Si no lo han echo, retorna false por la excepcion que generaria
            int cantidadInt = Integer.parseInt(cantidad);

            //Si el valor que han escrito es mayor a cero
            //No es posible llevar 0 o -n productos
            if(cantidadInt <= 0)
                return false;

            Productos producto = listaProductos.stream()
                    .filter(p -> p.getProductoId().equals(productoId))
                    .findAny().orElse(null);

            //En caso que la cantidad que ingresen rebasa la cantidad que existe en stock
            if(cantidadInt > producto.getStock())
                return false;

        }catch (Exception ex)
        {
            return false;
        }

        return true;
    }

    private String crearComprobanteDePago(){
        String cuerpoComprobante = "\tTicket de compra";

        venta.setTicketDate(new Date());

        cuerpoComprobante += "\nFecha de compra: " + venta.getTicketDate().toString();

        cuerpoComprobante += "\n\nProductos seleccionados";

        cuerpoComprobante += "\nID\t\t\t|Cantidad\t\t|PrecioUni\t|Total\n";

        for (OrderList orden : venta.getListaOrden()){
            cuerpoComprobante += orden.toString() + "\n";
        }

        cuerpoComprobante += "---------------------------------\n";

        cuerpoComprobante += "\t\t\t\t\t\t\t\t\t$" + String.format("%.02f", this.venta.getTotal());

        cuerpoComprobante += "\nGRACIAS POR PREFERIRNOS";

        String ruta = "";

        try {
            FileWriter ticket = new FileWriter("ticket.txt");
            ticket.write(cuerpoComprobante);
            ticket.close();
            //codigo agregado
            File f = new File("ticket.txt");
            ruta = f.getAbsolutePath();
            System.out.println("Comprobante generado exitosamente");

        } catch (IOException e) {
            Log.logger.log(Level.WARNING, "Comprobante no creado: " + e.getMessage());
            System.out.println("No fue posible crear comprobante");
            return null;
        }

        Log.logger.log(Level.FINE, "Comprobante creado: " + ruta);
        return ruta;
    }


}
