package Vistas;

import modelos.*;

import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {

    private Ventas venta1 = new Ventas();
    private Scanner scanner = new Scanner(System.in);

    public String menuPrincipal() throws InterruptedException, IOException {

        String opcion = "";
        String siguienteProceso = "";
        boolean finMenu = false;

        System.out.println("Menu Principal");
        System.out.println("----------------------------------------");
        do
        {
            try {
                System.out.println("\t¡Bienvenido!");
                System.out.println("Selecciona una opción:");
                /*System.out.println("1. Administrar productos");
                System.out.println("2. Administrar empleados");
                System.out.println("3. Administrar clientes");
                System.out.println("\n4. Crear venta");
                System.out.println("5. Crear compra");
                System.out.println("\n6. Finalizar ejecucion");*/
                System.out.println("1. Crear venta");
                System.out.println("2. Finalizar ejecucion");

                opcion = this.scanner.nextLine();

                //if(Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 7){
                if(Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 2){
                    System.out.print("\nPor favor, ingresa una opción válida");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(500);
                    continue;
                }

                switch (opcion)
                {
                    /*case "1"://Administrar productos
                        siguienteProceso = "administrarProductos";
                        break;
                    case "2"://Administrar empleados
                        siguienteProceso = "administrarEmpleados";
                        break;
                    case "3"://Administrar clientes
                        siguienteProceso = "administrarClientes";
                        break;
                    case "4"://Crear venta
                        siguienteProceso = "nuevaVenta";
                        break;
                    case "5"://Crear compra
                        siguienteProceso = "nuevaCompra";
                        break;
                    case "6"://Finalizar ejecucion
                        siguienteProceso = "finEjecucion";
                        System.out.println("\nGracias por preferirnos...");
                        break;*/
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
                System.out.print("\nPor favor, ingresa una opción válida");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(500);
            }
        }while (finMenu == false);

        return  siguienteProceso;
    }

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
                    System.out.print("\nPor favor, ingresa una opción válida");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(500);
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
                System.out.print("\nPor favor, ingresa una opción válida");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(500);
            }
        }while (finMenu == false);

        return siguienteProceso;
    }

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

                opcion = this.scanner.nextLine();

                if(Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 5){
                    System.out.print("\nPor favor, ingresa una opción válida");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(500);
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
                System.out.print("\nPor favor, ingresa una opción válida");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(500);
            }
        }while (finMenu == false);

        return siguienteProceso;
    }

    public String administrarClientes() throws InterruptedException {

        String opcion = "";
        String siguienteProceso = "";
        boolean finMenu = false;

        System.out.println("\nMenu Principal/Administrar Clientes");
        System.out.println("----------------------------------------");

        do
        {
            try{

                System.out.println("\n\t-> Administración de clientes\n");
                System.out.println("Selecciona una opción");
                System.out.println("1. Agregar cliente");
                System.out.println("2. Modificar cliente");
                System.out.println("3. Deshabilitar/Habilitar cliente");
                System.out.println("\n4. Salir a menu principal");
                System.out.println("5. Finalizar ejecucion");

                opcion = this.scanner.nextLine();

                if(Integer.parseInt(opcion) < 1 || Integer.parseInt(opcion) > 5){
                    System.out.print("\nPor favor, ingresa una opción válida");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(500);
                    continue;
                }

                switch (opcion)
                {
                    case "1"://Agregar Producto
                        siguienteProceso = "agregarCliente";
                        break;
                    case "2"://Modificar Producto
                        siguienteProceso = "modificarCliente";
                        break;
                    case "3"://Deshabilitar/Habilitar producto
                        siguienteProceso = "deshabilitarHabilitarCliente";
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
                System.out.print("\nPor favor, ingresa una opción válida");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(500);
            }
        }while (finMenu == false);

        return siguienteProceso;
    }

}
