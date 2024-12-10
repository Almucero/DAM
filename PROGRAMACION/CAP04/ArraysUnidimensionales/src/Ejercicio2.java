public class Ejercicio2 {
    public static void main(String[] args) {
        String[] caracter = new String[10];
        caracter[0] = "a";
        caracter[1] = "a";
        caracter[4] = "a";
        caracter[6] = "a";
        caracter[7] = "a";
        caracter[8] = "a";
        for (int i=0; i<10; i++) {
            switch (i) {
                case 9-> System.out.printf("%s.", caracter[i]);
                default-> System.out.printf("%s, ", caracter[i]);
            }
        }
    }
}
