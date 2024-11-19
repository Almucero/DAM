package Ejercicio22;

public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 2 y 100:");
        for (int num=2; num<=100; num++) {
            boolean esPrimo=true;
            int contador=2;
            while (esPrimo && contador<=num/2) {
                if (num%contador==0) {
                    esPrimo=false;
                }
                contador++;
            }
            if (esPrimo) {
                System.out.print(num+" ");
            }
        }
    }
}