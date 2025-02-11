package Ejercicio3;

import java.io.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        if (args.length!=3) {
            System.out.println("Error en el número de argumentos");
        }
        else {
            try {
                BufferedReader br1 = new BufferedReader(new FileReader(new File(args[0])));
                BufferedReader br2 = new BufferedReader(new FileReader(new File(args[1])));
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File(args[2])));
                String linea1 = "";
                String linea2 = "";
                while (linea1!=null || linea2!=null) {
                    linea1 = br1.readLine();
                    if (linea1!=null) {
                        bw.write(linea1+"\n");
                    }
                    linea2 = br2.readLine();
                    if (linea2!=null) {
                        bw.write(linea2+"\n");
                    }
                }
                br1.close();
                br2.close();
                bw.close();
            }
            catch (IOException e) {
                System.out.println("Error al leer o escribir los datos: "+e.getMessage());
            }
            catch (Exception e) {
                System.out.println("Ha ocurrido un error inesperado");
            }
        }
    }
}