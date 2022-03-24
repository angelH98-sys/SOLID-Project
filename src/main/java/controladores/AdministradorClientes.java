package controladores;

import interfaces.ServicioClientes;
import interfaces.ServicioCompradores;
import lombok.Getter;
import lombok.Setter;
import modelos.Clientes;
import modelos.Compradores;

import java.util.ArrayList;
import java.util.List;

public class AdministradorClientes implements ServicioClientes {

    @Setter @Getter
    private List<Clientes> clientesRegistrados = new ArrayList<>();

    @Override
    public void agregarClientes(Clientes cliente) {
        //TODO: el producto debe settearse el ID
        this.clientesRegistrados.add(cliente);
    }

    @Override
    public void agregarClientesPorDefecto() {
        clientesRegistrados.add(new Clientes("RMJ1234","Rosa Maria Juarez", "rosa@mail.com"));
        clientesRegistrados.add(new Clientes("EF12342","Ernesto Fernandez", "ernesto@mail.com"));
        clientesRegistrados.add(new Clientes("MAO1323","Matias Alejandro Olmedo", "matias@mail.com"));
    }
}
