import Helpers.clearScreen;

import java.io.IOException;

import static controladores.MenuController.ejecutarSiguienteProceso;
import static controladores.MenuController.menuProductos;

public class main {

    public static void main(String[] args) throws InterruptedException, IOException {
        menuProductos.agregarProductosPorDefecto();
        String siguienteProceso = "menuPrincipal";

        do
        {
            siguienteProceso = ejecutarSiguienteProceso(siguienteProceso);
        }while (siguienteProceso != "finEjecucion");
    }
}