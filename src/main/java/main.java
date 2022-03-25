import Helpers.Log;
import Helpers.clearScreen;

import java.io.IOException;
import java.util.logging.Level;

import static controladores.MenuController.ejecutarSiguienteProceso;
import static controladores.MenuController.menuProductos;

public class main {

    public static void main(String[] args) throws InterruptedException, IOException {

        Log.createLogger("log");
        Log.logger.log(Level.INFO, "Inicio de ejecucion");

        menuProductos.agregarProductosPorDefecto();
        String siguienteProceso = "menuPrincipal";

        do
        {
            siguienteProceso = ejecutarSiguienteProceso(siguienteProceso);
        }while (siguienteProceso != "finEjecucion");
        Log.logger.log(Level.INFO, "Fin ejecucion");
    }
}