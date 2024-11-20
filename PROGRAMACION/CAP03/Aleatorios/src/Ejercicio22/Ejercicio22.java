package Ejercicio22;

public class Ejercicio22 {
    public static String generarEspacios(int numEspacios) {
        String espacios=" ";
        for (int i=1; i<=numEspacios; i++) {
            espacios = espacios+" ";
        }
        return espacios;
    }
    public static void main(String[] args) {
        int altura=0;
        while (true) {
            try {
                System.out.printf("Por favor, introduzca la longitud de la serpiente contando la cabeza: ");
                altura = Integer.parseInt(System.console().readLine());
                if (altura>=2) {
                    break;
                }
                else {
                    System.out.println("Error. La longitud de la serpiente debe ser como mínimo 2");
                    System.out.println();
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor válido: "+e);
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                System.out.println();
            }
        }
        int numEspacios=12;
        System.out.println(generarEspacios(numEspacios)+"@");
        for (int i=1; i<=altura-1; i++) {
            int aleatorio = (int)(Math.random()*3)+1;
            switch (aleatorio) {
                case 1-> numEspacios = numEspacios-1;
                case 2-> numEspacios = numEspacios+1;
            }
            System.out.println(generarEspacios(numEspacios)+"#");
        }
    }
}