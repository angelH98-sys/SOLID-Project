package Helpers;

public class clearScreen {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}