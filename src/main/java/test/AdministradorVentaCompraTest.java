package test;

import controladores.AdministradorProductos;
import controladores.AdministradorVentaCompra;
import modelos.Productos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorVentaCompraTest{

    @Test
    void verificarExistenciasBicicletasGamaMedia(){

        //El controlador de AdministradorVentaCompra, en su flujo de trabajo,
        //t0do comienza por el metodo ejecutarVenta, a este metodo se le pasa como parametro
        //la lista de todos los productos disponibles y este settea el atributo que existe en la clase.
        //lo puedes ver en la linea 38 del archivo AdministradorVentaCompra.java
        AdministradorVentaCompra  venta = new AdministradorVentaCompra();

        //Para este caso, no ejecutamos ese metodo debido a que involucra
        //interacciones con el usuario desde la consola
        //Por ende, debemos de abastecer el atributo listaProductos "manualmente"

        AdministradorProductos producto = new AdministradorProductos();
        producto.agregarProductosPorDefecto();

        venta.setListaProductos(producto.getProductosAlmacenados());

        //Ahora, para la funcionalidad perse de agregar productos a la orden se invoca
        //el metodo agregarProductoAOrden es el encargado de interactuar con
        //el usuario desde la consola mientras agrega los n productos que desea
        //Este pide 2 datos al cliente desde la consola: el id y la cantidad

        //Para validar que el id sea valido, puedes usar el metodo:esValidoProductoId
        //Este metodo te solicitara que le pases como parametro el ID que quieres que valide
        //Este metodo es true o false (te recomiendo ojear el metodo, lo deje comentado)

        //Asi mismo, para validar que la cantidad sea valida, puedes usar:esValidaCantidad
        //Este metodo te solicitara que le pases como parametro:
        //  -el id del producto: importante que te cerciores que sea un ID valido
        //  -la cantidad que deseas validar
        //Este metodo es igual de true o false


        //Ahora, tambien podrias hacer uno para el metodo crearComprobanteDePago
        //Si te devuelve una ruta, es porque se creo correctamente
        //Si te devuelve un null, es porque fallo algo

    }
}