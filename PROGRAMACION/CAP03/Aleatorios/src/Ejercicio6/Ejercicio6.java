package Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numPensado=(int)(Math.random()*100)+1;
        int contador=5;
        int num=0;
        System.out.println("Estoy pensando un número del 0 al 100, intenta adivinarlo. Tienes 5 oportunidades.");
        while (true) {
            boolean numAceptado=false;
            while (numAceptado!=true) {
                try {
                    System.out.print("Introduce un número: ");
                    num = Integer.parseInt(System.console().readLine());
                    numAceptado=true;
                }
                catch (NumberFormatException e) {
                    System.out.print("Error. Debe introducir un valor válido: "+e);
                    System.out.println();
                }
                catch (Exception e) {
                    System.out.print("Ocurrió un error inesperado: "+e);
                    System.out.println();
                }
            }
            if (contador==1) {
                System.out.printf("Lo siento, no has acertado, el número que estaba pensando era el %d", numPensado);
                break;
            }
            if (numPensado>num) {
                System.out.printf("El número que estoy pensando es mayor que %d%n", num);
            }
            else if (numPensado<num) {
                System.out.printf("El número que estoy pensando es menor que %d%n", num);
            }
            else {
                System.out.println("¡Enhorabuena! ¡has acertado!");
                break;
            }
            contador--;
            System.out.printf("Te quedan %d oportunidades%n", contador);
        }
    }
}