package Ejercicio4;

import java.io.*;
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        if (args.length!=1) {
            System.out.println("Error en el número de argumentos");
        }
        else {
            try {
                ArrayList<String> palabras = new ArrayList<String>();
                BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
                String linea = "";
                while ((linea=br.readLine())!=null) {
                    palabras.add(linea);
                }
                br.close();

                Collections.sort(palabras);
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File(args[0]+".sort")));
                for (String palabra:palabras) {
                    bw.write(palabra+"\n");
                }
                bw.close();
            }
            catch (IOException e) {
                System.out.println("Error al leer o escribir los datos: "+e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado: "+e.getMessage());
            }
        }
    }
}