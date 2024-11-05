package Ejercicio24;

public class Ejercicio24 {
    public static void main(String[] args) {
        int altura=10;
        for (int fila=1; fila<=altura; fila++) {
            for (int espacios=1; espacios<=(altura-fila); espacios++) {
                System.out.print("  ");
            }
            for (int num=1; num<=fila; num++) {
                System.out.printf("%d ", num);
            }
            for (int num=fila-1; num>=1; num--) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}
/**
 * package Ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {
    
    private static String pintarPiramideInterior(int fila, int digitos) {
        StringBuilder resultado = new StringBuilder();
        int valor = 1;
        for (int i = 1; i <= 2 * fila - 1; i++) {
            resultado.append(String.format("%" + digitos + "d ", valor));
            if (i > (2 * fila - 1) / 2) {
                valor--;
            } else {
                valor++;
            }
        }
        return resultado.toString();
    }

    private static String espacios(int fila, int altura, int digitos) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 1; i <= altura - fila; i++) {
            resultado.append(String.format("%" + digitos + "s ", ""));
        }
        return resultado.toString();
    }

    private static int longitud(int valor) {
        return ("" + valor).length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la pirámide: ");
        int altura = scanner.nextInt();
        int digitos = longitud(altura);

        for (int i = 1; i <= altura; i++) {
            System.out.printf("%s%s%n", espacios(i, altura, digitos), pintarPiramideInterior(i, digitos));
        }

        scanner.close();
    }
}

 */