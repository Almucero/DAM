package Ejercicio8;

import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Carta> baraja = new ArrayList<Carta>();

        while (baraja.size()!=10) {
            Carta nuevaCarta = new Carta();
            boolean repite=false;
            for (int i=0; i<baraja.size(); i++) {
                if ((nuevaCarta.getNumero()).equals(baraja.get(i).getNumero()) && (nuevaCarta.getPalo()).equals(baraja.get(i).getPalo())) {
                    repite=true;
                }
            }
            if (!repite) {
                baraja.add(nuevaCarta);
            }
        }
        System.out.println(baraja);
    }
}