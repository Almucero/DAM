package Ejercicio7_Alter;

import java.util.ArrayList;

public class Ejercicio7alter {
    public static void main(String[] args) {
        ArrayList<Moneda> monedas = new ArrayList<Moneda>();
        monedas.add(new Moneda());
        while (monedas.size()!=6) {
            Moneda nuevaMoneda = new Moneda();
            for (int i=0; i<monedas.size(); i++) {
                if ((nuevaMoneda.getValor())==(monedas.get(i).getValor()) || (nuevaMoneda.getLado()).equals(monedas.get(i).getLado())) {
                    monedas.add(nuevaMoneda);
                    break;
                }
            }
        }
        System.out.println(monedas);
    }
}