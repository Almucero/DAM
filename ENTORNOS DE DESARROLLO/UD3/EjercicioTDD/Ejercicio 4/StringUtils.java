public class StringUtils {

    public static boolean esSoloMayusculas(String palabra) {
        for (int i = 0; i < palabra.length(); i++) {
            if (!Character.isUpperCase(palabra.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}