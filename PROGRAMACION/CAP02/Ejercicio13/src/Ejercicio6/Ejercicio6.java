package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        final double g = 9.81;
        System.out.println("Cálculo del tiempo de caida de un objeto.");
        System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        double h = Double.parseDouble(scanner.nextLine());
        if (h < 0) {
            System.out.println("La altura no puede ser negatriva");
        }
        else {
            double t = Math.sqrt(2 * h / g);
            System.out.println("El objeto tarda "+ t + " segundos en caer");
        }
        scanner.close();
    }
}