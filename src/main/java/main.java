import Vistas.MenuPrincipal;
import controladores.AdministradorCompradores;
import controladores.AdministradorEmpleados;
import controladores.AdministradorProductos;
import controladores.AdministradorProveedores;

public class main {

    public static AdministradorCompradores administradorCompradores = new AdministradorCompradores();
    public static AdministradorEmpleados administradorEmpleados = new AdministradorEmpleados();
    public static AdministradorProveedores administradorProveedores = new AdministradorProveedores();
    public static AdministradorProductos administradorProductos = new AdministradorProductos();

    public static void main(String[] args) throws InterruptedException {

        valoresDefecto();
        MenuPrincipal menu = new MenuPrincipal();
        menu.menu();
    }

    public static void valoresDefecto()
    {

    }


}
