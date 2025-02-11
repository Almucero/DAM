package Ejercicio1;

import java.io.*;

public class Ejercicio1 {
    
    private static boolean esPrimo(int valor) {
        for (int i=2; i<=valor/2; i++) {
            if (valor%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("primos.dat")));
            for (int i=0; i<=500; i++) {
                if (esPrimo(i)) {
                    bw.write(i+"\n");
                }
            }
            bw.close();
        }
        catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
        catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado");
        }
    }
}