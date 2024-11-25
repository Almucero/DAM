package Ejercicio17;

public class Ejercicio17 {
    private static int solicitarMedidas(String mensaje) {
        int medida;
        while (true) {
            try {
                System.out.print(mensaje);
                medida = Integer.parseInt(System.console().readLine());
                if (medida>=4) {
                    break;
                }
                else {
                    System.out.println("Error. La medida debe ser de como mínimo 4\n");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un valor válido: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e+"\n");
            }
        }
        return medida;
    }
    private static void pintarPeceraConPez(int altura, int anchura) {
        final int MAXIMO_VERTICAL = altura-1, MINIMO_VERTICAL = 2;
        int posicionVertical = (int)(Math.random()*(MAXIMO_VERTICAL-MINIMO_VERTICAL+1))+MINIMO_VERTICAL;
        final int MAXIMO_HORIZONTAL = anchura-1, MINIMO_HORIZONTAL = 2;
        int posicionHorizontal = (int)(Math.random()*(MAXIMO_HORIZONTAL-MINIMO_HORIZONTAL+1))+MINIMO_HORIZONTAL;
        for (int i=1; i<=altura; i++) {
            for (int j=1; j<=anchura; j++) {
                if (i==posicionVertical && j==posicionHorizontal) {
                    System.out.print("& ");
                }
                else if (i==1 || i==altura ||j==1 || j==anchura) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try {
            int altura = solicitarMedidas("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
            int anchura = solicitarMedidas("Ahora introduzca la anchura (como mínimo 4): ");
            pintarPeceraConPez(altura, anchura);
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: "+e+"\n");
        }
    }
}