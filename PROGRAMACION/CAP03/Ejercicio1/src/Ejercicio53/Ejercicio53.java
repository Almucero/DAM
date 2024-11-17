package Ejercicio53;

import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la figura: ");
        int altura = sc.nextInt();

        for (int i = altura; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
