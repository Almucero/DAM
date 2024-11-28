public class StringUtils {
    public static boolean palindromo(String palabra) {
        String palindromo="";
        for (int i=palabra.length()-1; i>=0; i--) {
            palindromo = palindromo+palabra.charAt(i);
        }
        if (palabra.equalsIgnoreCase(palindromo)) {
            return true;
        }
        else {
            return false;
        }
    }
}