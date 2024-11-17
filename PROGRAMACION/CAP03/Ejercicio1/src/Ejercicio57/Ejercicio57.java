package Ejercicio57;

import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca la altura de la figura: ");
        int altura = scanner.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + 2 * i; j++) {
                if (j == 0 || j == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
