package Ejercicio12;

import java.util.ArrayList;
import java.util.HashMap;

public class Ejercicio12 {
    public static void main(String[] args) {
        ArrayList<Carta> baraja = new ArrayList<Carta>();
        HashMap<String, Integer> valoresCartas = new HashMap<String, Integer>();

        valoresCartas.put("as", 11);
        valoresCartas.put("tres", 10);
        valoresCartas.put("sota", 2);
        valoresCartas.put("caballo", 3);
        valoresCartas.put("rey", 4);

        int puntos=0;
        for (int i=0; i<5; i++) {
            Carta nuevaCarta = new Carta();
            baraja.add(nuevaCarta);
            System.out.println(nuevaCarta);
            puntos += valoresCartas.getOrDefault(nuevaCarta.getNumeroCarta(), 0);
        }
        System.out.println("Tienes "+puntos+" puntos");
    }
}