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
    public void agregarProductosPorDefecto() {
        this.productosAlmacenados.add(new Productos("BIC15796", "Bicicleta Gama Baja", "CJR1837", 200.0, 10));
        this.productosAlmacenados.add(new Productos("BIC28371", "Bicicleta Gama Media", "CJR1837", 350.0, 14));
        this.productosAlmacenados.add(new Productos("BIC95686", "Bicicleta Profesional", "CJR1837", 500.0,6));
        this.productosAlmacenados.add(new Productos("EDP23938", "Equipos de proteccion", "AT18272", 40.0,5));
        this.productosAlmacenados.add(new Productos("CE589876", "Casco Entrenamiento", "CJR1837", 75.0,14));
        this.productosAlmacenados.add(new Productos("CP578423", "Casco Profesional", "CJR1837", 200.0,20));
        this.productosAlmacenados.add(new Productos("REP39481", "Repuestos - Neumatico", "CJR1837", 5.0,6));
        this.productosAlmacenados.add(new Productos("REP75426", "Repuestos - Cadena", "CJR1837", 15.0,3));

    }

}
