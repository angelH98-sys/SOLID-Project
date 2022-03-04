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

    @java.lang.Override
    public void proveedoresPorDefecto() {
        //Setting proveedores por defecto
        this.proveedoresRegistrados.add(new Proveedores("CJR1837", "Ciclas Juan Ramon",
                        "+1 123 123 3234", "ciclicas@mail.com"));
        administradorProveedores
                .agregarProveedor(new Proveedores("AT18272", "Accesorios Tito",
                        "+503 2938 2038", "tito@mail.com"));
        administradorProveedores
                .agregarProveedor(new Proveedores("SS29383", "Suma Salud",
                        "+1 123 123 3234", "salud@mail.com"));

    }
}
