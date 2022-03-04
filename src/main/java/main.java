import Vistas.MenuPrincipal;
import controladores.AdministradorCompradores;
import controladores.AdministradorEmpleados;
import controladores.AdministradorProductos;
import controladores.AdministradorProveedores;
import modelos.Compradores;
import modelos.Empleados;
import modelos.Productos;
import modelos.Proveedores;

public class main {

    public static AdministradorCompradores administradorCompradores = new AdministradorCompradores();
    public static AdministradorEmpleados administradorEmpleados = new AdministradorEmpleados();
    public static AdministradorProveedores administradorProveedores = new AdministradorProveedores();
    public static AdministradorProductos administradorProductos = new AdministradorProductos();

    public static void main(String[] args) throws InterruptedException {

        //TODO:Al haber menu, antes de la ejecucion debe preguntar si desea establecer los valores por defecto o no
        //dependiendo de la respuesta, ejecutara el metodo
        valoresDefecto();
        MenuPrincipal menu = new MenuPrincipal();
        menu.menu();
    }

    public static void valoresDefecto()
    {

        //Esto de aca no queda mejor como un Array o un Map?? (lineas 29 a 62)
        //Setting compradores por defecto



        //Setting empleados por defecto



        //Setting productos por defecto
        administradorProductos
                .agregarProducto(new Productos("BIC28371", "Bicicleta", "CJR1837"));
    }


}
