import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Implementación de la interfaz IGestor para la clase Contacto.
 * Gestiona una colección de contactos permitiendo operaciones CRUD y persistencia.
 * 
 * Los atributos son:
 * - contactos: HashMap que almacena los contactos usando el ID como clave
 * - nextId: Entero que mantiene el siguiente ID disponible para nuevos contactos
 * - nombreArchivo: String con la ruta del archivo para persistencia de datos
 */
public class Gestor implements IGestor<Contacto> {
    HashMap<Integer, Contacto> contactos;
    private Integer nextId;
    private String nombreArchivo;

    @Override
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    /**
     * Constructor que inicializa el gestor con un archivo específico.
     * 
     * @param nombreArchivo El nombre del archivo .data para persistencia
     */
    public Gestor(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                System.out.println("Error al crear el archivo");
            }
        }
        contactos = new HashMap<>();
        cargarDesdeArchivo();
    }
    /**
     * Constructor por defecto que inicializa el gestor sin archivo.
     */
    public Gestor() {
        contactos = new HashMap<>();
        nextId = 1;
    }

    @Override
    public int agregar(Contacto entidad) {
        if (contactos.containsKey(entidad.getId())) {
            return 0;
        }
        else {
            nextId++;
            int idAsignado = nextId;
            entidad.setId(idAsignado);
            contactos.put(nextId, entidad);
            guardarEnArchivo();
            return idAsignado;
        }
    }

    @Override
    public boolean actualizar(int id, Contacto entidadActualizada) {
        if (contactos.containsKey(id)) {
            contactos.put(id, entidadActualizada);
            entidadActualizada.setId(nextId);
            guardarEnArchivo();
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        if (contactos.containsKey(id)) {
            contactos.remove(id);
            guardarEnArchivo();
            return true;
        }
        return false;
    }

    @Override
    public Contacto buscarPorId(int id) {
        List<Contacto> lista = listarTodos();
        for (int i=0; i<lista.size(); i++) {
            if (lista.get(i)!=null && lista.get(i).getId()==id) {
                return lista.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Contacto> listarTodos() {
        ArrayList<Contacto> listaContactos = new ArrayList<Contacto>(contactos.values());
        return listaContactos;
    }

    @Override
    public int cargarDesdeArchivo() {
        int veces = 0, maxId = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea = "";
            while ((linea=br.readLine())!=null) {
                Contacto contacto = new Contacto(linea);
                contactos.put(contacto.getId(), contacto);
                if (contacto.getId()>maxId) {
                    maxId = contacto.getId();
                }
                veces++;
            }
            br.close();
        }
        catch (IOException e) {
            System.out.println("Error al leer los datos");
        }
        this.nextId = maxId+1;
        return veces;
    }

    @Override
    public boolean guardarEnArchivo() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
            for (Contacto contacto:contactos.values()) {
                bw.write(contacto.serializar()+"\n");
            }
            bw.close();
            return true;
        }
        catch (IOException e) {
            System.out.println("Error al escribir los datos");
        }
        return false;
    }
} 