package interfaces;

import modelos.Compradores;

public interface ServicioCompradores {

    void agregarComprador(Compradores comprador);
    void modificarComprador(Compradores comprador);
    void deshabilitarComprador(String compradorId);
    void compradoresPorDefecto();
}
