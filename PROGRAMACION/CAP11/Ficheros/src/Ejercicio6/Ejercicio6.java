package Ejercicio6;

import java.io.*;
import java.util.HashMap;

public class Ejercicio6 {

    private static HashMap<String, Integer> repeticiones = new HashMap<String, Integer>();
    public static void main(String[] args) {
        if (args.length!=2) {
            System.out.println("Error en el número de argumentos");
        }
        else {
            try {
                BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
                String palabra = args[1];
                Integer veces = 0;
                String linea = "";
                while ((linea=br.readLine())!=null) {
                    if (linea.equals(palabra)) {
                        repeticiones.put(palabra, veces++);
                    }
                }
                System.out.println("La palabra "+palabra+" aparece "+veces+" veces");
                br.close();
            }
            catch (IOException e) {
                System.out.println("Ha ocurrido un error al leer los datos");
            }
        }
    }
}