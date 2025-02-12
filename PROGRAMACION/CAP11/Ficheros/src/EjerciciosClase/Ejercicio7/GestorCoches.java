package EjerciciosClase.Ejercicio7;

import java.util.ArrayList;
import EjerciciosClase.Ejercicio7.Excepciones.*;

public class GestorCoches {
    private ArrayList<Coche> coleccionCoches;

    public GestorCoches() {
        coleccionCoches = new ArrayList<Coche>();
    }

    public int buscarCochePorId(String id) throws CocheNoExisteException {
        for (int i=0; i<coleccionCoches.size(); i++) {
            if (coleccionCoches.get(i)!=null && coleccionCoches.get(i).getId().equals(id)) {
                return i;
            }
        }
        throw new CocheNoExisteException();
    }

    public void añadirCoche(Coche coche) throws CocheYaExisteException {
        try {
            buscarCochePorId(coche.getId());
            throw new CocheYaExisteException();
        }
        catch (CocheNoExisteException e) {
            coleccionCoches.add(coche);   
        }
    }

    public void eliminarCoche(String id) {
        try {
            int posicion = buscarCochePorId(id);
            coleccionCoches.remove(posicion);
        }
        catch (CocheNoExisteException e) {
            System.out.println("Error. El código introducido no se corresponde con ningún coche almacenado");
        }
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