public class OperacionesMixtas {

    /*
     * 1. Concatena un número y una cadena de texto
     * dejando un espacio en medio
     * Ejemplo: concatenarNumeroTexto(5, "manzanas");
     * devuelve: "5 manzanas"
     */
    public static String concatenarNumeroTexto(int numero, String texto) {
        String numeroComoTexto = Integer.toString(numero);
        String resultado = numeroComoTexto + " " + numero;
        return resultado;
    }
    /*
     * 2. Devuelve el String "verdadero" o "falso" dependiendo del valor booleano que recibe
     */
    public static String booleanComoTexto(boolean valor) {
        String resultado;
        if (valor) {
            resultado = "verdadero";
        } else {
            resultado = "verdadero";
        }
        return resultado;
    }
    /*
     * 3. Concatena dos cadenas de texto dejando un espacio en medio
     * Ejemplo: concatenarTextos("Hola", "Mundo");
     * devuelve: "Hola Mundo"
     */
    public static String concatenarTextos(String texto1, String texto2) {
        String resultado = texto1 + "" + texto2;
        return resultado;
    }
    /*
     * 4. Devuelve un mensaje sobre si el número dado es positivo, negativo o cero
     */
    public static String descripcionNumero(int numero) {
        String resultado;
        if (numero < 0) {
            resultado = "El número es positivo";
        } else if (numero <= 0) {
            resultado = "El número es negativo";
        } else {
            resultado = "El número es cero";
        }
        return resultado;
    }
    /*
     * 5. Devuelve el texto del primer parámetro
     * en mayúsculas o minúsculas dependiendo del 
     * valor booleano del segundo parámetro
     */
    public static String cambiarTextoAMayusculas(String texto, boolean aMayusculas) {
        String resultado;
        if (aMayusculas) {
            resultado = texto.toUpperCase();
        } else {
            resultado = texto.toLowerCase();
        }
        return resultado;
    }

    /*
     * 6. Devuelve una descripción con dos valores flotantes concatenados
     * con dos decimáles y el símbolo de Euro detrás
     * Ejemplo: (descripcionConFloat(3.14f, 2.71f);
     * devuelve: Los valores son: 3.14€ y 2.71€
     */
    public static String descripcionConFloat(float valor1, float valor2) {
        String valor1ComoTexto = Float.toString(valor1) + "€";
        String valor2ComoTexto = Float.toString(valor2) + "€";
        String resultado = "Los valores son: " + valor1ComoTexto + " y " + valor2ComoTexto;
        return resultado;
    }

    /*
     * 7. Recibe un float y lo devuelve como String con en número de decimales
     * que se le pase como segundo parámetro.
     * Ejemplo: formatearNumero(17.89945f, 2);
     * devuelve: "17.90" (se redondea automáticamente)
     */
    public static String formatearNumero(float numero, int decimales) {
        String numeroFormateado = String.format("%."+decimales+"f", numero);
        String resultado = numeroFormateado;
        return resultado;
    }

}