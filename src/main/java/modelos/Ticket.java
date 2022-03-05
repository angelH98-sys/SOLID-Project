package modelos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ticket {
    @Getter @Setter
    String TicketId;
    @Getter
    @Setter
    private List<OrderList> ListaOrden;
    @Getter @Setter
    private String EmployeeId;
    @Getter @Setter
    private Date TicketDate;
    @Getter @Setter
    private Double Total;

    public Ticket(String TicketId, String EmployeeId, Date TicketDate, Double Total){
        this.TicketDate = TicketDate;
        this.TicketId = TicketId;
        this.EmployeeId = EmployeeId;
        this.Total = Total;


    }
    public Ticket(){
        this.Total = 0.0;
        this.ListaOrden = new ArrayList<>();
    }
    public void agregarProductoOrden(Productos producto, int cantidad){
        double total = producto.getValorUnitario() * cantidad;
        this.Total += total;
        this.ListaOrden.add(new OrderList(producto.getProductoid(), cantidad, producto.getValorUnitario(), total));
    }
}
