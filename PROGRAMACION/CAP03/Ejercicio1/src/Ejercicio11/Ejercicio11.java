package Ejercicio11;

public class Ejercicio11 {
    // Método para calcular el número de dígitos de un número
    private static int calcularDigitos(int numero) {
        int digitos = 0;
        while (numero != 0) {
            numero /= 10;
            digitos++;
        }
        return digitos;
    }
    // Método para generar una cadena de espacios según el número dado (digitos)
    private static String generarEspacios(int cantidad) {
        String espacios = "";
        for (int i = 0; i < cantidad; i++) {
            espacios += " ";
        }
        return espacios;
    }
    // Método para generar una cadena de espacios según el número dado (digitos)
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

        // Longitud máxima de los números base
        int long1 = num5;
        int digitos1 = calcularDigitos(long1);
        // Longitud máxima de los números al cuadrado
        int long2 = num5 * num5;
        int digitos2 = calcularDigitos(long2);
        // Longitud máxima de los números al cubo
        int long3 = num5 * num5 * num5;
        int digitos3 = calcularDigitos(long3);

        System.out.printf("n%s | n2%s | n3%s%n", generarEspacios(digitos1-1), generarEspacios(digitos2-2), generarEspacios(digitos3-2));
        System.out.println(generarGuiones(digitos1)+generarGuiones(digitos2)+generarGuiones(digitos3)+generarGuiones(11));
        System.out.printf("%d%s | %d%s | %d%s%n", num1, generarEspacios(digitos1-1), num1*num1, generarEspacios(digitos2-2), num1*num1*num1, generarEspacios(digitos3-2));
    }
}
//(n + 5 - 1)^2
//(n + 5 - 1)^3
//|_%3d_|_%5d_|_%8d_|