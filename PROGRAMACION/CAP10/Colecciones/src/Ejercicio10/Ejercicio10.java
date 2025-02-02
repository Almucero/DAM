package Ejercicio10;

import java.util.HashMap;

public class Ejercicio10 {
    public static int menu() {
        System.out.print("""
            \n1. Traducir
            2. Salir
            """);
        System.out.print("Introduzca una opción: ");
        int opcion=0;
        try {
            opcion = Integer.parseInt(System.console().readLine());
        }
        catch (Exception e) {
            System.out.println("Por favor, introduzca un valor válido\n");
        }
        return opcion;
    }
    public static void main(String[] args) {
        HashMap<String, String> traductor = new HashMap<String, String>();

        traductor.put("perro", "dog");
        traductor.put("gato", "cat");
        traductor.put("aguila", "eagle");
        traductor.put("coche", "car");
        traductor.put("ave", "bird");
        traductor.put("anfibio", "anphibian");
        traductor.put("nautilo", "nautilus");
        traductor.put("dictadura", "dictatorship");
        traductor.put("donante", "donor");
        traductor.put("dios", "god");
        traductor.put("maldición", "curse");
        traductor.put("meteorito", "meteorite");
        traductor.put("estrella", "star");
        traductor.put("agujero negro", "black hole");
        traductor.put("bomba", "bomb");
        traductor.put("torre", "tower");
        traductor.put("quemar", "burn");
        traductor.put("lluvia", "rain");
        traductor.put("bosque", "forest");
        traductor.put("infierno", "hell");

        int opcion=0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca una palabra en español: ");
                    String palabra = System.console().readLine();
                    if (traductor.containsKey(palabra)) {
                        System.out.println(palabra+" en inglés significa "+traductor.get(palabra));
                    }
                    else {
                        try {
                            throw new NotInDictionayException();
                        } catch (NotInDictionayException e) {
                            System.out.println("Esa palabra no está en el diccionario");
                        }
                    }
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        } while (opcion!=2);
    }
}