import Excepciones.*;

public class Folder extends File implements FolderEntry {
    File[] stockFiles;
    Folder[] stockFolders;

    public Folder(File archivo, String fileName, int nivel) {
        super(fileName, nivel);
        stockFiles = new File[100];
    }

    @Override
    public String toString() {
        return String.format("%s|_[%s]\n", generarEspacios(2*this.nivel), this.fileName);
    }
    /**
     * Devuelve una cadena de texto indicando el nombre de la carpeta así como los elementos que contiene
     * De la siguiente forma versión 1 (A incluir en la fase 2):
     * Ej: Carpeta folder1 en el nivel 0
     * |_(folder1) 
     * Otro Ej: Carpeta folder2 en el nivel 2
     *     |_(folder2)
     * Versión 2 (A incluir en la fase 3):
     * Si la carpeta tiene elementos (archivos y carpetas tendrá que mostrarlos también de la siguiente
     * forma:
     * Ej:
     * |_(folder1)   <-- Date cuenta que está en el nivel 0
     *   |_file1 Tue Jan 17 19:54:28 CET 2023   <-- Date cuenta que está en el nivel 1
     *   |_(folder2) <-- Date cuenta que está en el nivel 1
     *     |_file2 Tue Jan 17 19:54:28 CET 2023  <-- Date cuenta que está en el nivel 2
     *     |_file3 Tue Jan 17 19:54:28 CET 2023  <-- Date cuenta que está en el nivel 2
     *   |_(folder3)  <-- Date cuenta que está en el nivel 1
     *     |_file4 Tue Jan 17 19:54:28 CET 2023  <-- Date cuenta que está en el nivel 2
     *     |_file5 Tue Jan 17 19:54:28 CET 2023  <-- Date cuenta que está en el nivel 2
     * @return una cadena de texto conteniendo la estructura de la carpeta
     */

    /** clase Folder
     * Hereda de la clase File e implementa la interfaz FolderEntry
     * La clase Folder mantiene una lista de archivos/carpetas así como una referencia
     * a la carpeta que la contiene
     * La clase Folder al heredar de la clase File hereda sus propiedades
     * name, level y createdAt
     * Además dispondrá de un array donde se irán añadiendo los archivos que están dentro de
     * la carpeta
     * Debe implementar la interfaz FolderEntry
     * Debe tener un constructor que recibirá la carpeta que la contiene, en el caso
     * de que sea la carpeta raiz, recibirá null en la referencia a la carpeta padre
     * Además el constructor recibirá el nombre de la carpeta así como el nivel en el que se
     * encuentra la carpeta (Nivel 0 es la carpeta raiz, Nivel 1 las carpetas hijas de la carpeta raiz,
     * y así sucesivamente)
     * Ejemplo de llamada al constructor:
     * Folder root = new Folder(null, "Raiz", 0);
     * 
     */
    @Override
    public boolean isDirectory() {
        return true;
    }
    @Override
    public Folder getParent() {
        return null;
    }
    @Override
    public boolean isFolderFull() {
        for (int i=0; i<=stockFolders.length; i++) {
            if (stockFolders[i]!=null) {
                return false;
            }
        }
        return true;
    }
    @Override
    public int getFileCount() {
        int fileCount=0;
        for (int i=0; i<=stockFolders.length; i++) {
            if (stockFolders[i]!=null) {
                fileCount++;
            }
        }
        return fileCount; 
    }
    @Override
    public boolean isFileInFolder(String fileName) {
        for (int i=0; i<=stockFolders.length; i++) {
            if (stockFolders[i].getName().equals(fileName)) {
                return true;
            }
        }
        return false;
    }
    @Override
    public Folder addFolder(String folderName) throws FolderIsFullException, FileAlreadyExistsException {
        return null;
    }
    @Override
    public File addFile(String fileName) throws FolderIsFullException, FileAlreadyExistsException {
        return null;
    }
    @Override
    public File removeFile(String fileName) throws FileDoesNotExistsException {
        for (int i=0; i<=stockArchivos.length; i++) {
            if (stockArchivos[i].getName().equals(fileName)) {
                File anterior = stockArchivos[i];
                stockArchivos[i]=null;
                return anterior;
            }
        }
        throw new FileDoesNotExistsException();
    }
    @Override
    public File removeFolder(String folderName, boolean recursive) throws FileDoesNotExistsException, FolderIsNotEmptyException {
        File anterior;
        for (int i=0; i<=stockFolders.length; i++) {
            if (stockFolders[i].getName().equals(folderName)) { //se encuentra la carpeta en el array
                if (recursive) { //se borra todo
                    anterior = stockFolders[i];
                    stockFolders[i]=null;
                    return anterior;
                }
                else { //solo si no tiene archivos
                    for (int j=0; j<=stockFiles.length; j++) {
                        if 
                    }
                }
            }
        }
        throw new FileDoesNotExistsException();
    }
    @Override
    public Folder getFolder(String folderName) throws FileDoesNotExistsException {
        for (int i=0; i<=stockFolders.length; i++) {
            if (stockFolders[i].getName().equals(folderName)) {
                return stockFolders[i];
            }
        }
        throw new FileDoesNotExistsException();
    }
}