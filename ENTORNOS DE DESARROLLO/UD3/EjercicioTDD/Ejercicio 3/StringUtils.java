public class StringUtils {

    public static int contarConsonantes(String palabra) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (Character.isLetter(letra) && !vocales.contains(String.valueOf(letra))) {
                contador++;
            }
        }
        return contador;
    }
}