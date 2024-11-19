package Ejercicio21;

public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.print("""
            Por favor, vaya introduciendo números enteros.
            Puede terminar mediante la introducción de un número negativo.
            """);
        boolean cerrar=false;
        int num=0;
        int positivos=0;
        int maxPar=0;
        int impares=0;
        int sumaImpares=0;
        boolean hayPar=false;
        while (cerrar!=true) {
            try {
                num = Integer.parseInt(System.console().readLine());
                if (num<0) {
                    cerrar=true;
                }
                else {
                    positivos++;
                    if (num%2==0) {
                        hayPar=true;
                        if (num>=maxPar) {
                            maxPar=num;
                        }
                    }
                    else {
                        impares++;
                        sumaImpares=sumaImpares+num;
                    }
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor correcto.");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado.");
                break;
            }
        }
        System.out.println("Ha introducido un total de "+positivos+" números positivos.");
        if (impares>0) {
            double mediaImpares = (double)sumaImpares/impares;
            System.out.println("La media de los impares es "+mediaImpares+".");
        }
        else {
            System.out.println("No se introdujeron números impares.");
        }
        if (hayPar) {
            System.out.println("El máximo de los pares es "+maxPar+".");
        }
        else {
            System.out.println("No se introdujeron números pares.");
        }
    }
}