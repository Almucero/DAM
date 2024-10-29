package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("VOLUMEN DE UN TOIDE");
        System.out.println("===================");
        System.out.print("Introduzca el radio mayor (cms): ");
        double R = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el radio menor (cms): ");
        double r = Double.parseDouble(System.console().readLine());
        final double pi = 3.1416;
        double volumen = 2 * pi * pi * R * r * r;
        System.out.printf("El volumen del toroide es de %.4f cm3", volumen);
        scanner.close();
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}