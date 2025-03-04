/**
 * Interfaz que define las operaciones básicas para un contacto empresarial.
 * Define métodos para acceder y modificar la información de contacto, así como
 * para su representación y serialización.
 */
public interface IContacto extends Serializable {
    
    /**
     * Devuelve el nombre completo del contacto.
     * @return Nombre y apellidos concatenados
     */
    String nombreCompleto();
    
    /**
     * Establece el nombre del contacto.
     * @param nombre Nuevo nombre
     */
    void setNombre(String nombre);
    
    /**
     * Establece los apellidos del contacto.
     * @param apellidos Nuevos apellidos
     */
    void setApellidos(String apellidos);
    
    /**
     * Establece la dirección de email del contacto.
     * @param email Nueva dirección de email
     */
    void setEmail(String email);
    
    /**
     * Establece el número de teléfono del contacto.
     * @param telefono Nuevo número de teléfono
     */
    void setTelefono(String telefono);
    
    /**
     * Establece el cargo del contacto.
     * @param cargo Nuevo cargo
     */
    void setCargo(String cargo);
    
    /**
     * Establece el ID del contacto.
     * @param id Nuevo ID
     */
    void setId(Integer id);
    
    /**
     * Obtiene el nombre del contacto.
     * @return El nombre
     */
    String getNombre();
    
    /**
     * Obtiene los apellidos del contacto.
     * @return Los apellidos
     */
    String getApellidos();
    
    /**
     * Obtiene el cargo del contacto.
     * @return El cargo
     */
    String getCargo();
    
    /**
     * Obtiene el email del contacto.
     * @return El email
     */
    String getEmail();
    
    /**
     * Obtiene el teléfono del contacto.
     * @return El teléfono
     */
    String getTelefono();
    
    /**
     * Obtiene el ID del contacto.
     * @return El ID
     */
    Integer getId();
    
    /**
     * Representación en cadena del contacto.
     * 
     * @return Cadena con toda la información del contacto
     * 
     * Ejemplo de salida:
     * 🔖 FICHA DE CONTACTO
     * 🔑 ID: 1
     * 👤 Nombre:   Juan Pérez García
     * 💼 Cargo:    Director de Marketing
     * 📧 Email:    juan.perez@empresa.com
     * 📞 Teléfono: +34 612345678
     */
    String toString();
    
    /**
     * Serializa el contacto a una cadena de texto.
     * @return Cadena serializada con los datos del contacto
     */
    String serializar();
} 