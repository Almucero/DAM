import java.util.Date;

public class File implements FileEntry {
    public String fileName;
    public Date createdAt;
    public int nivel;

    //Constructor solo nombre, nivel=0
    public File(String fileName) {
        this.fileName=fileName;
        this.nivel=0;
        this.createdAt = new Date();
    }
    //Constructor nombre y nivel
    public File(String fileName, int nivel) {
        this.fileName=fileName;
        this.nivel=nivel;
        this.createdAt = new Date();
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public String getName() {
        return fileName;
    }

    public static String generarEspacios(int nivel) {
        String espacios="";
        for (int i=0; i<nivel; i++) {
            espacios+=" ";
        }
        return espacios;
    }

    //nombre //2*nivel*espacios //fecha
    public String toString() {
        return String.format("|_%s%s%s", getName(), generarEspacios(2*this.nivel), this.createdAt);
    }
}
/** clase File 
 * Implementa la interfaz FileEntry
 * Tiene que almacenar el nombre del archivo (fileName de tipo String)
 * Tiene que almacenar la fecha de creación (createdAt de tipo Date)
 * Date es una clase que hay que crear con new. Ej. this.createdAt = new Date()
 * Si quieres imprimir la fecha que ha almacenado en la variabel createdAt simplemente haz:
 * System.out.print(this.createdAt)
 * Tiene que almacenar el nivel en el que se encuentra el archivo
 * Ej: Si el archivo está en la raiz del sistema de archivos está en el nivel 0
 * Si está dentro de una carpeta que está en la raiz del disco está en el nivel 1
 * y así sucesivamente
 * Tiene que haber un constructor que recibe solo el nombre del archivo
 * En este caso el nivel se configurar a 0
 * Tiene que haber un constructor que recibe el nombre del archivo y el nivel
 * En ambos constructores se inicializa la fecha de creación con new Date()
 */