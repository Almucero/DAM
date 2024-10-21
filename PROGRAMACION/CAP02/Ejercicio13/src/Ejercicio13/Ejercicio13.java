package Ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa ordena tres números introducidos por teclado.");
        System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int menor, medio, mayor;
        if (num1<=num2 && num1<=num3) {
            menor = num1;
            if (num2<=num3) {
                medio = num2;
                mayor = num3;
            }
            else {
                medio = num3;
                mayor = num2;
            }
        }
        else if (num2<=num1 && num2<=num3) {
            menor = num2;
            if (num1<=num3) {
                medio = num1;
                mayor = num3;
            }
            else {
                medio = num3;
                mayor = num1;
            }
        }
        else {
            menor = num3;
            if (num2<=num1) {
                medio = num2;
                mayor = num1;
            }
            else {
                medio = num1;
                mayor = num2;
            }
        }
        System.out.println("Los números introducido ordenados de menor a mayor son "+menor+", "+medio+" y "+mayor+".");
        scanner.close();
    }
}
