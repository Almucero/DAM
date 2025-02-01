package Ejercicio5;

import Ejercicio5.Excepciones.*;

public interface AlmacenInterface {
    
    public void crearDisco() throws DiscoYaExisteException;

    public void modificarDsico(Disco disco) throws DiscoNoExisteException;

    public void borrarDisco(Disco disco) throws DiscoNoExisteException;
}