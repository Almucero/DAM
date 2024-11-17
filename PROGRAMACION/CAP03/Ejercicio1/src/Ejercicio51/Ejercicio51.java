package Ejercicio51;

import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero (mayor que cero): ");
        long numero = sc.nextLong();
        long original = numero;
        long resultado = 0;
        long multiplicador = 1;
        boolean comido = false;

        while (numero > 0) {
            long digito = numero % 10;
            if (digito != 0 && digito != 8) {
                resultado += digito * multiplicador;
                multiplicador *= 10;
            } else {
                comido = true;
            }
            numero /= 10;
        }

        if (comido) {
            System.out.println("Después de haber sido comido por el gusano numérico se queda en " + resultado + ".");
        } else {
            System.out.println("El gusano numérico no se ha comido ningún dígito.");
        }

        sc.close();
    }
}
