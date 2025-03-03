package library;
import java.util.ArrayList;

/**
 * Interfaz genérica que define las operaciones para gestionar un catálogo de elementos.
 * @param <T> el tipo de elementos almacenados en el catálogo
 */
public interface ICatalog<T> {
    /**
     * Añade un nuevo elemento al catálogo si no existe ya
     * @param item el elemento a añadir
     * @return true si se añadió el elemento, false si ya existía
     */
    boolean addItem(T item);

    /**
     * Elimina un elemento del catálogo si existe
     * @param item el elemento a eliminar
     */
    void removeItem(T item);

    /**
     * Devuelve una lista con todos los elementos del catálogo
     * @return un ArrayList que contiene todos los elementos
     */
    ArrayList<T> getAllItems();
} 