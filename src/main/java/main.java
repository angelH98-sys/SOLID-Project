import Vistas.MenuPrincipal;
import controladores.*;

import java.io.IOException;

public class main {

    public static AdministradorCompradores administradorCompradores = new AdministradorCompradores();
    public static AdministradorEmpleados administradorEmpleados = new AdministradorEmpleados();
    public static AdministradorProveedores administradorProveedores = new AdministradorProveedores();
    public static AdministradorProductos administradorProductos = new AdministradorProductos();
    public static AdministradorVentaCompra administradorVentaCompra = new AdministradorVentaCompra();
    public static MenuPrincipal menu = new MenuPrincipal();

    public static void main(String[] args) throws InterruptedException, IOException {

        valoresDefecto();
        String siguienteProceso = "menuPrincipal";
        do
        {
            siguienteProceso = ejecutarSiguienteProceso(siguienteProceso);
        }while (siguienteProceso != "finEjecucion");

    }

    public static void valoresDefecto()
    {
        administradorEmpleados.agregarEmpleadosPorDefecto();
        administradorProveedores.agregarProveedoresPorDefecto();
        administradorCompradores.agregarCompradoresPorDefecto();
        administradorProductos.agregarProductosPorDefecto();
    }

    public static String ejecutarSiguienteProceso(String proceso) throws InterruptedException, IOException {
        switch (proceso)
        {
            case "menuPrincipal":
                proceso = menu.menuPrincipal();
                break;
            case "administrarProductos":
                proceso = menu.administrarProductos();
                break;
            case "administrarEmpleados":
                proceso = menu.administrarEmpleados();
                break;
            case "administrarClientes":
                proceso = menu.administrarClientes();
                break;
            case "nuevaVenta":
                proceso = administradorVentaCompra.ejecutarVenta(administradorProductos.getProductosAlmacenados());
                break;
        }

        return proceso;
    }

}
