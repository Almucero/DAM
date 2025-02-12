package EjerciciosClase.Ejercicio7.Interfaces;

import EjerciciosClase.Ejercicio7.Excepciones.*;
import EjerciciosClase.Ejercicio7.Coche;

public interface IGestorCoches {

    /**
     * Encuentra al coche con la misma id dentro del ArrayList y devuelve su posición dentro de este.
     * @param id Recibe la id mediante la cual se buscará al coche.
     * @return Devuelve la posición en la que se encuentra el coche buscado en el ArrayList.
     * @throws CocheNoExisteException Si no se encuentra el coche con el id proporcionado.
     */
    public int buscarCochePorId(String id) throws CocheNoExisteException;

    /**
     * Devuelve el coche correspondiente a la id proporcionada.
     * @param id El identificador del coche que se busca.
     * @return El coche con el id proporcionado.
     * @throws CocheNoExisteException Si no se encuentra el coche con el id proporcionado.
     */
    public Coche devolverCocheEspecifico(String id) throws CocheNoExisteException;

    /**
     * Añade un coche a la colección de coches.
     * @param coche El coche que se desea añadir.
     * @throws CocheYaExisteException Si ya existe un coche con el mismo id en la colección.
     */
    public void añadirCoche(Coche coche) throws CocheYaExisteException;

    /**
     * Elimina un coche de la colección según el id proporcionado.
     * @param id El identificador del coche a eliminar.
     * @throws CocheNoExisteException Si no se encuentra el coche con el id proporcionado.
     */
    public void eliminarCoche(String id) throws CocheNoExisteException;

    /**
     * Devuelve una representación en cadena de todos los coches de la colección.
     * @return Un String con la representación de todos los coches.
     */
    public String toString();
}