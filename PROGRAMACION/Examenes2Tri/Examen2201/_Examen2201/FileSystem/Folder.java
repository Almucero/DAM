package FileSystem;

import java.util.Date;

public class Folder extends File implements FolderEntry {

    public Folder(String fileName, int nivel, Date createdAt) {
            super(fileName, nivel, createdAt);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public Folder getParent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getParent'");
    }

    @Override
    public boolean isFolderFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFolderFull'");
    }

    @Override
    public int getFileCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFileCount'");
    }

    @Override
    public boolean isFileInFolder(String fileName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFileInFolder'");
    }

    @Override
    public Folder addFolder(String folderName) throws FolderIsFullException, FileAlreadyExistsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addFolder'");
    }

    @Override
    public File addFile(String fileName) throws FolderIsFullException, FileAlreadyExistsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addFile'");
    }

    @Override
    public File removeFile(String fileName) throws FileDoesNotExistsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFile'");
    }

    @Override
    public File removeFolder(String folderName, boolean recursive)
            throws FileDoesNotExistsException, FolderIsNotEmptyException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFolder'");
    }

    @Override
    public Folder getFolder(String folderName) throws FileDoesNotExistsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFolder'");
    }

}
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
