package Ejercicio68;

import java.util.Scanner;

public class Ejercicio68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, introduzca un número: ");
        long numero = scanner.nextLong();
        
        long resultado = 0;
        long multiplicador = 1;
        
        while (numero > 0) {
            int digito = (int) (numero % 10);
            if (digito % 2 == 0) {
                digito += 1;
            } else {
                digito -= 1;
            }
            resultado += digito * multiplicador;
            multiplicador *= 10;
            numero /= 10;
        }
        
        System.out.println("Dislocando el número sale el " + resultado);
    }
}
