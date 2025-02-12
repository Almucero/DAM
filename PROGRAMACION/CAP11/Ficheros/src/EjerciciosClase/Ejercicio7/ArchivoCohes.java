package EjerciciosClase.Ejercicio7;

import java.io.*;
import EjerciciosClase.Ejercicio7.Excepciones.CocheYaExisteException;

public class ArchivoCohes {
    private static final String nombreFichero = "coches.txt";

    public static void guardarCoches(GestorCoches gestor) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(nombreFichero)));
            bw.write(gestor.toString());
            bw.close();
        }
        catch (IOException e) {
            System.out.println("Error al guardar los datos en el fichero");
        }
    }

    public static void leerYCargarCoches(GestorCoches gestor) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(nombreFichero)));
            String linea = "";
            while ((linea=br.readLine())!=null) {
                if (!linea.startsWith("=")) {
                    String[] partes = linea.split(", ");
                    String marca = partes[1].split(": ")[1];
                    String modelo = partes[2].split(": ")[1];
                    int anioFabricacion = Integer.parseInt(partes[3].split(": ")[1]);
                    double precio = Double.parseDouble(partes[4].split(": ")[1].replace(",", "."));
                    while (true) { //Por si se genera misma id
                        try {
                            gestor.añadirCoche(new Coche(marca, modelo, anioFabricacion, precio));
                            break;
                        }
                        catch (CocheYaExisteException e) {} 
                    }
                }
            }
            br.close();
        }
        catch (IOException e) {
            System.out.println("Ocurrió un error al leer los datos");
        }
    }

    public static int devolverNumeroLineas() {
        int numLineas = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(nombreFichero)));
            String linea = "";
            while ((linea=br.readLine())!=null) {
                numLineas++;
            }
            br.close();
        }
        catch (IOException e) {
            System.out.println("Error al leer los datos del fichero");
        }
        return numLineas;
    }
}