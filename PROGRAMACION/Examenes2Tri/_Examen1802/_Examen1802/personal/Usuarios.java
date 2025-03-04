package personal;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Usuarios implements CRUD<Usuario>{
    private String file;
    private int nextId;
    
    public Usuarios(String file) throws Exception{
        // (0 puntos) TODO Tienes que comprobar que el archivo existe y si no existe debes crearlo
        File archivo = new File(file);
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        int maxId = 0;
        ArrayList<Usuario> usuarios = solicitarTodos();
        for (int i=0; i<usuarios.size(); i++) {
            if (usuarios.get(i).getId()>maxId) {
                maxId = usuarios.get(i).getId();
            }
        }
        this.nextId = maxId+1;

        // (5 puntos) TODO tienes que leer el archivo para obtener el siguiente id disponible...
        // nextId almacena el siguiente id a configurar para cuando se añada un nuevo usuario
        // Por ejempo: Si tienes x usuarios y el último es el usuario 8 entonces nextId debe valer 9
        // Podrías hacer uso de la función solicitarTodos "es solo una sugerencia"
    }
    
    public String getFile() {
        return file;
    }

    @Override
    public ArrayList<Usuario> solicitarTodos() {
        // (10 puntos) TODO Tienes que devolver un ArrayList conteniendo todos los usuarios del archivo
        ArrayList<Usuario> lista = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(getFile())));
            String linea = "";
            while((linea=br.readLine())!=null) {
                lista.add(new Usuario(linea));
            }
            br.close();
        }
        catch (IOException e) {
            System.out.println("Error al leer los datos");
        }
        return lista;
    }

    @Override
    public Usuario solicitarUno(int id){
        // (10 puntos) TODO Tienes que poder buscar en el archivo al usuario cuyo id se suministra
        // y devolver un objeto Usuario
        // si el usuario no está debe devolver null
        ArrayList<Usuario> usuarios = solicitarTodos();
        for (int i=0; i<usuarios.size(); i++) {
            if (usuarios.get(i).getId()==id && usuarios.get(i)!=null) {
                return usuarios.get(i);
            }
        }
        return null;
    }

    @Override
    public Usuario anadir(Usuario datos){
       // (20 puntos) TODO Tienes que poder añadir un usuario al archivo
       // Debes comprobar que el usuario no existe (no puede haber dos usuarios con el mismo email)
       // En el caso de que ya existiera debe devolver un null
       // Si el usuario no existe entonces podemos añadir al usuario
       // Para que puedas añadir al usuario al final del archivo debes pasar un true cuando llames
       // al constructor de new FileWriter(nombre, true)
       ArrayList<Usuario> usuarios = solicitarTodos();
       for (int i=0; i<usuarios.size(); i++) {
            if (usuarios.get(i)!=null && usuarios.get(i)==datos || usuarios.get(i).getEmail()!=datos.getEmail()) {
                return null;
            }
        }
            Usuario usuario = new Usuario(datos.getId(), datos.getNombre(), datos.getApellidos(), datos.getEmail(), datos.getContrasena());
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File(getFile()), true));
                bw.write(usuario.serializar());
                bw.close();
            }
            catch (IOException e) {
                System.out.println("Error al escribir los datos");
            }
            return usuario;
       
    }

    @Override
    public Usuario actualizar(int id, Usuario data){
        // (25 puntos) TODO Tienes que devolver los datos del usuario actualizados
        // Devolverá null si el usuario no existe en el fichero (si no se encuentra ese id)
        // Si el usuario se encuentra en el archivo entonces modificamos ese usuario en esa posición
        // del archivo.
        // Ayuda: Tienes que renombrar el archivo original añadiéndole .tmp al final
        // Luego abres en modo lectura el archivo temporal y abres en modo escritura el archivo original
        // Vas escribiendo las líneas del archivo temporal y cuando llegues al usaurio que quieres 
        // modificar escribes los datos de ese usuario
        // Sigue hasta que consumas todas las líneas del archivo temporal
        // Al final del proceso debes borrar el archivo temporal
        // Con esto habrás modificado los datos de ese usuario 
        return null;
    }

    @Override
    public Usuario borrar(int id){
        // (25 puntos) TODO Tienes que devolver los datos del usuario borrado
        // Devolverá null si el usuario no existe en el fichero (si no se encuentra ese id)
        // Si el usuario se encuentra en el archivo entonces eliminamos esa línea del archivo
        // Ayuda: Tienes que renombrar el archivo original añadiéndole .tmp al final
        // Luego abres en modo lectura el archivo temporal y abres en modo escritura el archivo original
        // Vas escribiendo las líneas del archivo temporal y cuando llegues al usaurio que quieres 
        // borrar te saltas la escritura de esa línea
        // Sigue hasta que consumas todas las líneas del archivo temporal
        // Al final del proceso debes borrar el archivo temporal
        // Con esto habrás borrado al usuario
        return null;
    }
}
