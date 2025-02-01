package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            System.out.printf("Introduzca el número en la posición %d de la lista: ", i+1);
            int num = Integer.parseInt(System.console().readLine());
            numeros.add(num);
        }
        System.out.println("Número sin ordenar: "+numeros);
        Collections.sort(numeros);
        System.out.println("Número después de ordenar: "+numeros);
    }
}