public class StringUtils {
    //crear la firma
    public static String reverseWord(String palabra) {
        String reverseString="";
        for (int i=palabra.length()-1; i>=0; i--) {
            reverseString = reverseString+palabra.charAt(i);
        }
        return reverseString;
    }
    
}