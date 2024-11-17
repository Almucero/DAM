package Ejercicio63;

import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int altura1 = scanner.nextInt();
        System.out.print("Introduzca la altura de la segunda pirámide: ");
        int altura2 = scanner.nextInt();
        
        for (int i = 0; i < altura1; i++) {
            for (int j = 0; j < altura1 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = 0; j < 2 * (altura2 - i - 1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
