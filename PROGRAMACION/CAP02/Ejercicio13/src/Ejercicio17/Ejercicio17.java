package Ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero: ");
        int num = Integer.parseInt(scanner.nextLine());
        int UltimaCifra = Math.abs(num%10);
        System.out.println("La última cifra del número introducido es el "+UltimaCifra);
        scanner.close();
    }
}
