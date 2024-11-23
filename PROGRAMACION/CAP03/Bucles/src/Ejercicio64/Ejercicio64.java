package Ejercicio64;

public class Ejercicio64 {
    public static String numEspacios(int anchura) {
        String espacios="";
        for (int i=1; i<=anchura-2; i++) {
            espacios = espacios+" ";
        }
        return espacios;
    }
    public static void pintarCuadrado(int altura, int anchura) {
        for (int i=1; i<=altura; i++) {
            if (i==1 || i==altura) {
                for (int j=1; j<=anchura; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                System.out.println("*"+numEspacios(anchura)+"*");
            }
        }
    }
    public static int menu() {
        System.out.printf("1. Agrandarlo%n2. Achicarlo%n3. Cambiar la orientación%n4. Salir%n");
        int eleccion;
        while (true) {
            try {
                System.out.print("Indique que quiere hacer con el rectángulo: ");
                eleccion = Integer.parseInt(System.console().readLine());
                if (eleccion==1 || eleccion==2 || eleccion==3 || eleccion==4) {
                    break;
                }
                else {
                    System.out.println("Error. Debe introducir un valor válido\n");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor válido: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e+"\n");
            }
        }
        return eleccion;
    }
    public static void main(String[] args) {
        int altura=3, anchura=6;
        pintarCuadrado(3, 6);
        while (true) {
            int eleccion = menu();
            switch (eleccion) {
                case 1-> {
                    altura += 1;
                    anchura += 1;
                    pintarCuadrado(altura, anchura);
                }
                case 2-> {
                    altura -= 1;
                    anchura -= 1;
                    pintarCuadrado(altura, anchura);
                }
                case 3-> {
                    int temp = altura;
                    altura = anchura;
                    anchura = temp;
                    pintarCuadrado(altura+1, anchura-1);
                }
                case 4-> {
                    return;
                }
            }
        }
    }
}