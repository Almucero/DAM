package Ejercicio58;

import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();
        
        int suma = 0;
        int contador = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
            contador++;
        }
        
        double media = (double) suma / contador;
        System.out.println("La media de sus dígitos es " + media);
    }
}
