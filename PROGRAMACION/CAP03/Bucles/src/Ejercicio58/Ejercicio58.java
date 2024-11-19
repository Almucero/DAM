package Ejercicio58;

public class Ejercicio58 {
    public static void main(String[] args) {
        int num=0;
        int suma=0;
        int contador=0;
        while (true) {
            try {
                while (true) {
                    try {
                        System.out.print("Introduzca un número: ");
                        num = Integer.parseInt(System.console().readLine());
                        break;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un valor válido: "+e);
                        System.out.println();
                    }
                }
                while (num!=0) {
                    int digito = num%10;
                    suma = suma+digito;
                    num = num/10;
                    contador++;
                }
                System.out.printf("La media de sus dígitos es %.1f", (double)suma/contador);
                break;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e);
                break;
            }
        }
    }
}