package Ejercicio20;

public class Ejercicio20 {
    public static void main(String[] args) {
        int capacidad;
        while (true) {
            try {
                System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
                capacidad = Integer.parseInt(System.console().readLine());
                if (capacidad>1) {
                    break;
                }
                else {
                    System.out.println("La capacidad de la cubra debe ser como mínimo 1");
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
        final int MAXIMO=capacidad;
        final int MINIMO=0;
        int aleatorio = (int)(Math.random()*(MAXIMO-MINIMO+1))+MINIMO;
        for (int i=capacidad; i>=1; i--) {
            if (i<=aleatorio) {
                System.out.println("#====#");
            }
            else {
                System.out.println("#    #");
            }
        }
        System.out.println("######");
    }
}