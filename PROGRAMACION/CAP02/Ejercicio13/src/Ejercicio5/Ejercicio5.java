package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Por favor, introduzca el valor de b: ");
        double b = Double.parseDouble(scanner.nextLine());
        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        } else {
            System.out.println("La solución es: x = " + (-b / a));
        }
        scanner.close();
    }
}