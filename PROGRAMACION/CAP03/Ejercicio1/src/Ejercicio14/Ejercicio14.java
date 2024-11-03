package Ejercicio14;

public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        System.out.println("Calculo de una potencia");
        long exponente=0;
        long base=0;
        boolean baseValida=false;
        boolean exponenteValido=false;
        try {
            while (baseValida!=true) {
                try {
                    System.out.print("Introduzca la base: ");
                    base = Integer.parseInt(System.console().readLine());
                    baseValida=true;
                }
                catch (NumberFormatException e) {
                    System.out.println("Error. Debe introducir un valor válido para la base");
                    System.out.println();
                }
            }
            while (exponenteValido!=true) {
                try {
                    System.out.print("Introduzca el exponente: ");
                    exponente = Integer.parseInt(System.console().readLine());
                    exponenteValido=true;
                }
                catch (NumberFormatException e) {
                    System.out.println("Error. Debe introducir un valor válido para el exponente");
                    System.out.println();
                }
            }
            long resultado=1;
            for (long i=0; i<exponente; i++) {
                resultado = resultado*base;
            }
            System.out.println(base+"^"+exponente+" = "+resultado);
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}