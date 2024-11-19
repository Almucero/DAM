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
    public static void main(String[] args) throws Exception {
        boolean numAceptado=false;
        boolean digitoAceptado=false;
        boolean cerrar=false;
        int num=0;
        int buscar=0;
        while (cerrar!=true) {
            try {
                while (numAceptado!=true) {
                    try {
                        System.out.print("Introduzca un número entero: ");
                        num = Integer.parseInt(System.console().readLine());
                        numAceptado=true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un número entero");
                        System.out.println();
                    }
                }
                while (digitoAceptado!=true) {
                    try {
                        System.out.print("Introduce un dígito: ");
                        buscar = Integer.parseInt(System.console().readLine());
                        digitoAceptado=true;
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Error. Debe introducir un dígito aceptado");
                        System.out.println();
                    }
                }
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
                cerrar=true;
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado");
                cerrar=true;
            }
        }
    }
}