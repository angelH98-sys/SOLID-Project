package controladores;

import interfaces.ServicioCompradores;
import lombok.Getter;
import lombok.Setter;
import modelos.Compradores;
import modelos.Empleados;

import java.util.ArrayList;
import java.util.List;

public class OLISAdministradorCompradores implements ServicioCompradores {

    @Setter @Getter
    private List<Compradores> compradoresRegistrados = new ArrayList<>();
    @Override
    public void agregarComprador(Compradores comprador) {
        //TODO: el producto debe settearse el ID
        this.compradoresRegistrados.add(comprador);
    }

    @Override
    public void modificarComprador(Compradores comprador) {
//TODO: logica para modificar empleado
        return;
    }

    @Override
    public void deshabilitarComprador(String compradorId) {
//TODO: logica para modificar empleado
        return;
}
    @java.lang.Override
    public void compradoresPorDefecto(){
        this.compradoresRegistrados.add(new Compradores("RMJ1234","Rosa Maria Juarez", "rosa@mail.com"));
        administradorCompradores
                .agregarComprador(new Compradores("EF12342","Ernesto Fernandez", "ernesto@mail.com"));
        administradorCompradores
                .agregarComprador(new Compradores("MAO1323","Matias Alejandro Olmedo", "matias@mail.com"));

    }
}