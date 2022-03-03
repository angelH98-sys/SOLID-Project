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

    public static void main(String[] args) {

        //TODO:Al haber menu, antes de la ejecucion debe preguntar si desea establecer los valores por defecto o no
        //dependiendo de la respuesta, ejecutara el metodo
        valoresDefecto();

    }

    public static void valoresDefecto()
    {
        //Setting compradores por defecto
        administradorCompradores
                .agregarComprador(new Compradores("RMJ1234","Rosa Maria Juarez", "rosa@mail.com"));
        administradorCompradores
                .agregarComprador(new Compradores("EF12342","Ernesto Fernandez", "ernesto@mail.com"));
        administradorCompradores
                .agregarComprador(new Compradores("MAO1323","Matias Alejandro Olmedo", "matias@mail.com"));

        //Setting empleados por defecto
        administradorEmpleados
                .agregarEmpleado(new Empleados("JR7374", "Juan Ruiz"));
        administradorEmpleados
                .agregarEmpleado(new Empleados("ALG283", "Alicia Luján Gutierrez"));
        administradorEmpleados
                .agregarEmpleado(new Empleados("JTC1827", "Julio Tomas de la Cruz"));
        administradorEmpleados
                .agregarEmpleado(new Empleados("SD28371", "Santiago Diaz"));

        //Setting proveedores por defecto
        administradorProveedores
                .agregarProveedor(new Proveedores("CJR1837", "Ciclas Juan Ramon",
                                                    "+1 123 123 3234", "ciclicas@mail.com"));
        administradorProveedores
                .agregarProveedor(new Proveedores("AT18272", "Accesorios Tito",
                                                    "+503 2938 2038", "tito@mail.com"));
        administradorProveedores
                .agregarProveedor(new Proveedores("SS29383", "Suma Salud",
                                                    "+1 123 123 3234", "salud@mail.com"));

        //Setting productos por defecto
        administradorProductos
                .agregarProducto(new Productos("BIC28371", "Bicicleta", "CJR1837"));
    }


}