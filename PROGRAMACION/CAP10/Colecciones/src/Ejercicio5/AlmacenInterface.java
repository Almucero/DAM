package Ejercicio5;

import Ejercicio5.Excepciones.*;

public interface AlmacenInterface {

    public Disco crearDisco(Disco d) throws DiscoYaExisteException;

    public void modificarDisco(String codigo, Disco disco) throws DiscoNoExisteException;

    public void borrarDisco(String codigo) throws DiscoNoExisteException;
}