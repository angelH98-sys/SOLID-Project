package interfaces;

import modelos.Proveedores;

public interface ServicioProveedores {

    void agregarProveedor(Proveedores proveedor);
    void modificarProveedor(Proveedores proveedor);
    void deshabilitarProveedor(String proveedorId);
    void proveedoresPorDefecto();
}
