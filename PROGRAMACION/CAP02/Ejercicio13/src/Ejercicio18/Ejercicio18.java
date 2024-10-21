package Ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un número entero positivo (de 5 cifras como máximo): ");
        int num = Integer.parseInt(scanner.nextLine());
        if (num<0 || num>99999) {
            System.out.println("Por favor, introduzca un número positivo de hasta 5 cifras como máximo");
        }
        else {
            String numString = Integer.toString(num);
            char PrimerNumero = numString.charAt(0);
            System.out.println("La primer cifra del número introducido es el "+PrimerNumero+".");
        }
        scanner.close();
    }
}
