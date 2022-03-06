package modelos;

import lombok.Getter;
import lombok.Setter;

public class Compradores {

    @Setter @Getter
    private String compradorId;
    @Setter @Getter
    private String nombre;
    @Setter @Getter
    private String mail;
    @Setter @Getter
    private String status;

    public Compradores(String compradorId, String nombre, String mail) {
        this.compradorId = compradorId;
        this.nombre = nombre;
        this.mail = mail;
        this.status = "Activo";
    }

    public Compradores(){}
}
