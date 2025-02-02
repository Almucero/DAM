package Ejercicio11;

import java.util.ArrayList;
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

        int opcion=0, respuestasCorrectas=0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    String[] palabras = traductor.keySet().toArray(new String[0]);
                    ArrayList<Integer> indicesSeleccionados = new ArrayList<Integer>();
                    while (indicesSeleccionados.size()<5) {
                        int indiceAleatorio = (int)(Math.random()*palabras.length);
                        if (!indicesSeleccionados.contains(indiceAleatorio)) {
                            indicesSeleccionados.add(indiceAleatorio);
                        }
                    }
                    System.out.println("Traduce las siguientes palabras al inglés: ");
                    for (int i=0; i<5; i++) {
                        int indice = indicesSeleccionados.get(i);
                        String palabraEspaniol = palabras[indice];
                        String traduccion = traductor.get(palabraEspaniol);
                        System.out.print(palabraEspaniol+": ");
                        String respuesta = System.console().readLine();
                        if (respuesta.equalsIgnoreCase(traduccion)) {
                            System.out.println("¡Correcto!");
                            respuestasCorrectas++;
                        }
                        else {
                            System.out.println("Error. La respuesta correcta es: "+traduccion);
                        }
                    }
                    System.out.println("Has acertado "+respuestasCorrectas+" de 5 palabras");
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        } while (opcion!=2);
    }
}