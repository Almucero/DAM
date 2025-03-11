import java.util.List;

/**
 * Interfaz genérica para gestionar entidades con persistencia.
 * Define operaciones CRUD básicas y métodos para guardar/cargar desde archivo.
 * 
 * @param <T> Tipo de entidad a gestionar
 */
public interface IGestor<T> {
    /**
     * Agrega una nueva entidad a la colección.
     * 
     * @param entidad La entidad a agregar
     * @return El ID asignado a la entidad
     */
    int agregar(T entidad);
    
    /**
     * Actualiza una entidad existente.
     * 
     * @param id Identificador de la entidad a actualizar
     * @param entidadActualizada Nueva versión de la entidad
     * @return true si se actualizó correctamente, false si no se encontró
     */
    boolean actualizar(int id, T entidadActualizada);
    
    /**
     * Elimina una entidad por su identificador.
     * 
     * @param id Identificador de la entidad a eliminar
     * @return true si se eliminó correctamente, false si no se encontró
     */
    boolean eliminar(int id);
    
    /**
     * Busca una entidad por su identificador.
     * 
     * @param id Identificador de la entidad a buscar
     * @return La entidad encontrada o null si no existe
     */
    T buscarPorId(int id);
    
    /**
     * Lista todas las entidades disponibles.
     * 
     * @return Lista con todas las entidades
     */
    List<T> listarTodos();
    
    /**
     * Establece el nombre del archivo para persistencia.
     * 
     * @param nombreArchivo Ruta del archivo de datos
     */
    void setNombreArchivo(String nombreArchivo);
    
    /**
     * Carga entidades desde el archivo especificado.
     * 
     * @return Número de entidades cargadas correctamente
     */
    int cargarDesdeArchivo();
    
    /**
     * Guarda todas las entidades en el archivo especificado.
     * 
     * @return true si se guardaron correctamente, false en caso contrario
     */
    boolean guardarEnArchivo();
} 