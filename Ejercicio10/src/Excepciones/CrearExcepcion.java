package Excepciones;

import java.io.IOException;
import java.util.InputMismatchException;
import javax.crypto.ExemptionMechanismException;

public class CrearExcepcion {
    public static void ExcepcionAleatoria() throws NumberFormatException, ExceptionInInitializerError, ExemptionMechanismException, InputMismatchException, IOException {
        int NumeroAleatorio = (int)(Math.random()*5+1);
        switch (NumeroAleatorio) {
            case 1:
                throw new NumberFormatException();
            case 2:
                throw new ExceptionInInitializerError();
            case 3:
                throw new ExemptionMechanismException();
            case 4:
                throw new InputMismatchException();
            case 5:
                throw new IOException();
            default:
        }
    }
}