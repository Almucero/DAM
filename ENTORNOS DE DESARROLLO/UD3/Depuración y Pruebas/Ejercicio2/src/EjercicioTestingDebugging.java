public class EjercicioTestingDebugging {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        // Ejecución de las funciones de la clase ComparacionesEnteros
        System.out.println("Son iguales: " + ComparacionesEnteros.sonIguales(num1, num2));
        System.out.println("Es mayor: " + ComparacionesEnteros.esMayor(num1, num2));
        System.out.println("Es menor: " + ComparacionesEnteros.esMenor(num1, num2));
        System.out.println("Es divisible: " + ComparacionesEnteros.esDivisible(num1, num2));
        System.out.println("Son ambos pares: " + ComparacionesEnteros.sonAmbosPares(num1, num2));
        System.out.println("Al menos uno positivo: " + ComparacionesEnteros.alMenosUnoPositivo(num1, num2));
        System.out.println("Suma es par: " + ComparacionesEnteros.sumaEsPar(num1, num2));
        // Ejecución de las funciones de la clase OperacionesMixtas
        System.out.println(OperacionesMixtas.concatenarNumeroTexto(5, "manzanas"));
        System.out.println(OperacionesMixtas.booleanComoTexto(true));
        System.out.println(OperacionesMixtas.concatenarTextos("Hola", "Mundo"));
        System.out.println(OperacionesMixtas.descripcionNumero(-10));
        System.out.println(OperacionesMixtas.cambiarTextoAMayusculas("Java", true));
        System.out.println(OperacionesMixtas.descripcionConFloat(3.14f, 2.71f));
        System.out.println(OperacionesMixtas.formatearNumero(123.456f, 2));
    }
}
