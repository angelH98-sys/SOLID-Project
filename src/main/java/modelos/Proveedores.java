package modelos;

import lombok.Getter;
import lombok.Setter;

public class Proveedores {

    @Getter @Setter
    private String proveedorId;
    @Setter @Getter
    private String nombreProveedor;
    @Setter @Getter
    private String telefono;
    @Setter @Getter
    private String mail;
    @Setter @Getter
    private String status;

    public Proveedores(String proveedorId, String nombreProveedor, String telefono, String mail) {
        this.proveedorId = proveedorId;
        this.nombreProveedor = nombreProveedor;
        this.telefono = telefono;
        this.mail = mail;
        this.status = "Activo";
    }
}
