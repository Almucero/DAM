package Ejercicio10;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        System.out.println("""
            Este programa calcula la media de los números positivos introducidos.
            Para parar, introduzca un número negativo.
            Vaya introduciendo números: """);
        int num = 0;
        int media = 0;
        int numeros = 0;
        do {
            try {
                media+=num;
                numeros++;
                num = Integer.parseInt(System.console().readLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Introduzca solo números enteros");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
            }
        }
        while (num>=0);
        System.out.printf("La media de los números positivos introducidos es %.2f", (double)media/((numeros>0)?numeros:1 ));
    }
}
