package Ejercicio52;

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        long numero = sc.nextLong();

        if (numero < 10) {
            System.out.println("El número resultado es " + numero + ".");
        } else {
            long divisor = 1;
            long temp = numero;
            while (temp > 9) {
                temp /= 10;
                divisor *= 10;
            }
            long desplazado = (numero % divisor) * 10 + temp;
            System.out.println("El número resultado es " + desplazado + ".");
        }

        sc.close();
    }
}
