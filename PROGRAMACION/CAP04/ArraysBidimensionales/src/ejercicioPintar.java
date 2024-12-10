public class ejercicioPintar {
    private static int[][] rotarMatriz(int[][] matriz) {
        int[][] rotada = new int[matriz[0].length][matriz.length];
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[0].length; j++) {
                rotada[j][matriz.length-1-i] = matriz[i][j];
            }
        }
        return rotada;
    }
    private static void pintarDibujo(int[][] matriz, int contador) {
        String color = (contador%4==0)?RED:(contador%4==1)?GREEN:(contador%4==0)?YELLOW:PURPLE;
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[0].length; j++) {
                switch (matriz[i][j]) {
                    case 1-> System.out.printf("%s  %s", color, RESET);
                    case 0-> System.out.printf(BLUE+"  "+RESET);
                }
            }
            System.out.println();
        }
    }
    private static void interludio(int espera) {
        try {
            Thread.sleep(espera);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[41m";
    public static final String GREEN = "\033[42m";
    public static final String BLUE = "\033[44m";
    public static final String PURPLE = "\033[45m";
    public static final String YELLOW = "\033[43m";
    public static void main(String[] args) {
        int[][] matriz = {
            {0, 0, 0, 1, 1, 1, 1, 1},
            {0, 0, 1, 0, 0, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 0, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 1, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 0, 0}
        };
        int contador=0;
        while (true) {
            matriz = rotarMatriz(matriz);
            pintarDibujo(matriz, contador);
            interludio(1000);
            contador++;
        }
    }
}