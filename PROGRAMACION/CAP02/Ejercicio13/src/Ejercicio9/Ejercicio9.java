package Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de segundo grado.");
        System.out.println("ax^2 + bx + c = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Por favor, introduzca el valor de b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Por favor, introduzca el valor de c: ");
        double c = Double.parseDouble(scanner.nextLine());
        if (a==0 && b==0 && c==0) {
            System.out.println("La ecuación tiene infinitas soluciones.");
        }
        else if (a==0 && b==0) {
            System.out.println("La ecuación no tiene solución.");
        }
        else {
            double Raiz = b*b - 4*a*c;
            if (Raiz > 0) {
                double x1 = (-b + Math.sqrt(Raiz)) / (2*a);
                double x2 = (-b - Math.sqrt(Raiz)) / (2*a);
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
            else if (Raiz==0) {
                double x = -b / (2*a);
                System.out.println("x = "+x);
            }
            else {
                System.out.println("La ecuación no tiene soluciones reales");
            }
        }
        scanner.close();
    }
}