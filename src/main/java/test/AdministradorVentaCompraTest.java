package test;

import controladores.AdministradorProductos;
import controladores.AdministradorVentaCompra;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AdministradorVentaCompraTest{
    @Test
    void verificarIdEsValidoProductoRepuesto() {
        //Valida si el Id ingresado esta dentro de la lista de Productos
        AdministradorVentaCompra venta  = new AdministradorVentaCompra();
        AdministradorProductos producto = new AdministradorProductos();
        producto.agregarProductosPorDefecto();
        venta.setListaProductos(producto.getProductosAlmacenados());
       //Generando Test
        assertTrue(venta.esValidoProductoId("REP39481"),"Resultado Esperado");
    }

    @Test
    void verificarIdEsValidoProductoBicicletaProfesional() {
        //Valida si el Id ingresado esta dentro de la lista de Productos
        AdministradorVentaCompra venta  = new AdministradorVentaCompra();
        AdministradorProductos producto = new AdministradorProductos();
        producto.agregarProductosPorDefecto();
        venta.setListaProductos(producto.getProductosAlmacenados());
        //Generando Test
        assertFalse(venta.esValidoProductoId("BIC95000"));
    }

    @Test
    void verificarCantidadValidaBicicletaProfesional(){
    //Verifica que la cantidad sea Ingresada sea valida
    //Este metodo te solicita que le coloque como parametro:
    //Id del producto a verificar(el ID tiene que ser valido)
    //Cantidad que deseas validar(Tiene que estar dentro del stock actual del producto)
    //Este metodo devuelve true o false según el caso
        AdministradorVentaCompra venta  = new AdministradorVentaCompra();
        AdministradorProductos producto = new AdministradorProductos();
        producto.agregarProductosPorDefecto();
        venta.setListaProductos(producto.getProductosAlmacenados());

        //Generando Test
        assertTrue(venta.esValidaCantidad("BIC95686","3"),"Resultado Esperado");
        }

    @Test
    void verificarCantidadValidaCascoProfesional(){
        //Verifica que la cantidad sea Ingresada sea valida
        //Este metodo te solicita que le coloque como parametro:
        //Id del producto a verificar(el ID tiene que ser valido)
        //Cantidad que deseas validar(Tiene que estar dentro del stock actual del producto)
        //Este metodo devuelve true o false según el caso
        AdministradorVentaCompra venta  = new AdministradorVentaCompra();
        AdministradorProductos producto = new AdministradorProductos();
        producto.agregarProductosPorDefecto();
        venta.setListaProductos(producto.getProductosAlmacenados());

        //Generando Test
        assertTrue(venta.esValidaCantidad("CP578423","10"),"Resultado Esperado");
    }
    @Test
    void verificarCantidadValidaEquipoDeProteccion(){
        //Verifica que la cantidad sea Ingresada sea valida
        //Este metodo te solicita que le coloque como parametro:
        //Id del producto a verificar(el ID tiene que ser valido)
        //Cantidad que deseas validar(Tiene que estar dentro del stock actual del producto)
        //Este metodo devuelve true o false según el caso
        AdministradorVentaCompra venta  = new AdministradorVentaCompra();
        AdministradorProductos producto = new AdministradorProductos();
        producto.agregarProductosPorDefecto();
        venta.setListaProductos(producto.getProductosAlmacenados());

        //Generando Test
        assertTrue(venta.esValidaCantidad("EDP23938","4"),"Resultado Esperado");
    }


}