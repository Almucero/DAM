package Ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < -9999 || num > 9999) {
                System.out.println("Por favor, introduzca un número de como máximo 5 cifras");
            }
            else {
                int cifras = Integer.toString(Math.abs(num)).length();
                System.out.println("El número introducido tiene "+cifras+" cifras.");
            }
        }
        catch (Exception e) {
            System.out.println("Por favor, introduzca un valor válido");
        }
        scanner.close();
    }
}