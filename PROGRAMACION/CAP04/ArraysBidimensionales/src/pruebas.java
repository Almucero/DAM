public class pruebas {
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
    pri
    public static void main(String[] args) {
        int[][] m1 = rellenaMatriz(3, 3);
        pintarMatriz(m1);
    }
}
