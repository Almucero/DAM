package Ejercicio54;

import java.util.Scanner;

public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la figura: ");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            if (i == 0) {
                for (int j = 0; j < altura; j++) {
                    System.out.print("*");
                }
            } else if (i == altura - 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 0; j < altura - i - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
