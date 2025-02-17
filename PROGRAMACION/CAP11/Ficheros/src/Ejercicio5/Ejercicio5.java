package Ejercicio5;

import java.io.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        if (args.length!=2) {
            System.out.println("Error en el número de argumentos");
        }
        else {
            try {
                BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File(args[1])));
                String linea = "";
                boolean comentarioBloque = false;
                while ((linea=br.readLine())!=null) {
                    String unaLinea = "";
                    for (int i=0; i<linea.length(); i++) {
                        if (!comentarioBloque) {
                            if (linea.charAt(i)=='/' && linea.charAt(i+1)=='/') {
                                break;
                            }
                            if (linea.charAt(i)=='/' && linea.charAt(i+1)=='*') {
                                comentarioBloque = true;
                                i += 2;
                            }
                        }
                        if (comentarioBloque) {
                            if (linea.charAt(i)=='*' && linea.charAt(i+1)=='/') {
                                comentarioBloque = false;
                                i += 2;
                            }
                        }
                        else {
                            unaLinea += linea.charAt(i);
                        }
                        i++;
                    }
                    if (!comentarioBloque && unaLinea.length()>0) {
                        bw.write(unaLinea+"\n");
                    }
                }
                br.close();
                bw.close();
            }
            catch (IOException e) {
                System.out.println("Error al leer los datos");
            }
        }
    }
}