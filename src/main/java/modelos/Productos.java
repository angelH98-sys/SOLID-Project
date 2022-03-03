package modelos;

import lombok.Getter;
import lombok.Setter;

public class Productos {

    @Getter @Setter
    private String productoid;
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private Double valorUnitario;
    @Getter @Setter
    private String proveedorId;
    @Getter @Setter
    private String status;
    @Getter @Setter
    private int stock;

    public Productos(String productoid, String nombre, String proveedorId) {
        this.productoid = productoid;
        this.nombre = nombre;
        this.valorUnitario = 0.0;
        this.proveedorId = proveedorId;
        this.status = "Activo";
        this.stock = 0;
    }
}
