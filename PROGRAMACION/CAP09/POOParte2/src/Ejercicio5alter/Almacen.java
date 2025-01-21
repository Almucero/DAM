package Ejercicio5alter;

import Ejercicio5alter.Excepciones.*;

public class Almacen implements StockInterface {
    Articulo[] stockArticulos;

    public Almacen(int tamanio) {
        stockArticulos = new Articulo[tamanio];
    }

    public int encontrarPosicionArticulo(String codigo) throws ArticuloNoExisteException {
        for (int i=0; i<stockArticulos.length; i++) {
            if (stockArticulos[i]!=null && (stockArticulos[i].getCodigo()).equals(codigo)) {
                return i;
            }
        }
        throw new ArticuloNoExisteException();
    }
    public int encontrarHuecoLibre() throws EspacioInsuficienteException {
        for (int i=0; i<stockArticulos.length; i++) {
            if (stockArticulos[i]==null) {
                return i;
            }
        }
        throw new EspacioInsuficienteException();
    }

    @Override
    public Articulo obtenerArticulo(String codigo) throws ArticuloNoExisteException {
        int indice = encontrarPosicionArticulo(codigo);
        return stockArticulos[indice];
    }

    @Override
    public void nuevoArticulo(Articulo a) throws ArticuloYaExisteException, EspacioInsuficienteException {
        try {
            encontrarPosicionArticulo(a.getCodigo());
            throw new ArticuloYaExisteException();
        }
        catch (ArticuloNoExisteException e) {
            int indice = encontrarHuecoLibre();
            stockArticulos[indice] = a;
        }
    }

    @Override
    public void modificaArticulo(String codigo, Articulo nuevArticulo) throws ArticuloNoExisteException {
        int indice = encontrarPosicionArticulo(codigo);
        stockArticulos[indice] = nuevArticulo;
    }

    @Override
    public void bajaArticulo(String codigo) throws ArticuloNoExisteException {
        int indice = encontrarPosicionArticulo(codigo);
        stockArticulos[indice]=null;
    }

    @Override
    public void entrada(String codigo, int cantidad) throws ArticuloNoExisteException, StockException {
        int indice = encontrarPosicionArticulo(codigo);
        stockArticulos[indice].setStock((stockArticulos[indice].getStock())+cantidad);
    }

    @Override
    public void salida(String codigo, int cantidad) throws ArticuloNoExisteException, StockException {
        int indice = encontrarPosicionArticulo(codigo);
        stockArticulos[indice].setStock((stockArticulos[indice].getStock())-cantidad);
    }

    @Override
    public String toString() {
        for (int i=0; i<stockArticulos.length; i++) {
            if (stockArticulos[i]!=null) {
                return String.format("%s", stockArticulos[i]);
            }
        }
        return "";
    }
}