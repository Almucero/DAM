package Ejercicio42;

public class Ejercicio42 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        for (int i=num; i<num+5; i++) {
            int contador=2;
            boolean esPrimo=true;
            while (esPrimo&&contador<=i/2) {
                if (i%contador==0) {
                    esPrimo=false;
                }
                contador++;
            }
            if (esPrimo) {
                System.out.printf(" %d es primo%n", i);
            }
            else {
                System.out.printf(" %d no es primo%n", i);
            }
        }
    }
}
