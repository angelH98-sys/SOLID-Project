package Vistas;

import Helpers.IngresarOpcionValida;
import controladores.AdministradorProductos;

import java.util.Scanner;

public class MenuAdministrarProductos extends AdministradorProductos {
    private Scanner scanner = new Scanner(System.in);

    public String administrarProductos() throws InterruptedException {
        String opcion = "";
        String siguienteProceso = "";
        boolean finMenu = false;

        System.out.println("\nMenu Principal/Administrar Productos");
        System.out.println("----------------------------------------");

        do
        {
            try{

                System.out.println("\n\t-> Administración de productos\n");
                System.out.println("Selecciona una opción");
                System.out.println("1. Agregar producto");
                System.out.println("2. Modificar producto");
                System.out.println("3. Deshabilitar/Habilitar producto");
                System.out.println("\n4. Salir a menu principal");
                System.out.println("5. Finalizar ejecucion");

                opcion = this.scanner.nextLine();

                if(Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 5){
                    IngresarOpcionValida.imprimir();
                    continue;
                }

                switch (opcion)
                {
                    case "1"://Agregar Producto
                        siguienteProceso = "agregarProducto";
                        break;
                    case "2"://Modificar Producto
                        siguienteProceso = "modificarProducto";
                        break;
                    case "3"://Deshabilitar/Habilitar producto
                        siguienteProceso = "deshabilitarHabilitarProducto";
                        break;
                    case "4"://Salir a menu principal
                        siguienteProceso = "menuPrincipal";
                        break;
                    case "5"://Salir
                        siguienteProceso = "finEjecucion";
                        System.out.println("\nGracias por preferirnos...");
                        break;
                }

                finMenu = true;
            }catch (Exception e)
            {
                IngresarOpcionValida.imprimir();
            }
        }while (finMenu == false);
        scanner.close();
        return siguienteProceso;

    }
}
