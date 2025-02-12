package EjerciciosClase.Ejercicio7;

import java.util.ArrayList;
import EjerciciosClase.Ejercicio7.Excepciones.*;
import EjerciciosClase.Ejercicio7.Interfaces.IGestorCoches;

public class GestorCoches implements IGestorCoches {
    private ArrayList<Coche> coleccionCoches;

    public GestorCoches() {
        coleccionCoches = new ArrayList<Coche>();
    }

    @Override
    public int buscarCochePorId(String id) throws CocheNoExisteException {
        for (int i=0; i<coleccionCoches.size(); i++) {
            if (coleccionCoches.get(i)!=null && coleccionCoches.get(i).getId().equals(id)) {
                return i;
            }
        }
        throw new CocheNoExisteException();
    }

    @Override
    public Coche devolverCocheEspecifico(String id) throws CocheNoExisteException {
        int posicion = buscarCochePorId(id);
        return coleccionCoches.get(posicion);
    }

    @Override
    public void añadirCoche(Coche coche) throws CocheYaExisteException {
        try {
            buscarCochePorId(coche.getId());
            throw new CocheYaExisteException();
        }
        catch (CocheNoExisteException e) {
            coleccionCoches.add(coche);   
        }
    }

    @Override
    public void eliminarCoche(String id) throws CocheNoExisteException {
        int posicion = buscarCochePorId(id);
        coleccionCoches.remove(posicion);
    }

    @Override
    public String toString() {
        String listado = "";
        for (int i=0; i<coleccionCoches.size(); i++) {
            if (coleccionCoches.get(i)!=null) {
                listado += coleccionCoches.get(i);
            }
        }
        return listado;
    }
}