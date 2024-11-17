package Ejercicio50;

import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura (5 como mínimo): ");
        int altura = sc.nextInt();
        if (altura < 5) altura = 5;

        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
        int espacios = sc.nextInt();
        if (espacios < 1) espacios = 1;

        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura / 2 || i == altura - 1) {
                System.out.print("*");
                for (int j = 0; j < 4; j++) System.out.print("*");
            } else if (i < altura / 2) {
                System.out.print("*");
                for (int j = 0; j < 4; j++) System.out.print(" ");
            } else {
                System.out.print(" ");
                for (int j = 0; j < 4; j++) System.out.print(" ");
            }
            for (int k = 0; k < espacios; k++) System.out.print(" ");
            if (i == 0 || i == altura / 2 || i == altura - 1) {
                System.out.print("****");
            } else {
                System.out.print("*");
            }
            for (int k = 0; k < espacios; k++) System.out.print(" ");
            if (i == 0 || i == altura / 2 || i == altura - 1) {
                System.out.print("****");
            } else {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
