package Vistas;

import controladores.AdministradorProductos;
import modelos.*;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static Helpers.clearScreen.clearScreen;


public class MenuPrincipal {
    private Sell venta1 = new Sell();
    public void MenuInicial (List<Productos>listaProductos){
        System.out.println("---------------------//--------------------");
        System.out.println("Productos en carrito: "+ venta1.getListaOrden().size()+" producto(s) ");
        System.out.println("Subtotal: $ "+venta1.getTotal());

        System.out.println("---------------------//--------------------");
        for(int i=0; i<listaProductos.size();i++){
            System.out.println((i+1)+" "+listaProductos.get(i).getNombre()+" $ " +listaProductos.get(i).getValorUnitario());
        }
        System.out.println((listaProductos.size()+1) + " Pagar");
        System.out.println((listaProductos.size()+2) + " Salir");

    }


    public void menu(List<Productos>listaProductos) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int option;
        int cantidad=0;
        System.out.println("Bienvenido! \nComo le podemos ayudar?\n");
        do {
            MenuInicial(listaProductos);

            try {
                System.out.println("Seleccione una opcion: ");
                option = input.nextInt();
                if (option>=1 && option<=listaProductos.size()){
                    System.out.println("Digita la cantidad que deseas comprar: ");
                    cantidad = input.nextInt();
                    if (cantidad>=1){
                        clearScreen();
                        venta1.agregarProductoOrden(listaProductos.get(option-1), cantidad);
                        System.out.println("Nuevo producto agregado!");
                        Thread.sleep(2000);
                        clearScreen();
                    } else {
                        System.out.println("Por favor ingresa una cantidad valida");
                    }

                }else if(option==(listaProductos.size()+1)){
                    //Continuar a pagar;
                }else if(option==(listaProductos.size()+2)){
                    System.out.println("Gracias, vuelva pronto");
                }
                else{
                    clearScreen();
                    System.out.println("La opcion no es valida. Por favor ingrese una opcion de nuevo.");
                    Thread.sleep(3000);
                    clearScreen();
                }


               /* switch (option){
                    case 1:
                        //send to bicicletas menu
                        break;
                    case 2:
                        //send to quipos de proteccion menu
                        break;
                    case 3:
                        //Send to repuestos
                        break;
                    case 4:
                        break;
                    case 5:
                        //if product on cart then move to checkout menu, else continue
                        continue;
                    default:
                        clearScreen();
                        System.out.println("La opcion no es valida. Por favor ingrese una opcion de nuevo.");
                        Thread.sleep(3000);
                        clearScreen();
                } */
            }catch (InputMismatchException e){
                System.out.println("Debes ingresar un numero valido");
                option = input.nextInt();
            }

        } while (option != (listaProductos.size()+2));
    }
}
