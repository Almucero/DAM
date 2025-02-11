package Ejercicio6;

import java.io.*;
import java.util.HashMap;

public class Ejercicio6 {

    private static HashMap<String, Integer> palabras = new HashMap<String, Integer>();
    public static void main(String[] args) {
        if (args.length!=1) {
            System.out.println("Error en el número de argumentos");
        }
        else {
            try {
                BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
                String linea = "";
                while ((linea=br.readLine())!=null) {
                    if (palabras.containsKey(linea)) {
                        palabras.
                    }
                }
            }
            catch (IOException e) {
                System.out.println("Error al lerr o escribir los datos: "+e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado");
            }
        }
    }
}