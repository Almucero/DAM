package Ejercicio19.Excepciones;

public class PalabraNoReconocidaException extends Exception { 
    public PalabraNoReconocidaException(String mensaje) {
        super(mensaje);
    }
}