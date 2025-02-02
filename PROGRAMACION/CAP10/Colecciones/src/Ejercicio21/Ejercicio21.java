package Ejercicio21;

import java.util.HashMap;

public class Ejercicio21 {
    public static void main(String[] args) {
        HashMap<String, String> diccionarioHabitat = new HashMap<String, String>();
        diccionarioHabitat.put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas");
        diccionarioHabitat.put("salamandra", "Ecosistemas húmedos");
        diccionarioHabitat.put("sapo", "En cualquier sitio salvo el desierto y la Antártida");
        diccionarioHabitat.put("tritón", "América y África");
        HashMap<String, String> diccionarioAlimentacion = new HashMap<String, String>();
        diccionarioAlimentacion.put("rana", "Larvas e insectos");
        diccionarioAlimentacion.put("salamandra", "Pequeños crustáceos e insectos");
        diccionarioAlimentacion.put("sapo", "Insectos, lombrices y pequeños roedores");
        diccionarioAlimentacion.put("tritón", "Insectos");

        do {
            System.out.print("Introduzca el tipo de anfibio: ");
            String tipoAnfibio = System.console().readLine();
            if (tipoAnfibio.equalsIgnoreCase("salir")) {
                break;
            }
            if (diccionarioAlimentacion.containsKey(tipoAnfibio) && diccionarioHabitat.containsKey(tipoAnfibio)) {
                System.out.println("Hábitat: "+diccionarioHabitat.get(tipoAnfibio));
                System.out.println("Alimentación: "+diccionarioAlimentacion.get(tipoAnfibio));
            }
            else {
                System.out.println("Ese tipo de anfibio no existe");
            }
        } while (true);
    }
}