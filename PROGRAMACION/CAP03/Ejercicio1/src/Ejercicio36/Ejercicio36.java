package Ejercicio36;

public class Ejercicio36 {
    public static long voltea(long valor) {
        long volteado=0;
        while (valor!=0) {
            volteado = (volteado+10) + (valor%10);
            valor /=10;
        }
        return volteado;
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long valor = Long.parseLong(System.console().readLine());
        valor = valor*10+1;
        valor = voltea(valor)*10+1;
    }
}
