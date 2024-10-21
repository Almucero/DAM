package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
        int hora = Integer.parseInt(scanner.nextLine());
        switch (hora) {
            case 6,7,8,9,10,11,12:
                System.out.println("Buenos días");
                break;
            case 13,14,15,16,17,18,19,20:
                System.out.println("Buenas tardes");
                break;
            case 21,22,23,24,1,2,3,4,5:
                System.out.println("Buenas noches");
                break;
            default:
                System.out.println("Introduzca un valor válido");
                break;
        }
        scanner.close();
    }
}