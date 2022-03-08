package modelos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {
    @Getter @Setter
    private String ticketId;
    @Getter@Setter
    private List<OrderList> listaOrden;
    @Getter @Setter
    private String employeeId;
    @Getter @Setter
    private Date ticketDate;
    @Getter @Setter
    private Double total;

    public Ticket(){
        this.total = 0.0;
        this.listaOrden = new ArrayList<>();
    }
    public void agregarProductoOrden(Productos producto, int cantidad){
        double total = producto.getValorUnitario() * cantidad;
        this.total += total;
        this.listaOrden.add(new OrderList(producto.getProductoId(), cantidad, producto.getValorUnitario(), total));
    }
}
