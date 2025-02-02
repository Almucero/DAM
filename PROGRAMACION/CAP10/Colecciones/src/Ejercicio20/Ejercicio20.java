package Ejercicio20;

import java.util.HashMap;
import Ejercicio20.Excepciones.*;

public class Ejercicio20 {

    public static String buscarSinonimos(String clave, HashMap<String, String> diccionario) throws NoSinonimosException, PalabraNoReconocidaException {
        if (!diccionario.containsKey(clave)) {
            throw new PalabraNoReconocidaException("No reconozco esa palabra ¿quiere añadirla al diccionario? (s/n): ");
        }
        String significado = diccionario.get(clave);
        String sinonimos = "";
        boolean primero=true;
        Object[] clavesArray = diccionario.keySet().toArray();
        for (int i=0; i<clavesArray.length; i++) {
            String claveArray = (String)clavesArray[i];
            if (!claveArray.equals(clave) && diccionario.get(claveArray).equals(significado)) {
                if (!primero) {
                    sinonimos += ", ";
                }
                sinonimos += claveArray;
                primero=false;
            }
        }
        if (sinonimos.equals("")) {
            throw new NoSinonimosException("No conozco sinónimos de esa palabra ¿quiere añadir alguno? (s/n): ");
        }
        return sinonimos;
    }
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<String, String>();
        diccionario.put("caliente", "hot");
        diccionario.put("ardiente", "hot");
        diccionario.put("abrasador", "hot");
        diccionario.put("grande", "big");
        diccionario.put("rojo", "red");

        String input="";
        do {
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            input = System.console().readLine();
            if (input.equals("salir")) {
                break;
            }
            try {
                System.out.println("Sinónimos de "+input+": "+buscarSinonimos(input, diccionario));
            }
            catch (NoSinonimosException e) {
                System.out.print(e.getMessage());
                String opcion = System.console().readLine();
                if (opcion.equalsIgnoreCase("s")) {
                    System.out.print("Introduzca un sinónimo de "+input+": ");
                    String sinonimo = System.console().readLine();
                    diccionario.put(sinonimo, diccionario.get(input));
                }
            }
            catch (PalabraNoReconocidaException e) {
                System.out.print(e.getMessage());
                String opcion = System.console().readLine();
                if (opcion.equalsIgnoreCase("s")) {
                    System.out.print("Introduzca la traducción de "+input+" en inglés: ");
                    String palabraIngles = System.console().readLine();
                    diccionario.put(input, palabraIngles);
                }
            }
        } while (true);
    }
}