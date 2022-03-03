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
    public void modificarEmpleado(Empleados empleado) {
        //TODO: logica para modificar empleado
        return;
    }

    @Override
    public void deshabilitarEmpleado(String empleadoId) {
        //TODO: logica para modificar empleado
        return;
    }
}
