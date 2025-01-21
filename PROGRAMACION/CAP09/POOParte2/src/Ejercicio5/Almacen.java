package Ejercicio5;

import Ejercicio5.Excepciones.*;

public class Almacen implements StockInterface {
    Articulo[] stockArticulos;
    int stock;

    public Almacen(int articulos) {
        stockArticulos = new Articulo[articulos];
        stock=0;
    }

    private int encontrarHuecoLibre() throws EspacioInsuficienteException {
        for (int i=0; i<stockArticulos.length; i++) {
            if (stockArticulos[i]==null) {
                return i;
            }
        }
        throw new EspacioInsuficienteException();
    }

    //se intenta encontrar el articulo dentro del array de articulos, 
    //en caso de no encontrarse devuelve una excepcion diciendo que no existe
    private int encontrarArticulo(String codigo) throws ArticuloNoExisteException {
        for (int i=0; i<stockArticulos.length; i++) {
            if (stockArticulos[i]!=null && (stockArticulos[i].getCodigo()).equals(codigo)) {
                return i;
            }
        }
        throw new ArticuloNoExisteException();
    }

    @Override
    public String nuevoArticulo(Articulo a) throws ArticuloYaExisteException, EspacioInsuficienteException {
        try {
            encontrarArticulo(a.getCodigo());
            throw new ArticuloYaExisteException();
        }
        catch (ArticuloNoExisteException e) {
            int indice = encontrarHuecoLibre();
            stockArticulos[indice]= a;
            return a.getCodigo();
        }
    }

    @Override
    public Articulo modificaArticulo(String codigo, Articulo a) throws ArticuloNoExisteException {
        int indice = encontrarArticulo(codigo);
        stockArticulos[indice] = a;
        return stockArticulos[indice];
    }

    @Override
    public Articulo bajaArticulo(String codigo) throws ArticuloNoExisteException {
        int indice = encontrarArticulo(codigo);
        stockArticulos[indice] = null;
        return stockArticulos[indice];
    }

    @Override
    public int entrada(String codigo, int cantidad) throws ArticuloNoExisteException, StockException{
        int indice = encontrarArticulo(codigo);
        stockArticulos[indice].setStock(stockArticulos[indice].getStock()+cantidad);
        return stockArticulos[indice].getStock();
    }

    @Override
    public int salida(String codigo, int cantidad) throws ArticuloNoExisteException, StockException {
        int indice = encontrarArticulo(codigo);
        stockArticulos[indice].setStock(stockArticulos[indice].getStock()-cantidad);
        return stockArticulos[indice].getStock();
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

    @Override
    public Articulo obtenerArticulo(String codigo) throws ArticuloNoExisteException {
        int indice = encontrarArticulo(codigo);
        return stockArticulos[indice];
    }
}