import Helpers.clearScreen;

import java.io.IOException;

import java.util.logging.Level;

import static controladores.MenuController.ejecutarSiguienteProceso;
import static controladores.MenuController.menuProductos;

public class main {

    public static void main(String[] args) throws InterruptedException, IOException {
        menuProductos.agregarProductosPorDefecto();
        String siguienteProceso = "menuPrincipal";
        System.out.println("Mensaje para borrar");
        Thread.sleep(2000);
        clearScreen.borrarConsola();
        System.out.println("Mensaje para borrar");
        clearScreen.borrarConsola();



        do
        {
            siguienteProceso = ejecutarSiguienteProceso(siguienteProceso);
        }while (siguienteProceso != "finEjecucion");
    }
}