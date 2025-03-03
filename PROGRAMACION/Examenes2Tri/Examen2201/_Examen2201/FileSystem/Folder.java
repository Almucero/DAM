package FileSystem;

import java.util.ArrayList;

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
public class Folder extends File implements FolderEntry {
    private ArrayList<File> lista;
    private Folder parent;

    public Folder(Folder parent, String folderName, int nivel) {
        super(folderName, nivel);
        this.parent = parent;
        this.lista = new ArrayList<File>();
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    @Override
    public Folder getParent() {
        return this.parent;
    }

    @Override
    public boolean isFolderFull() {
        if (getFileCount()==100) {
            return true;
        }
        return false;
    }

    @Override
    public int getFileCount() {
        int fileCount = 0;
        for (int i=0; i<lista.size(); i++) {
            if (lista.get(i)!=null) {
                fileCount++;
            }
        }
        return fileCount;
    }

    @Override
    public boolean isFileInFolder(String fileName) {
        try {
            getFolder(fileName);
            return true;
        }
        catch (FileDoesNotExistsException e) {
            return false;
        }
    }

    @Override
    public Folder addFolder(String folderName) throws FolderIsFullException, FileAlreadyExistsException {
        if (isFolderFull()) {
            throw new FolderIsFullException();
        }
        if (isFileInFolder(folderName)) {
            throw new FileAlreadyExistsException();
        }
        Folder newFolder = new Folder(this, folderName, getNivel()+1);
        lista.add(newFolder);
        return newFolder;
    }

    @Override
    public File addFile(String fileName) throws FolderIsFullException, FileAlreadyExistsException {
        if (isFolderFull()) {
            throw new FolderIsFullException();
        }
        if (isFileInFolder(fileName)) {
            throw new FileAlreadyExistsException();
        }
        File newFile = new File(fileName, getNivel()+1);
        lista.add(newFile);
        return newFile;
    }

    @Override
    public File removeFile(String fileName) throws FileDoesNotExistsException {
        for (int i=0; i<lista.size(); i++) {
            if (lista.get(i)!=null && lista.get(i).getName().equals(fileName)) {
                File deletedFile = lista.get(i);
                lista.remove(i);
                return deletedFile;
            }
        }
        throw new FileDoesNotExistsException();
    }

    @Override
    public File removeFolder(String folderName, boolean recursive) throws FileDoesNotExistsException, FolderIsNotEmptyException {
        for (int i=0; i<lista.size(); i++) {
            if (lista.get(i)!=null && lista.get(i).getName().equals(folderName)) {
                Folder deletedFolder = (Folder)lista.get(i);
                if (!recursive) {
                    if (deletedFolder.getFileCount()!=0) {
                        throw new FolderIsNotEmptyException();
                    }
                }
                lista.remove(i);
                return deletedFolder;
            }
        }
        throw new FileDoesNotExistsException();
    }

    @Override
    public Folder getFolder(String folderName) throws FileDoesNotExistsException {
        for (int i=0; i<lista.size(); i++) {
            if (lista.get(i)!=null && lista.get(i).getName().equals(folderName)) {
                return (Folder)lista.get(i);
            }
        }
        throw new FileDoesNotExistsException();
    }

    @Override
    public String toString() {
        return String.format("%s(%s)\n", generarEspacios(2*getNivel()), getName());
    }
}

