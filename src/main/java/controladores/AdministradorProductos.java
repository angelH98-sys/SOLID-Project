package controladores;

import interfaces.ServicioProductos;
import lombok.Getter;
import lombok.Setter;
import modelos.Productos;

import java.util.ArrayList;
import java.util.List;

public class AdministradorProductos implements ServicioProductos {

    @Setter @Getter
    private List<Productos>  = new ArrayList<>();

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
    @java.lang.Override
    public void ProductosPorDefecto(){
        this.productosAlmacenados.add(new Productos("BIC28371", "Bicicleta", "CJR1837"));

    }
}
