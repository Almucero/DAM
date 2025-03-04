/**
 * Interfaz que define métodos para serializar y deserializar objetos.
 * Las clases que implementen esta interfaz podrán convertirse en cadenas
 * de texto y reconstruirse a partir de ellas.
 */
public interface Serializable {
    
    /**
     * Convierte el objeto actual a una cadena serializada.
     * 
     * @return Una representación en cadena del objeto
     */
    String serializar();
} 