package Ejercicio30;

public class Ejercicio30 {
    private static int pedirMedidas(String mensaje, int minimo) {
        int medida;
        while (true) {
            try {
                System.out.print(mensaje);
                medida = Integer.parseInt(System.console().readLine());
                if (medida>=minimo) {
                    break;
                }
                else {
                    System.out.println("Error. La medida debe ser mayor o igual a "+minimo);
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir una medida válida: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado al introducir la medida: "+e+"\n");
            }
        }
        return medida;
    }
    public static int posicionSeres(int altura_o_anchura) {
        final int MAXIMO=altura_o_anchura-1, MINIMO=2;
        int posicionSer = (int)(Math.random()*(MAXIMO-MINIMO+1))+MINIMO;
        return posicionSer;
    }
    public static void pintarPeceraConSeres(int altura, int anchura) {
        int posicionVerticalPez, posicionHorizontalPez, posicionVerticalCaracola, posicionHorizontalCaracola;
        int posicionVerticalCaballito = posicionSeres(altura), posicionHorizontalCaballito = posicionSeres(anchura);
        while (true) {
            posicionVerticalPez = posicionSeres(altura); posicionHorizontalPez = posicionSeres(anchura);
            if (posicionVerticalCaballito!=posicionVerticalPez && posicionHorizontalCaballito!=posicionHorizontalPez) {
                break;
            }
        }
        while (true) {
            posicionVerticalCaracola = posicionSeres(altura); posicionHorizontalCaracola = posicionSeres(anchura);
            if (posicionVerticalCaracola!=posicionVerticalCaballito && posicionHorizontalCaracola!=posicionHorizontalCaballito && 
                posicionVerticalCaracola!=posicionVerticalPez && posicionHorizontalCaracola!=posicionHorizontalPez ) {
                break;
            }
        }
        for (int i=1; i<=altura; i++) {
            for (int j=1; j<=anchura; j++) {
                if (i==posicionVerticalCaballito && j==posicionHorizontalCaballito) {
                    System.out.print("$ ");
                }
                else if (i==posicionVerticalPez && j==posicionHorizontalPez) {
                    System.out.print("& ");
                }
                else if (i==posicionVerticalCaracola && j==posicionHorizontalCaracola) {
                    System.out.print("@ ");
                }
                else if (i==1 || i==altura || j==1 || j==anchura) {
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
            int altura = pedirMedidas("Por favor, introduzca la altura de la pecera (como mínimo 4): ", 4);
            int anchura = pedirMedidas("Ahora introduzca la anchura (como mínimo 4): ", 4);
            pintarPeceraConSeres(altura, anchura);
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: "+e);
        }
    }
}