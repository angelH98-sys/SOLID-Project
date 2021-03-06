package Vistas;

import Helpers.IngresarOpcionValida;
import Helpers.Log;

import java.util.Scanner;
import java.util.logging.Level;

public class MenuPrincipal {

    private Scanner scanner = new Scanner(System.in);

    public String menuPrincipal() throws InterruptedException{

        Log.logger.log(Level.INFO, "Inicio menuPrincipal");

        String opcion = "";
        String siguienteProceso = "";
        boolean finMenu = false;

        System.out.println("\nMenu Principal");
        System.out.println("----------------------------------------");
        do{
            try {
                System.out.println("\t¡Bienvenido!");
                System.out.println("Selecciona una opción:");
                System.out.println("1. Crear venta");
                System.out.println("2. Finalizar ejecucion");

                opcion = this.scanner.nextLine();

                if(Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 2){
                    Log.logger.log(Level.WARNING, "Opcion de usuario:" + opcion + ", invalida");
                    IngresarOpcionValida.imprimir();
                    continue;
                }

                switch (opcion){
                    case "1"://Crear venta
                        siguienteProceso = "nuevaVenta";
                        break;
                    case "2"://Finalizar ejecucion
                        siguienteProceso = "finEjecucion";
                        System.out.println("\nGracias por preferirnos...");
                        break;
                }

                Log.logger.log(Level.FINE, "Opcion de usuario:" + opcion + ", " + siguienteProceso);
                finMenu = true;
            } catch (Exception e) {
                IngresarOpcionValida.imprimir();
            }
        }while (finMenu == false);
        Log.logger.log(Level.INFO, "Fin menuPrincipal");
        return  siguienteProceso;
    }

}