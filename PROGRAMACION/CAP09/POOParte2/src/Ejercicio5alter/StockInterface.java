package Ejercicio5alter;

import Ejercicio5alter.Excepciones.*;

public interface StockInterface {

    public Articulo obtenerArticulo(String codigo) throws ArticuloNoExisteException;

    public void nuevoArticulo(Articulo a) throws ArticuloYaExisteException, EspacioInsuficienteException;

    public void modificaArticulo(String codigo, Articulo a) throws ArticuloNoExisteException;

    public void bajaArticulo(String codigo) throws ArticuloNoExisteException;

    public void entrada(String codigo, int cantidad) throws ArticuloNoExisteException, StockException;

    public void salida(String codigo, int cantidad) throws ArticuloNoExisteException, StockException;
}