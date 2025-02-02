package Ejercicio9;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio9 {
    public static void ordenarBaraja(ArrayList<Carta> baraja) {
        for (int i=0; i<baraja.size()-1; i++) {
            for (int j=0; j<baraja.size()-i-1; j++) {
                Carta c1 = baraja.get(j);
                Carta c2 = baraja.get(j+1);
                int palo1 = Carta.getValorPalo(c1.getPalo());
                int palo2 = Carta.getValorPalo(c2.getPalo());
                if (palo1>palo2) {
                    Collections.swap(baraja, j, j+1);
                }
                else if (palo1==palo2) {
                    int num1 = Carta.getValorNumero(c1.getNumero());
                    int num2 = Carta.getValorNumero(c2.getNumero());
                    if (num1>num2) {
                        Collections.swap(baraja, j, j+1);
                    }
                }
            }
        }
    }
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
        ordenarBaraja(baraja);
        System.out.println(baraja);
    }
}