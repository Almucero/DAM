package Ejercicio5genericos;

import Ejercicio5.Excepciones.*;

public class Almacen<T> implements StockInterface<T>{
    MiArrayList<Articulo> stockArticulos;
    int stock;

    public Almacen(int articulos) {
        stockArticulos = new MiArrayList<Articulo>(articulos);
        stock = 0;
    }

    private int encontrarHuecoLibre() {
        for (int i=0; i<stockArticulos.length; i++) {
            if (stockArticulos[i]==null) {
                return i;
            }
        }
        return -1;
    }

    private int encontrarArticulo(String codigo) {
        for (int i=0; i<stockArticulos.length; i++) {
            if (stockArticulos[i]!=null && (stockArticulos[i].getCodigo()).equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String nuevoArticulo(Articulo a) throws ArticuloYaExisteException, EspacioInsuficienteException {
        int indice = encontrarArticulo(a.getCodigo());
        if(indice!=-1) {
            throw new ArticuloYaExisteException();
        }
        indice = encontrarHuecoLibre();
        if(indice==-1) {
            throw new EspacioInsuficienteException();
        }
        stockArticulos[indice] = a;
        return a.getCodigo();
    }

    @Override
    public Articulo modificaArticulo(String codigo, Articulo articuloNuevo) throws ArticuloNoExisteException {
        int indice = encontrarArticulo(codigo);
        if (indice==-1) {
            throw new ArticuloNoExisteException();
        }
        Articulo articuloAntiguo = stockArticulos[indice];
        stockArticulos[indice] = articuloNuevo;
        return articuloAntiguo;
    }

    @Override
    public Articulo bajaArticulo(String codigo) throws ArticuloNoExisteException {
        int indice = encontrarArticulo(codigo);
        if(indice==-1)
            throw new ArticuloNoExisteException();
        Articulo a = stockArticulos[indice];
        stockArticulos[indice] = null;
        return a;
    }

    @Override
    public int entrada(String codigo, int cantidad) throws ArticuloNoExisteException, StockException{
        int indice = encontrarArticulo(codigo);
        if(indice==-1)
            throw new ArticuloNoExisteException();
        stockArticulos[indice].setStock(stockArticulos[indice].getStock()+cantidad);
        return stockArticulos[indice].getStock();
    }

    @Override
    public int salida(String codigo, int cantidad) throws ArticuloNoExisteException, StockException {
        int indice = encontrarArticulo(codigo);
        if(indice==-1)
            throw new ArticuloNoExisteException();
        stockArticulos[indice].setStock(stockArticulos[indice].getStock()-cantidad);
        return stockArticulos[indice].getStock();
    }

    @Override
    public String toString() {
        String res = "";
        for(Articulo a:stockArticulos){
            if(a!=null)
                res += a.toString();
        }
        return res;
    }

    @Override
    public Articulo obtenerArticulo(String codigo) throws ArticuloNoExisteException {
        
        int indice = encontrarArticulo(codigo);
        if(indice==-1)
            throw new ArticuloNoExisteException();
        return stockArticulos[indice];
    }
}