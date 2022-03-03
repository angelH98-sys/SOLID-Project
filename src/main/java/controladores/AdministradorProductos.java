package controladores;

import interfaces.ServicioProductos;
import lombok.Getter;
import lombok.Setter;
import modelos.Productos;

import java.util.ArrayList;
import java.util.List;

public class AdministradorProductos implements ServicioProductos {

    @Setter @Getter
    private List<Productos> productosAlmacenados = new ArrayList<>();

    @Override
    public void agregarProducto(Productos producto) {
        //TODO: el producto debe settearse el ID
        this.productosAlmacenados.add(producto);
    }

    @Override
    public void modificarProducto(Productos producto) {
        //TODO: logica para modificar producto
        return;
    }

    @Override
    public void deshabilitarProducto(String productoid) {
        //TODO: logica para modificar producto
        return;
    }
}
