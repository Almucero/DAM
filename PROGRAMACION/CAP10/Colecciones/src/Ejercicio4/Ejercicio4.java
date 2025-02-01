package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<String>();
        for (int i=0; i<10; i++) {
            System.out.printf("Introduzca el número en la posición %d de la lista: ", i+1);
            String palabra = System.console().readLine();
            palabras.add(palabra);
        }
        System.out.println("Número sin ordenar: "+palabras);
        Collections.sort(palabras);
        System.out.println("Número después de ordenar: "+palabras);
    }
}