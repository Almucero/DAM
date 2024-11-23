Escribe un programa que pida un número por teclado y que luego lo “disloque” de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si es impar. Usa long en lugar de int donde sea necesario para admitir números largos.

Ejemplo 1:
Por favor, introduzca un número: 9402
Dislocando el 9402 sale el 8513.

Ejemplo 2:
Por favor, introduzca un número: 870958422
Dislocando el 870958422 sale el 961849533.

Ejemplo 3:
Por favor, introduzca un número: 137
Dislocando el 137 sale el 26





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