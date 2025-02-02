package Ejercicio13;

import Ejercicio13.Excepciones.*;

public interface AlmacenInterface {
    
    public Articulo crearArticulo(Articulo articulo) throws ArticuloYaExisteException;

    public void borrarArticulo(String codigo) throws ArticuloNoExisteException;

    public void modificarArticulo(String codigo, Articulo nuevoArticulo) throws ArticuloNoExisteException;

    public void entradaMercancia(String codigo, int cantidad) throws ArticuloNoExisteException;

    public void salidaMercancia(String codigo, int cantidad) throws ArticuloNoExisteException;
}
