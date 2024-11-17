package Ejercicio62;

import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();
        
        boolean afortunado = true;
        while (numero > 0) {
            int digito = numero % 10;
            if (digito != 3 && digito != 0 && digito != 1 && digito != 2 && digito != 4 && digito != 5 && digito != 6) {
                afortunado = false;
                break;
            }
            numero /= 10;
        }
        
        if (afortunado) {
            System.out.println("El número es afortunado.");
        } else {
            System.out.println("El número no es afortunado.");
        }
    }
}
