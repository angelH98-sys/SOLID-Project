package modelos;

import java.util.Date;

public class Sell extends Ticket {
    private String CustomerId;

    public Sell(String TicketId, String EmployeeId, Date TicketDate, Double Total, String CustomerId) {
        super(TicketId, EmployeeId, TicketDate, Total);
        this.CustomerId = CustomerId;
    }
    public Sell(){

    }

}
