package Ejercicio21;

public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println("""
                            Por favor, vaya introduciendo números enteros.
                            Puede terminar mediante la introducción de un número negativo.
                            """);
        boolean cerrar=false;
        int num=0;
        int positivos=0;
        while (cerrar!=true) {
            try {
                num = Integer.parseInt(System.console().readLine());
                if (num<0) {
                    cerrar=true;
                }
                else {
                    positivos++;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor correcto");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                break;
            }
        }
        System.out.println("Ha introducido un total de "+positivos+" números positivos");
    }
}