package controladores;

import interfaces.ServicioEmpleados;
import lombok.Getter;
import lombok.Setter;
import modelos.Empleados;

import java.util.ArrayList;
import java.util.List;

public class AdministradorEmpleados implements ServicioEmpleados {


    @Setter @Getter
    private List<Empleados> empleadosRegistrados = new ArrayList<>();
    @Override
    public void agregarEmpleado(Empleados empleado) {
        //TODO: el producto debe settearse el ID
        this.empleadosRegistrados.add(empleado);
    }

    @Override
    public void empleadosPorDefecto() {
        empleadosRegistrados.add(new Empleados("JR7374", "Juan Ruiz"));
        empleadosRegistrados.add(new Empleados("ALG283", "Alicia Luján Gutierrez"));
        empleadosRegistrados.add(new Empleados("JTC1827", "Julio Tomas de la Cruz"));
        empleadosRegistrados.add(new Empleados("SD28371", "Santiago Diaz"));
    }
}
