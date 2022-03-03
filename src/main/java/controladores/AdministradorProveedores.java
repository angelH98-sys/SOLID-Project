package controladores;

import interfaces.ServicioProveedores;
import lombok.Getter;
import lombok.Setter;
import modelos.Proveedores;

import java.util.ArrayList;
import java.util.List;

public class AdministradorProveedores implements ServicioProveedores {

    @Setter @Getter
    private List<Proveedores> proveedoresRegistrados = new ArrayList<>();

    @Override
    public void agregarProveedor(Proveedores proveedor) {
        //TODO: el producto debe settearse el ID
        this.proveedoresRegistrados.add(proveedor);
    }

    @Override
    public void modificarProveedor(Proveedores proveedor) {
        //TODO: logica para modificar proveedor
        return;
    }

    @Override
    public void deshabilitarProveedor(String proveedorId) {
        //TODO: logica para modificar proveedor
        return;
    }
}
