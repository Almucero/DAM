package Ejercicio50;

public class Ejercicio50 {
    public static void primeraParte(int numEspacios) {
        System.out.print("*");
        for (int i=1; i<=numEspacios; i++) {
            System.out.print(" ");
        }
        System.out.print("****");
        for (int i=1; i<=numEspacios; i++) {
            System.out.print(" ");
        }
        System.out.printf("****%n");
    }
    public static void segundaParte(int numEspacios) {
        System.out.print("*");
        for (int i=1; i<=numEspacios; i++) {
            System.out.print(" ");
        }
        System.out.print("*   ");
        for (int i=1; i<=numEspacios; i++) {
            System.out.print(" ");
        }
        System.out.printf("*   %n");
    }
    public static void terceraPArte(int altura, int numEspacios) {
        for (int i=1; i<=altura; i++) {
            System.out.print("*");
            for (int j=1; j<=numEspacios; j++) {
                System.out.print(" ");
            }
            System.out.print("   *");
            for (int j=1; j<=numEspacios; j++) {
                System.out.print(" ");
            }
            System.out.printf("   *%n");
        }
    }
    public static void main(String[] args) throws Exception{
        boolean cerrar=false;
        boolean alturaAceptada=false;
        boolean numEspaciosAceptado=false;
        int altura=0;
        int numEspacios=0;
        while (cerrar!=true) {
            try {
                while (alturaAceptada!=true) {
                    try {
                        System.out.print("Introduzca la altura (5 como mínimo): ");
                        altura = Integer.parseInt(System.console().readLine());
                        if (altura<5) {
                            System.out.println("Error. La altura debe ser 5 como mínimo");
                            System.out.println();
                        }
                        else {
                            altura = altura-4;
                            alturaAceptada=true;
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido para la altura");
                        System.out.println();
                    }
                }
                while (numEspaciosAceptado!=true) {
                    try {
                        System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
                        numEspacios = Integer.parseInt(System.console().readLine());
                        if (numEspacios<1) {
                            System.out.println("Error. El valor mínimo para los espacios es 1");
                            System.out.println();
                        }
                        else {
                            numEspaciosAceptado=true;
                        }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido para los espacios");
                        System.out.println();
                    }
                }
                primeraParte(numEspacios);
                segundaParte(numEspacios);
                primeraParte(numEspacios);
                terceraPArte(altura, numEspacios);
                primeraParte(numEspacios);
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}