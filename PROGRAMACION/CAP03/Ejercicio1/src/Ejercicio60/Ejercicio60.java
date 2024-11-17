package Ejercicio60;

import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca la altura de los calcetines: ");
        int altura = scanner.nextInt();
        
        for (int i = 0; i < altura - 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.print("    ");
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.print("*");
        }
        System.out.print(" ");
        for (int i = 0; i < 6; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
