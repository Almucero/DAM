package Ejercicio65;

import java.util.Scanner;

public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
        int altura = scanner.nextInt();
        
        if (altura < 3) {
            System.out.println("La altura introducida no es correcta.");
            return;
        }
        
        System.out.print("Introduzca la fila del palito horizontal (entre 2 y " + (altura - 1) + "): ");
        int fila = scanner.nextInt();
        
        if (fila < 2 || fila >= altura) {
            System.out.println("La fila introducida no es correcta.");
            return;
        }
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i > 0 && i < altura - 1) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            if (i == fila - 1) {
                for (int j = 0; j < (2 * i + 1); j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
