package modelos;

import lombok.Getter;
import lombok.Setter;

public class Clientes {

    @Setter @Getter
    private String clienteId;
    @Setter @Getter
    private String nombre;
    @Setter @Getter
    private String mail;
    @Setter @Getter
    private String status;

    public Clientes(String clienteId, String nombre, String mail) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.mail = mail;
        this.status = "Activo";
    }

    public Clientes(){}
}
