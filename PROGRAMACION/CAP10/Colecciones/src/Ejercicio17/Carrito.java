package Ejercicio17;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Elemento> elementos;

    public Carrito() {
        elementos = new ArrayList<Elemento>();
    }

    public void agrega(Elemento nuevoElemento) {
        elementos.add(nuevoElemento);
    }

    public int numeroDeElementos() {
        int numeroDeElementos=0;
        for (int i=0; i<elementos.size(); i++) {
            if (elementos.get(i)!=null) {
                numeroDeElementos++;
            }
        }
        return numeroDeElementos;
    }

    public double importeTotal() {
        double importeTotal=0;
        for (int i=0; i<elementos.size(); i++) {
            if (elementos.get(i)!=null) {
                importeTotal += (double)(elementos.get(i).getPrecio()*elementos.get(i).getCantidad());
            }
        }
        return importeTotal;
    }

    @Override
    public String toString() {
        String carrito="";
        for (int i=0; i<elementos.size(); i++) {
            if (elementos.get(i)!=null) {
                carrito += elementos.get(i)+"\n";
            }
        }
        return carrito = (elementos.isEmpty()) ? "" : carrito;
    }
}