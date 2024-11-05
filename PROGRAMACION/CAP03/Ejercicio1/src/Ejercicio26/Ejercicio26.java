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
        int buscar = Integer.parseInt(System.console().readLine());
        if (longitud(buscar)>1) {
            System.out.println("Por favor, introduzca un solo digito");
            System.out.println();
        }
        int _longitud = longitud(num);        
        System.out.printf("""
            Contando de izquierda a derecha, el %d aparece dentro de %d
            en las siguientes posiciones: 
            """, buscar, num);
        for (int i=longitud(num)-1; i>=0; i--) {
            int digito = num/(int)Math.pow(10, i);
            num = num%(int)Math.pow(10, i);
            if (digito==buscar) {
                System.out.printf("%d ", _longitud-i);
            }
        }
    }
}