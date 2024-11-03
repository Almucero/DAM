package Ejercicio15;

public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        long exponenteMaximo=0;
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
                    System.out.print("Introduzca el exponente máximo: ");
                    exponenteMaximo = Integer.parseInt(System.console().readLine());
                    exponenteValido=true;
                }
                catch (NumberFormatException e) {
                    System.out.println("Error. Debe introducir un valor válido para el exponente máximo");
                    System.out.println();
                }
            }
            for (long i=0; i<exponenteMaximo; i++) {
                long resultado=1;
                for (long j=0; j<i; j++) {
                    resultado = resultado*base;
                }
                System.out.println(base+"^"+exponenteMaximo+" = "+resultado);
            }
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
    }
}