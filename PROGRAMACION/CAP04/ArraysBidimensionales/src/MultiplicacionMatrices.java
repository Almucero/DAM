public class MultiplicacionMatrices {
    private static void pintarMatriz(int[][] matriz){
        if (matriz!=null){
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[i].length; j++){
                    System.out.printf("%3d ",matriz[i][j]);
                }
                System.out.println();
            }
        }
    }
    private static int[][] rellenaMatriz(int filas, int columnas){
        if(filas< 1 || columnas < 1)
            return null;
        int[][] matriz = new int[filas][columnas];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j]=(int)(Math.random()*10);
            }
        }
        return matriz;
    }
    private static int[][] multiplica(int[][] m1, int[][] m2){
        if(m1==null || m2==null || m1[0].length != m2.length)
            return null;
        int[][] resultado = new int[m1.length][m2[0].length];
        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m2[0].length; j++){
                resultado[i][j] = 0;
                for(int k = 0; k < m1[0].length; k++){
                    resultado[i][j] += m1[i][k]*m2[k][j];
                }
            }
        }
        return resultado;
    }
    private static int[][] sumar(int[][] m1, int[][] m2){
        if(m1==null || m2==null || m1.length!=m2.length || m1[0].length != m2[0].length)
            return null;
        int[][] res = new int[m1.length][m1[0].length];
        for(int i=0; i < m1.length; i++){
            for(int j=0; j < m1[i].length; j++){
                res[i][j] = m1[i][j]+m2[i][j];
            }
        }
        return res;
    }
    private static boolean iguales(int[][] m1, int[][] m2){
        if(m1 == null && m2 == null)
            return true;
        if(m1== null || m2 == null || m1.length!=m2.length || m1[0].length != m2[0].length)
            return false;
        for(int i=0; i < m1.length; i++){
            for(int j=0; j < m1[i].length; j++){
                if(m1[i][j]!=m2[i][j])
                    return false;
            }
        }
        return true;
    }
    private static int[][] identidad(int tamanio){
        if(tamanio<1)
            return null;
        int[][] res = new int[tamanio][tamanio];
        for(int i = 0; i < tamanio; i++)
            res[i][i]=1;
        return res;
    }
    private static int[][] trasponerMatriz(int[][] matriz) {
        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[0].length; j++) {
                traspuesta[j][i]=matriz[i][j];
            }
        }
        return traspuesta;
    }
    public static void main(String[] args) {
        int[][] m1 = null;
        int[][] m2 = null;
        int[][] m3 = null;
        
        System.out.println("A·I = A");
        m1 = rellenaMatriz(3, 3);
        m2 = identidad(3);
        m3 = multiplica(m1, m2);
        System.out.println("\nMatriz A\n*********");
        pintarMatriz(m1);
        System.out.println("\nMatriz I\n*********");
        pintarMatriz(m2);
        System.out.println("\nResultado\n*********");
        pintarMatriz(m3);
        if(iguales(m1, m3)) {
            System.out.print("\nA·I = A ");
        }
        else {
            System.out.print("\nA·I =/ A ");
        }

        System.out.println("\n\nA·B <> B·A");
        m1 = rellenaMatriz(3, 3);
        m2 = rellenaMatriz(3, 3);
        m3 = multiplica(m1, m2);
        int[][] m4 = multiplica(m2, m1);
        System.out.println("\nMatriz A\n*********");
        pintarMatriz(m1);
        System.out.println("\nMatriz B\n*********");
        pintarMatriz(m2);
        System.out.println("\nResultado A·B\n*********");
        pintarMatriz(m3);
        System.out.println("\nResultado B·A\n*********");
        pintarMatriz(m4);
        if(iguales(m3, m4)) {
            System.out.println("\nA·B = B·A");
        }
        else {
            System.out.println("\nA·B =/ B·A");  
        }

        System.out.println("\nTraspuesta de A: ");
        int[][] traspuesta = trasponerMatriz(m1);
        pintarMatriz(traspuesta);
    }
}