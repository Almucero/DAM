public class EvaluacionUnidad3 {
    /*
     * Evaluación de la unidad 3
     * 
     * Instrucciones de realización
     * 
     * Hay que aplicar el patrón de testing
     * n 3 pasos: Arrange, Act, Assert.
     * 
     * Haz tantos tests como consideres
     * oportuno (mínimo 2 para cada función)
     * 
     * Si alguna función no supera los test,
     * depura para encontrar errores lógicos y
     * soluciónalos.
     * 
     * Este módulo no es el de programación,
     * aquí lo más importante son los tests y
     * es lo que más puntúa. Si alguna función
     * se te atranca, haz solamente los
     * tests y pasa a la siguiente y deja la
     * corrección del error para el final.
     */
    
    /*
     * Ejercicio 1
     * Estamos desarrollando una aplicación para
     * registrar equipos de volley playa.
     * En los torneos de volley playa, una de las
     * categorías es la de "juveniles".
     * Para participar en la categoría de juveniles,
     * la suma de las edades de los jugadores del
     * equipo debe ser menor o igual a 35 años.

     * Implementa una función que compruebe si dos
     * jugadores cumplen este requisito. La función
     * recibirá 2 números enteros que representan
     * las edades y devolverá un booleano indicando
     * si su suma es menor o igual a 35.
     * 
     * Ejemplo:
     * si recibe: 17, 15
     * debe devolver: true

     * Tareas:

     * Diseña los tests que consideres necesarios.
     * Justifica los valores de prueba elegidos.
     */
    public static boolean sumaEdades(int edad1, int edad2) {
        if ((edad1+edad2)<=35) {
            return true;
        }
        else {
            return false;
        }
    }
    /*
     * Ejercicio 2
     * Necesitamos una función a la reciba 2
     * números enteros y devuelta un String
     * que diga si el primero es mayor que 5, 
     * el segundo es mayor que 5 o ambos son mayores 5.
     * 
     * Ejemplo:
     * si recibe: 6, 8
     * debe devolver: "ambos son mayores que 5"
     */
    public static String sonMayores(int num1, int num2) {
        if (num1>5 && num2<5) {
            return "el primer número es mayor que 5";
        }
        else if (num2>5 && num1<5) {
            return "el segundo número es mayor que 5";
        }
        else if (num1>5 && num2>5) {
            return "ambos son mayores que 5";
        }
        else {
            return "ninguno es mayor que 5";
        }
    }
    /*
     * Ejercicio 3
     * Haz tests para la siguiente función que cuenta
     * cuántas vocales (incluyendo mayúsculas y
     * vocales con tildes: a, e, i, o, u, á, é, í, ó, ú)
     * contiene una frase.
     * 
     * Si encuentras errores, corrige el código hasta
     * que supere todos los tests. No contaremos la "y"
     * como vocal.
     * 
     * Ejemplo: Si recibe la frase "Unió calma y pasión."
     * debe devolver 8.
     */
    public static int cuentaVocales(String frase) {
        int vocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú') {
                vocales++;
            }
        }
        return vocales;
    }
}