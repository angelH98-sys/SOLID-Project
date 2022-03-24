package Vistas;

import Helpers.IngresarOpcionValida;

import java.util.Scanner;

public class MenuPrincipal {

    private Scanner scanner = new Scanner(System.in);

    public String menuPrincipal() throws InterruptedException{

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
                finMenu = true;
            } catch (Exception e) {
                IngresarOpcionValida.imprimir();
            }
        }while (finMenu == false);
        return  siguienteProceso;
    }

}