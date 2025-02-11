package Ejercicio2;

import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("primos.dat")));
            String linea = "";
            while ((linea=br.readLine())!=null) {
                System.out.println(linea);
            }
        }
        catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado");
        }
    }
}