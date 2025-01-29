package Ejercicio2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int suma=0;
        int valorMaximo = Integer.MIN_VALUE;
        int valorMinimo = Integer.MAX_VALUE;
        int capacidad = (int)(Math.random()*(20-10+1)+10);

        for (int i=0; i<capacidad; i++) {
            int valor = (int)(Math.random()*(100)+1);
            numeros.add(valor);
            suma += valor;
            if (valor>valorMaximo) {
                valorMaximo=valor;
            }
            if (valor<valorMinimo) {
                valorMinimo=valor;
            }
        }
        System.out.println(numeros);
        System.out.printf("""
            Suma: %d
            Media: %.2f
            Mínimo: %d
            Máximo: %d
            """, suma, (double)suma/capacidad, valorMinimo, valorMaximo);
    }
}