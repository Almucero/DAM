package Ejercicio29;

public class Ejercicio29 {
    public static String clima(int estacion) {
        double probSoleado;
        if (estacion==1) {
            probSoleado=(double)60/100;
        }
        else if (estacion==2) {
            probSoleado=(double)80/100;
        }
        else if (estacion==3) {
            probSoleado=(double)40/100;
        }
        else {
            probSoleado=(double)20/100;
        }
        double aleatorio = Math.random();
        if (aleatorio<=probSoleado) {
            return "Soleado";
        }
        else {
            return "Nublado";
        }
    }
    public static int temperatura(int estacion) {
        final int MINIMA, MAXIMA;
        if (estacion==1) {
            MINIMA=15;
            MAXIMA=30;
        }
        else if (estacion==2) {
            MINIMA=25;
            MAXIMA=45;
        }
        else if (estacion==3) {
            MINIMA=20;
            MAXIMA=30;
        }
        else {
            MINIMA=0;
            MAXIMA=25;
        }
        return (int)(Math.random()*(MAXIMA-MINIMA+1))+MINIMA;
    }
    public static void main(String[] args) {
        System.out.printf("1. Primavera%n2. Verano%n3. Otoño%n4. Invierno%n");
        int estacion, temperaturaMaxima;
        while (true) {
            try {
                System.out.print("Seleccione la estación del año (1-4): ");
                estacion = Integer.parseInt(System.console().readLine());
                if (estacion<=4 && estacion>=1) {
                    System.out.println();
                    break;
                }
                else {
                    System.out.println("Error. Debe introducir una estación válida\n");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor válido: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e+"\n");
            }
        }
        System.out.println("Previsión del tiempo para mañana");
        System.out.println("--------------------------------");
        int temperaturaMinima = temperatura(estacion);
        do {
            temperaturaMaxima=temperatura(estacion);
        } 
        while (temperaturaMaxima<temperaturaMinima);
        System.out.printf("Temperatura mínima: %dºC%n", temperaturaMinima);
        System.out.printf("Temperatura máxima: %dºC%n", temperaturaMaxima);
        System.out.print(clima(estacion));
    }
}