package Ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {
        if (args.length!=2) {
            System.out.println("Error en el número de argumentos");
        }
        else {
            try {
                BufferedReader br1 = new BufferedReader(new FileReader(new File(args[0])));
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File(args[1])));
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