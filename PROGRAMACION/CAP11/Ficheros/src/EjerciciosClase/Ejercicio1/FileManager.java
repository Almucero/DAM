package EjerciciosClase.Ejercicio1;

import java.io.*;
import java.util.*;

public class FileManager implements FileOperations{
    private File file;
    
    public FileManager(String fileName) throws IOException{
        this.file  = new File(fileName);
    }

    public List<String> leer() throws FileNotFoundException, IOException {
        if(!file.exists()) {
            return new ArrayList<>();
        }
        BufferedReader br = new BufferedReader(new FileReader(this.file));
        ArrayList<String> lineas = new ArrayList<String>();
        String linea = "";
        while((linea = br.readLine())!=null){
            lineas.add(linea);
        }
        br.close();
        return lineas;
    }

    public void escribir(List<String> lineas) throws FileNotFoundException, IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(this.file));
        for(String linea:lineas){
            bw.write(linea+"\n");
        }
        bw.close();
    }

    public void borrarArchivo() throws SecurityException{
        file.delete();
    }
}