package controladores;

import Vistas.MenuAdministrarClientes;
import Vistas.MenuAdministrarEmpleados;
import Vistas.MenuAdministrarProductos;
import Vistas.MenuPrincipal;

public class MenuController {

    public static MenuPrincipal menu = new MenuPrincipal();
    public static MenuAdministrarEmpleados menuEmpleados = new MenuAdministrarEmpleados();
    public static MenuAdministrarClientes menuClientes = new MenuAdministrarClientes();
    public static MenuAdministrarProductos menuProductos = new MenuAdministrarProductos();
    public static AdministradorVentaCompra administradorVentaCompra = new AdministradorVentaCompra();


    public static String ejecutarSiguienteProceso(String proceso) throws InterruptedException {
        switch (proceso)
        {
            case "menuPrincipal":
                proceso = menu.menuPrincipal();
                break;
            case "administrarProductos":
                menuProductos.agregarProductosPorDefecto();
                proceso = menuProductos.administrarProductos();
                break;
            case "administrarEmpleados":
                menuEmpleados.agregarEmpleadosPorDefecto();
                proceso = menuEmpleados.administrarEmpleados();
                break;
            case "administrarClientes":
                menuClientes.agregarClientesPorDefecto();
                proceso = menuClientes.administrarClientes();
                break;
            case "nuevaVenta":
                proceso = administradorVentaCompra.ejecutarVenta(menuProductos.getProductosAlmacenados());
                break;
        }

        return proceso;
    }
}
