package interfaces;

import modelos.Empleados;

public interface ServicioEmpleados {

    void agregarEmpleado(Empleados empleado);
    void modificarEmpleado(Empleados empleado);
    void deshabilitarEmpleado(String empleadoId);
    void empleadosPorDefecto();
}
