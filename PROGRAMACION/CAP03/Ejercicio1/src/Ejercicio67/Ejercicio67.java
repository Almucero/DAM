package Ejercicio67;

import java.util.Scanner;

public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca el número de escalones: ");
        int escalones = scanner.nextInt();
        System.out.print("Introduzca la altura de cada escalón: ");
        int altura = scanner.nextInt();
        
        for (int i = 0; i < escalones; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < altura; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
