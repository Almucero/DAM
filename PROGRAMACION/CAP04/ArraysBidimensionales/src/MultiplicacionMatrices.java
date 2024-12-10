public class MultiplicacionMatrices {
    public static int pedirMedida(String mensaje) {
        int medida=0;
        while (true) {
            try {
                System.out.print(mensaje);
                medida = Integer.parseInt(System.console().readLine());
                if (medida>=2) {
                    break;
                }
                else {
                    System.out.println("El tamaño de la matriz debe ser como mínimo 2\n");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un número entero: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e+"\n");
            }
        }
        return medida;
    }
    public static void rellenarMatriz(int[][] matriz) {
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j]=(int)(Math.random()*10);
            }
        }
    }
    public static void pintarMatriz(int[][] matriz) {
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int medidaA = pedirMedida("Introduzca el tamaño de la matriz A: ");
        System.out.println("Matriz A:");
        int matrizA[][] = new int[medidaA][medidaA];
        rellenarMatriz(matrizA);
        pintarMatriz(matrizA);
        
        int medidaB = pedirMedida("Introduzca el tamaño de la matriz B: ");
        System.out.println("Matriz B:");
        int matrizB[][] = new int[medidaB][medidaB];
        rellenarMatriz(matrizB);
        pintarMatriz(matrizB);

        int medidaC = pedirMedida("Introduzca el tamaño de la matriz C: ");
        System.out.println("Matriz C:");
        int matrizC[][] = new int[medidaC][medidaC];
        rellenarMatriz(matrizC);
        pintarMatriz(matrizC);

        System.out.println("Propieda asociativa: ");
    }
}