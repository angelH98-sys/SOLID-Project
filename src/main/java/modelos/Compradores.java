package modelos;

import lombok.Getter;
import lombok.Setter;

public class Compradores {

    @Setter @Getter
    private String IdComprador;
    @Setter @Getter
    private String nombre;
    @Setter @Getter
    private String mail;
    @Setter @Getter
    private String status;

    public Compradores(String idComprador, String nombre, String mail) {
        this.IdComprador = idComprador;
        this.nombre = nombre;
        this.mail = mail;
        this.status = "Activo";
    }
}
