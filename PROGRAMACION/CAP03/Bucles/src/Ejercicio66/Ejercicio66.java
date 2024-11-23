package Ejercicio66;

public class Ejercicio66 {
    public static int solicitarAltura() {
        int altura;
        while (true) {
            try {
                System.out.print("Por favor, introduzca la altura de la figura: ");
                altura = Integer.parseInt(System.console().readLine());
                if (altura>=3 && altura%2!=0) {
                    break;
                }
                else {
                    System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3\n");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor válido: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e+"\n");
            }
        }
        return altura;
    }
    public static String generarEspacios(int numEspacios) {
        String espacios="";
        for (int i=1; i<=numEspacios; i++) {
            espacios = espacios+" ";
        }
        return espacios;
    }
    public static void main(String[] args) {
        int altura = solicitarAltura();
        int numEspacios=0;
        for (int i=1; i<=altura; i++) {
            if (i<(altura/2)+1) {
                System.out.println(generarEspacios(numEspacios)+"*    *");
                numEspacios++;
            }
            else {
                System.out.println(generarEspacios(numEspacios)+"*    *");
                numEspacios--;
            }
        }
    }
}