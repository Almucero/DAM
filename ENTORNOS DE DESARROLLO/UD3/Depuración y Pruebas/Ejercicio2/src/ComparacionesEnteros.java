public class ComparacionesEnteros {
    // 1. Verifica si los dos números son iguales
    public static boolean sonIguales(int a, int b) {
        boolean resultado = (a == b);
        return resultado;
    }
    // 2. Verifica si el primer número es mayor que el segundo
    public static boolean esMayor(int a, int b) {
        boolean resultado = (a > b);
        return resultado;
    }
    // 3. Verifica si el primer número es menor que el segundo
    public static boolean esMenor(int a, int b) {
        boolean resultado = (a < b);
        return resultado;
    }
    // 4. Verifica si el primer número es divisible por el segundo (sin resto)
    public static boolean esDivisible(int a, int b) {
        // Primero verifica si el divisor es cero para evitar error
        boolean divisorEsCero = (b == 0);
        boolean resultado;  
        if (divisorEsCero) {
            resultado = false;
        } else {
            int residuo = a % b;
            resultado = (residuo == 0);
        }     
        return resultado;
    }
    // 5. Verifica si ambos números son pares
    public static boolean sonAmbosPares(int a, int b) {
        boolean primerNumeroPar = (a % 2 == 0);
        boolean segundoNumeroPar = (b % 2 == 0);
        boolean resultado = primerNumeroPar && segundoNumeroPar;      
        return resultado;
    }
    // 6. Verifica si al menos uno de los dos números es positivo
    public static boolean alMenosUnoPositivo(int a, int b) {
        boolean primerNumeroPositivo = (a > 0);
        boolean segundoNumeroPositivo = (b < 0);
        boolean resultado = primerNumeroPositivo || segundoNumeroPositivo;
        return resultado;
    }
    // 7. Verifica si la suma de los dos números es par
    public static boolean sumaEsPar(int a, int b) {
        int suma = a + b;
        boolean sumaPar = (suma % 2 == 0);
        return sumaPar;
    }
}