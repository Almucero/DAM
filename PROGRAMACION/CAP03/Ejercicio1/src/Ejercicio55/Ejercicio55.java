package Ejercicio55;

import java.util.Scanner;

public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        long numero = scanner.nextLong();
        
        if (numero < 10) {
            System.out.println("El número resultado es " + numero + ".");
        } else {
            long divisor = 1;
            long copia = numero;
            
            while (copia >= 10) {
                divisor *= 10;
                copia /= 10;
            }
            
            long primerDigito = numero / divisor;
            long resto = numero % divisor;
            long resultado = resto * 10 + primerDigito;
            
            System.out.println("El número resultado es " + resultado + ".");
        }
    }
}
