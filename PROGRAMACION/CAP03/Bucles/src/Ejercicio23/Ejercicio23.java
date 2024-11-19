package Ejercicio23;

public class Ejercicio23 {
    public static void main(String[] args) {
        System.out.print("""
            Por favor, vaya introduciendo números.
            El programa terminará cuando la suma de los números sea mayor que 10000.
            """);
        boolean cerrar=false;
        int num=0;
        int sumaNumeros=0;
        int veces=0;
        while (cerrar!=true) {
            try {
                num = Integer.parseInt(System.console().readLine());
                sumaNumeros=sumaNumeros+num;
                veces++;
                if (sumaNumeros>10000) {
                    cerrar=true;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un número entero");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                break;
            }
        }
        double mediaNumeros = (double)sumaNumeros/veces;
        System.out.println("Ha introducido un total de "+veces+" números.");
        System.out.println("La suma total es "+sumaNumeros+".");
        System.out.printf("La media es %.1f", mediaNumeros);
    }
}