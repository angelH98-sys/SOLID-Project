package modelos;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

public class OrderList {
    @Getter @Setter
    private String productId;
    @Getter @Setter
    private int cantidad;
    @Getter @Setter
    private double precioUnitario;
    @Getter @Setter
    private double total;

    public OrderList(String productId, int cantidad, double precioUnitario, double total) {
        this.productId = productId;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = total;
    }
    @Override
    public String toString() {
        String orden = "";
        orden += this.productId + "\t";
        orden += this.cantidad + "\t\t\t";
        orden += "$" + String.format("%.02f", this.precioUnitario) + "\t\t";
        orden += "$" + String.format("%.02f", this.total);
        return orden;
    }
}
