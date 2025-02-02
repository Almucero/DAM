package Ejercicio16;

import java.util.HashMap;

public class Ejercicio16 {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();

        diccionario.put("España", "Madrid");
        diccionario.put("Portugal", "Lisboa");
        diccionario.put("Francia", "París");

        String input="", pais="", capital="";
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = System.console().readLine();
            if (diccionario.containsKey(pais)) {
                System.out.println("La capital de "+pais+" es "+diccionario.get(pais));
            }
            else {
                System.out.print("No conozco la respuesta ¿cuál es la capital de "+pais+"?: ");
                capital = System.console().readLine();
                diccionario.put(pais, capital);
                System.out.println("Gracias por enseñarme nuevas capitales");
            }
        } while (input!="salir");
    } 
}