package Ejercicio7;

public class Ejercicio7 {
    public static void main(String args[]) throws Exception {
        int codigoCorrecto = 8888;
        int numIntentos = 1;
        do {
            System.out.print("Introduzca la clave de la caja fuerte: ");
            try {
                int codigoIntroducido = Integer.parseInt(System.console().readLine());
                if (codigoIntroducido==codigoCorrecto) {
                    System.out.println("Ha abierto la caja fuerte.");
                    break;
                }
                else if (numIntentos==4) {
                    System.out.println("Lo siento, ha agotado las 4 oportunidades.");
                    break;
                }
                else {
                    System.out.println("Clave incorrecta");
                    numIntentos ++;
                }
            }
            catch (NumberFormatException e) {
                if (numIntentos==4) {
                    System.out.println("Lo siento, ha agotado las 4 oportunidades.");
                    break;
                }
                else {
                    System.out.println("Error. Debe introducir una clave numérica");
                    numIntentos ++;
                }
            } 
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                break;
            }
        }
        while (numIntentos<=4);
    }
}