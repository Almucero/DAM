package Ejercicio69;

import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int altura = scanner.nextInt();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("******");
            if (i % 2 == 0) {
                System.out.print("    ");
                System.out.print("******");
            }
            System.out.println();
            for (int j = 0; j < altura - i - 2; j++) {
                System.out.print(" ");
            }
        }
    }
}
