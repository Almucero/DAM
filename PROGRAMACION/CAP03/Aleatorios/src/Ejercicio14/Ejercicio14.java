package Ejercicio14;

public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.printf("Piensa un número del 0 al 100. Intentaré adivinarlo en 5 intentos.%n");
        System.out.printf("Pulsa la tecla INTRO cuando estés preparado.%n");
        System.console().readLine();
        int contador=5;
        int maximo=100;
        int minimo=0;
        while (true) {
            int aleatorio = (int)(Math.random()*(maximo-minimo+1))+minimo;
            System.out.printf("¿Es el %d?%n", aleatorio);
            while (true) {
                try {
                    System.out.print("El número que estás pensando es 1) mayor 2) menor 3) el mismo: ");
                    int opcion = Integer.parseInt(System.console().readLine());
                    if (opcion==1 || opcion==2 || opcion==3) {
                        switch (opcion) {
                            case 1-> {
                                minimo=aleatorio+1;
                            }
                            case 2-> {
                                maximo=aleatorio-1;
                            }
                            case 3-> {
                                System.out.println("¡Bien! ¡he acertado!");
                                return;
                            }
                        };
                        break;
                    }
                    else {
                        System.out.println("Error. Debe introducir una opción válida");
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
            if (contador==1) {
                System.out.println("Vaya, no he conseguido adivinar el número");
                return;
            }
            contador--;
        }
    }
}