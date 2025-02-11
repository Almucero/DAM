package Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio3 {
    public static void main(String[] args) {
        if (args.length!=2) {
            System.out.println("Error en el número de argumentos");
            return;
        }
        else {
            try {
                File file1 = new File(args[0]);
                File file2 = new File(args[1]);
                File file3 = new File(args[2]);
                BufferedReader br1 = new BufferedReader(new FileReader(file1));
                BufferedReader br2 = new BufferedReader(new FileReader(file2));
                BufferedWriter bw = new BufferedWriter(new FileWriter(file3));
                String linea1="";
                String linea2="";
                
            }
            catch (Exception e) {}
        }
    }
}