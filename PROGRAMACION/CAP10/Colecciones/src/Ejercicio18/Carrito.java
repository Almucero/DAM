package Ejercicio18;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Elemento> elementos;

    public Carrito() {
        elementos = new ArrayList<Elemento>();
    }

    public int comprobarExistenciaElemento(String nombre) throws ElementoNoExisteException {
        for (int i=0; i<elementos.size(); i++) {
            if (elementos.get(i)!=null && elementos.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        throw new ElementoNoExisteException();
    }

    public void agrega(Elemento nuevoElemento) {
        int posicion=0;
        try {
            posicion = comprobarExistenciaElemento(nuevoElemento.getNombre());
            elementos.get(posicion).setCantidad(elementos.get(posicion).getCantidad()+nuevoElemento.getCantidad());
        }
        catch (ElementoNoExisteException e) {
            elementos.add(nuevoElemento);
        }
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