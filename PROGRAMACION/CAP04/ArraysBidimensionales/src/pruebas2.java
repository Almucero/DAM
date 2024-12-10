public class pruebas2 {
    private static int[][] rellenaMatriz(int fila, int columna) {
        int[][] matriz = new int[fila][columna];
        for (int i=0; i<fila; i++) { //fila = matriz.lenght
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
        return matriz;
    }
    private static void pintarMatriz(int[][] matriz) {
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
    private static int[][] identidad(int tamanio) {
        int[][] identidad = new int[tamanio][tamanio];
        for (int i=0; i<identidad.length; i++) {
            identidad[i][i]=1;
        }
        return identidad;
    }
    private static boolean sonIguales(int[][] m1, int[][] m2) {
        if (m1==null && m2==null) {
            return true;
        }
        if (m1==null || m2==null || m1.length!=m2.length || m1[0].length!=m2[0].length) {
            return false;
        }
        for (int i=0; i<m1.length; i++) {
            for (int j=0; j<m1[i].length; j++) {
                if (m1[i][j]!=m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    private static int[][] sumar(int[][] m1, int[][] m2) {
        if (m1==null || m2==null || m1.length!=m2.length || m1[0].length!=m2[0].length) {
            return null;
        }
        int suma[][] = new int[m1.length][m1[0].length];
        for (int i=0; i<m1.length; i++) {
            for (int j=0; j<m1[i].length; j++) {
                suma[i][j] = m1[i][j]+m2[i][j];
            }
        }
        return suma;
    }
    private static int[][] multiplica(int[][] m1, int[][] m2) {
        if (m1==null || m2==null || m1[0].length!=m2.length) {
            return null;
        }
        int[][] multiplica = new int[m1.length][m2[0].length];
        for (int i=0; i<m1.length; i++) {
            for (int j=0; i<m2[0].length; j++) {
                multiplica[i][j]=0;
                for (int k=0; i<m1[0].length; k++) {
                    multiplica[i][j] = m1[i][k]*m2[j][k];
                }
            }
        }
        return multiplica;
    }
    public static void main(String[] args) {
        int[][] matriz = rellenaMatriz(5, 3);
        pintarMatriz(matriz);

        System.out.println();

        int[][] identidad = identidad(3);
        pintarMatriz(identidad);
    }
}
