package interfaces;

import modelos.Productos;

public interface ServicioProductos {

    void agregarProducto(Productos producto);
    void modificarProducto(Productos producto);
    void deshabilitarProducto(String productoid);
    void ProductosPorDefecto();
}
