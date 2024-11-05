package Ejercicio26;

public class Ejercicio26 {
    private static int longitud(int valor) {
        int contador=0;
        while(valor!=0) {
            valor/=10;
            contador++;
        }
        return contador;
    }
    public static void main(String[] args) {
        System.out.println("Introduzca un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println("Introduce un dígito: ");
        int digito = Integer.parseInt(System.console().readLine());
        if (longitud(digito)>1) {
            System.out.println("Por favor, introduzca un solo digito");
            System.out.println();
        }

        int _longitud = longitud(num);        
        System.out.println(num / (int)Math.pow(10, _longitud-1));
        num = num %(int)Math.pow(10, _longitud-1);

        System.out.println(num / (int) Math.pow(10, _longitud - 2));
        num = num %(int)Math.pow(10,  _longitud-2);

        System.out.println(num / (int) Math.pow(10, _longitud-3));
        num = num %(int)Math.pow(10,  _longitud-3);
        
        for (int i=longitud(num))
      
    }
}
/**
 * for (int i=longitud(valor)-1; i>=0; i--){
 *  digito=valor/(int)Math.pow(10,i);
 *  valor=valor%(int)Math.pow(10,i);
 *  if (digito==buscar) {
 *      System.out.printf("%d,", longitud-i);
 *  }
 * }
 * 
 * valor=num
 * 
 */