package modelos;

import lombok.Getter;
import lombok.Setter;

public class Empleados {

    @Getter @Setter
    private String empleadoId;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String status;

    public Empleados(String empleadoId, String nombre) {
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.status = "Activo";
    }
}
