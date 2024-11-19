package Ejercicio11;

public class Ejercicio11 {
    private static int calcularDigitos(int numero) {
        int digitos = 0;
        while (numero != 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;
    }
    private static String generarEspacios(int cantidad) {
        String espacios = "";
        for (int i = 0; i < cantidad; i++) {
            espacios += " ";
        }
        return espacios;
    }
    private static String generarGuiones(int cantidad) {
        String guiones = "";
        for (int i = 0; i < cantidad; i++) {
            guiones += "-";
        }
        return guiones;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int num1 = Integer.parseInt(System.console().readLine());
        int num2 = num1 + 1;
        int num3 = num1 + 2;
        int num4 = num1 + 3;
        int num5 = num1 + 4;

        int digitos1 = calcularDigitos(num5);
        int digitos2 = calcularDigitos(num5*num5);
        int digitos3 = calcularDigitos(num5*num5*num5);

        System.out.printf("n%s | n2%s | n3%s%n", generarEspacios(digitos1-1), generarEspacios(digitos2-2), generarEspacios(digitos3-2));
        System.out.println(generarGuiones(digitos1)+generarGuiones(digitos2)+generarGuiones(digitos3)+generarGuiones(6));
        System.out.printf("%d | %d | %d %n", num1, num1*num1, num1*num1*num1);
        System.out.printf("%d | %d | %d %n", num2, num2*num2, num2*num2*num2);
        System.out.printf("%d | %d | %d %n", num3, num3*num3, num3*num3*num3);
        System.out.printf("%d | %d | %d %n", num4, num4*num4, num4*num4*num4);
        System.out.printf("%d | %d | %d %n", num5, num5*num5, num5*num5*num5);
    }
}