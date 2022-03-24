package Vistas;

import Helpers.IngresarOpcionValida;
import controladores.AdministradorEmpleados;

import java.util.Scanner;

public class MenuAdministrarEmpleados extends AdministradorEmpleados {
    private Scanner scanner = new Scanner(System.in);

    public String administrarEmpleados() throws InterruptedException {

        String opcion = "";
        String siguienteProceso = "";
        boolean finMenu = false;

        System.out.println("\nMenu Principal/Administrar Empleados");
        System.out.println("----------------------------------------");

        do
        {
            try{

                System.out.println("\n\t-> Administración de empleados\n");
                System.out.println("Selecciona una opción");
                System.out.println("1. Agregar empleado");
                System.out.println("2. Modificar empleado");
                System.out.println("3. Deshabilitar/Habilitar empleado");
                System.out.println("\n4. Salir a menu principal");
                System.out.println("5. Finalizar ejecucion");

                opcion = scanner.nextLine();

                if(Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 5){
                    IngresarOpcionValida.imprimir();
                    continue;
                }

                switch (opcion)
                {
                    case "1"://Agregar Empleado
                        siguienteProceso = "agregarEmpleado";
                        break;
                    case "2"://Modificar Empleado
                        siguienteProceso = "modificarEmpleado";
                        break;
                    case "3"://Deshabilitar/Habilitar empleado
                        siguienteProceso = "deshabilitarHabilitarEmpleado";
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
