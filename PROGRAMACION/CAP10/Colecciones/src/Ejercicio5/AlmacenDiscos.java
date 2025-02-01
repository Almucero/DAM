package Ejercicio5;

import Ejercicio5.Excepciones.*;

public class AlmacenDiscos implements AlmacenInterface {

    @Override
    public void crearDisco() throws DiscoYaExisteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearDisco'");
    }

    @Override
    public void modificarDsico(Disco disco) throws DiscoNoExisteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarDsico'");
    }

    @Override
    public void borrarDisco(Disco disco) throws DiscoNoExisteException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrarDisco'");
    }
    
}
