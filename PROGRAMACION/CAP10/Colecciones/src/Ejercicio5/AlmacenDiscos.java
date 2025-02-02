package Ejercicio5;

import java.util.ArrayList;
import Ejercicio5.Excepciones.*;

public class AlmacenDiscos implements AlmacenInterface {
    private ArrayList<Disco> discos;

    public AlmacenDiscos() {
        discos = new ArrayList<Disco>();
    }

    public int comprobarExistenciaDisco(String codigo) throws DiscoNoExisteException {
        for (int i=0; i<discos.size(); i++) {
            if (discos.get(i).getCodigo().equals(codigo)) {
                return i;
            }
        }
        throw new DiscoNoExisteException();
    }

    public Disco devolverDiscoPorCodigo(String codigo) throws DiscoNoExisteException {
        int posicion = comprobarExistenciaDisco(codigo);
        return discos.get(posicion);
    }

    @Override
    public Disco crearDisco(Disco nuevoDisco) throws DiscoYaExisteException {
        try {
            comprobarExistenciaDisco(nuevoDisco.getCodigo());
            throw new DiscoYaExisteException();
        }
        catch (DiscoNoExisteException e) {
            discos.add(nuevoDisco);
            return nuevoDisco;
        }
    }

    @Override
    public void modificarDisco(String codigo, Disco nuevoDisco) throws DiscoNoExisteException {
        int posicion = comprobarExistenciaDisco(codigo);
        discos.set(posicion, nuevoDisco);
    }

    @Override
    public void borrarDisco(String codigo) throws DiscoNoExisteException {
        int posicion = comprobarExistenciaDisco(codigo);
        discos.remove(posicion);
    }

    @Override
    public String toString() {
        String listado = """
            LISTADO
            =======
            """;
        for (int i=0; i<discos.size(); i++) {
            if (discos.get(i)!=null) {
                listado += discos.get(i);
            }
        }
        return listado = discos.isEmpty() ? listado="" : listado;
    }
}