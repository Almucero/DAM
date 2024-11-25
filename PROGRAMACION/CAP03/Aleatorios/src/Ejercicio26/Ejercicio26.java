package Ejercicio26;

public class Ejercicio26 {
    private static int pedirMedidas(String mensaje) {
        int medida;
        while (true) {
            try {
                System.out.print(mensaje);
                medida = Integer.parseInt(System.console().readLine());
                if (medida>=3) {
                    break;
                }
                else {
                    System.out.println("Error. La medida mínima es 3\n");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Medida no válida: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado al introducir la medida: "+e+"\n");
            }
        }
        return medida;
    }
    private static void pintarTabletaConBocado(int altura, int anchura) {
        int extremoBocado = (int)(Math.random()*4)+1;
        int posicionVertical=0, posicionHorizontal=0;
        int MAXIMO_VERTICAL=0, MINIMO_VERTICAL=0, MAXIMO_HORIZONTAL=0, MINIMO_HORIZONTAL=0;
        switch (extremoBocado) {
            case 1 -> { // borde superior
                MAXIMO_VERTICAL=1; MINIMO_VERTICAL=1;
                MAXIMO_HORIZONTAL=anchura; MINIMO_HORIZONTAL=1;
            }
            case 2 -> { // borde derecha
                MAXIMO_VERTICAL=altura; MINIMO_VERTICAL=1;
                MAXIMO_HORIZONTAL=anchura; MINIMO_HORIZONTAL=anchura;
            }
            case 3 -> { // borde inferior
                MAXIMO_VERTICAL=altura; MINIMO_VERTICAL=altura; 
                MAXIMO_HORIZONTAL=anchura; MINIMO_HORIZONTAL=1;
            }
            case 4 -> { // borde izquierda
                MAXIMO_VERTICAL=altura; MINIMO_VERTICAL=1;
                MAXIMO_HORIZONTAL=1; MINIMO_HORIZONTAL=1;
            }
        }
        posicionVertical = (int)(Math.random()*(MAXIMO_VERTICAL-MINIMO_VERTICAL+1))+MINIMO_VERTICAL;
        posicionHorizontal = (int)(Math.random()*(MAXIMO_HORIZONTAL-MINIMO_HORIZONTAL+1))+MINIMO_HORIZONTAL;
        for (int i=1; i<=altura; i++) {
            for (int j=1; j<=anchura; j++) {
                if (i==posicionVertical && j==posicionHorizontal) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try {
            int anchura = pedirMedidas("Introduzca la anchura de la tableta: ");
            int altura = pedirMedidas("Introduzca la altura de la tableta: ");
            pintarTabletaConBocado(altura, anchura);
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: "+e);
        }
    }
}