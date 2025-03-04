import java.util.List;
import java.util.Scanner;
import java.io.File;

/**
 * Aplicación principal para gestionar contactos mediante un menú interactivo.
 */
public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String ARCHIVO_DATOS = "contactos.data";
    private static final Gestor gestor = new Gestor(ARCHIVO_DATOS);
    
    /**
     * Método principal que ejecuta el menú de la aplicación.
     */
    public static void main(String[] args) {
        boolean salir = false;
        
        System.out.println("=== SISTEMA DE GESTIÓN DE CONTACTOS ===");
        
        // Solo cargar contactos de ejemplo si el archivo no existe o está vacío
        File archivo = new File(ARCHIVO_DATOS);
        if (!archivo.exists() || archivo.length() == 0) {
            System.out.println("Archivo de datos no encontrado o vacío. Cargando contactos de ejemplo...");
            cargarContactosEjemplo();
        } else {
            int contactosCargados = gestor.cargarDesdeArchivo();
            System.out.println("Se cargaron " + contactosCargados + " contactos desde " + ARCHIVO_DATOS);
        }
        
        while (!salir) {
            mostrarMenu();
            int opcion = leerOpcion();
            
            switch (opcion) {
                case 1:
                    listarContactos();
                    break;
                case 2:
                    agregarContacto();
                    break;
                case 3:
                    actualizarContacto();
                    break;
                case 4:
                    eliminarContacto();
                    break;
                case 5:
                    salir = true;
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        
        scanner.close();
    }
    
    /**
     * Carga contactos de ejemplo en el gestor.
     */
    private static void cargarContactosEjemplo() {
        gestor.agregar(new Contacto("Juan", "Pérez García", "Director de Marketing", 
                "juan.perez@empresa.com", "+34 612345678"));
        gestor.agregar(new Contacto("María", "López Sánchez", "Desarrolladora Senior", 
                "maria.lopez@empresa.com", "+34 698765432"));
        System.out.println("Contactos de ejemplo agregados y guardados en " + ARCHIVO_DATOS);
    }
    
    /**
     * Muestra el menú principal de la aplicación.
     */
    private static void mostrarMenu() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Listar todos los contactos");
        System.out.println("2. Añadir un nuevo contacto");
        System.out.println("3. Actualizar un contacto existente");
        System.out.println("4. Eliminar un contacto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    /**
     * Lee la opción seleccionada por el usuario.
     * @return Número de opción seleccionada
     */
    private static int leerOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return 0; // Opción inválida
        }
    }
    
    /**
     * Muestra todos los contactos almacenados.
     */
    private static void listarContactos() {
        List<Contacto> contactos = gestor.listarTodos();
        
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
            return;
        }
        
        System.out.println("\n=== LISTA DE CONTACTOS ===");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
            System.out.println("--------------------------------");
        }
    }
    
    /**
     * Solicita datos al usuario para agregar un nuevo contacto.
     */
    private static void agregarContacto() {
        System.out.println("\n=== AGREGAR NUEVO CONTACTO ===");
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        
        System.out.print("Email: ");
        String email = scanner.nextLine();
        
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        
        Contacto nuevoContacto = new Contacto(nombre, apellidos, cargo, email, telefono);
        int idAsignado = gestor.agregar(nuevoContacto);
        
        System.out.println(gestor.buscarPorId(idAsignado));
        System.out.println(nuevoContacto);
    }
    
    /**
     * Actualiza un contacto existente.
     */
    private static void actualizarContacto() {
        System.out.println("\n=== ACTUALIZAR CONTACTO ===");
        
        System.out.print("Ingrese el ID del contacto a actualizar: ");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID inválido.");
            return;
        }
        
        Contacto contactoExistente = gestor.buscarPorId(id);
        if (contactoExistente == null) {
            System.out.println("No se encontró ningún contacto con el ID " + id);
            return;
        }
        
        System.out.println("\nContacto encontrado:");
        System.out.println(contactoExistente);
        
        System.out.println("\nIngrese los nuevos datos (deje en blanco para mantener el valor actual):");
        
        System.out.print("Nombre [" + contactoExistente.getNombre() + "]: ");
        String nombre = scanner.nextLine();
        nombre = nombre.isEmpty() ? contactoExistente.getNombre() : nombre;
        
        System.out.print("Apellidos [" + contactoExistente.getApellidos() + "]: ");
        String apellidos = scanner.nextLine();
        apellidos = apellidos.isEmpty() ? contactoExistente.getApellidos() : apellidos;
        
        System.out.print("Cargo [" + contactoExistente.getCargo() + "]: ");
        String cargo = scanner.nextLine();
        cargo = cargo.isEmpty() ? contactoExistente.getCargo() : cargo;
        
        System.out.print("Email [" + contactoExistente.getEmail() + "]: ");
        String email = scanner.nextLine();
        email = email.isEmpty() ? contactoExistente.getEmail() : email;
        
        System.out.print("Teléfono [" + contactoExistente.getTelefono() + "]: ");
        String telefono = scanner.nextLine();
        telefono = telefono.isEmpty() ? contactoExistente.getTelefono() : telefono;
        
        // Crear un nuevo contacto con los datos actualizados
        Contacto contactoActualizado = new Contacto(nombre, apellidos, cargo, email, telefono);
        
        // Ya no es necesario establecer el ID aquí, GestorContactos lo maneja internamente
        
        if (gestor.actualizar(id, contactoActualizado)) {
            System.out.println("\n¡Contacto actualizado exitosamente!");
            System.out.println(contactoActualizado);
        } else {
            System.out.println("No se pudo actualizar el contacto.");
        }
    }
    
    /**
     * Elimina un contacto existente.
     */
    private static void eliminarContacto() {
        System.out.println("\n=== ELIMINAR CONTACTO ===");
        
        System.out.print("Ingrese el ID del contacto a eliminar: ");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("ID inválido.");
            return;
        }
        
        Contacto contactoExistente = gestor.buscarPorId(id);
        if (contactoExistente == null) {
            System.out.println("No se encontró ningún contacto con el ID " + id);
            return;
        }
        
        System.out.println("\nContacto a eliminar:");
        System.out.println(contactoExistente);
        
        System.out.print("\n¿Está seguro que desea eliminar este contacto? (s/n): ");
        String confirmacion = scanner.nextLine().toLowerCase();
        
        if (confirmacion.equals("s")) {
            if (gestor.eliminar(id)) {
                System.out.println("Contacto eliminado exitosamente.");
            } else {
                System.out.println("No se pudo eliminar el contacto.");
            }
        } else {
            System.out.println("Operación cancelada.");
        }
    }
} 