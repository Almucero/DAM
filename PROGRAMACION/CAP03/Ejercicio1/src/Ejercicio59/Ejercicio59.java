package Ejercicio59;

import java.util.Scanner;

public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca la altura del árbol: ");
        int altura = scanner.nextInt();
        
        for (int i = 0; i < altura - 1; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("^");
            }
            System.out.println();
        }
        
        for (int i = 0; i < altura - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("Y");
    }
}
