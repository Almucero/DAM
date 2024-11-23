package Ejercicio65;

public class Ejercicio65 {
    public static int solicitarAltura() {
        int altura;
        while (true) {
            try {
                System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
                altura = Integer.parseInt(System.console().readLine());
                if (altura>=3) {
                    break;
                }
                else {
                    System.out.print("Error. Debe introducir una altura mayor o igual a 3\n");
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
    public static int solicitarPalito(int altura) {
        int alturaPalito;
        while (true) {
            try {
                System.out.printf("Introduzca la fila del palito horizontal (entre 2 y %d): ", altura);
                alturaPalito = Integer.parseInt(System.console().readLine());
                System.err.println();
                if (alturaPalito>=2 && alturaPalito<=altura) {
                    break;
                }
                else {
                    System.out.printf("Error. La fila del palito debe estar entre 2 y %d%n", altura);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor válido: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e+"\n");
            }
        }
        return alturaPalito;
    }
    public static void piramideHueca(int altura, int alturaPalito) {
        for (int fila=1; fila<=altura; fila++) {
            for (int espaciosIzquierda=1; espaciosIzquierda<=(altura-fila); espaciosIzquierda++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int espaciosInternos=1; espaciosInternos<=(2*fila-3); espaciosInternos++) {
                if (fila==alturaPalito) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            if (fila>1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try {
            int altura = solicitarAltura();
            int alturaPalito = solicitarPalito(altura);
            piramideHueca(altura, alturaPalito);
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: "+e);
        }
    }
}