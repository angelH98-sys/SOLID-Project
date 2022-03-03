package modelos;

import lombok.Getter;
import lombok.Setter;

public class Empleados {

    @Getter @Setter
    private String IdEmpleado;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String status;

    public Empleados(String idEmpleado, String nombre) {
        IdEmpleado = idEmpleado;
        this.nombre = nombre;
        this.status = "Activo";
    }
}
