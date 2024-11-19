package Ejercicio25;

public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
    }
}
/**
 * private static int longitud(in valor) {
 * int contador0;
 * while(valor!=0) {
 * valor/=10;
 * contador++;
 * }
 * return contador;
 * }
 * 
 * 
 * private static String imprimeDigitosDesdeHasta(int valor, int desde, int hasta) {
 * String resultado="";
 * int _longitud = longitud(valor);
 * for (int i=_longitud-1; i>=0; i--) {
 * if (_longitud-i >= desde && _longitud-i <= hasta) {
 * resultado+=""+(int)(valor/Math.pow(10, i));
 * valor = valor%(int)Math.pow(10, i);
 * }
 * }
 * 
 * return resultado;
 * }
 * 
 * 
 * 
 * int original=485783;
 * int _longitud=longitud(original);
 * System.out.println(imprimeDigitosDesdeHasta(volteado, 7, 9));
 * int valor=original*10+1;
 * int volteado=0;
 * while(valor!=0) {
 * volteado=volteado*10+(valor%10)
 * valor/=10;
 * }
 * System.out.printf("original: %d volteado: %d", original, volteado);
 */