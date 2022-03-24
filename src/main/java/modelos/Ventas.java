package modelos;

import lombok.Getter;
import lombok.Setter;
//TODO: Revisar donde se esta usando esta clase y si se puede cambiar o incluir dentro de modeos>Compradores
public class Ventas extends Ticket {
    @Getter @Setter
    private String compradorId;

}
