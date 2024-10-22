package Ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 0) {
                System.out.println("El número debe ser de postivo");
            }
            else if (num > 9999) {
                System.out.println("El número debe ser de como máximo 5 cifras");
            }
            else {
                String numString = Integer.toString(num);
                String numInvertido = new StringBuilder(numString).reverse().toString();
                if (numString.equals(numInvertido)) {
                    System.out.println("El número introducido es capicúa");
                }
                else {
                    System.out.println("El número introducdo no es capicúa");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
        scanner.close();
    }
}
