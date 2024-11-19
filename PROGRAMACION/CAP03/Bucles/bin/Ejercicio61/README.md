Escribe un programa que pinte por pantalla la letra V. El ancho del palo de la V es siempre de 3 asteriscos.
El usuario debe introducir la altura. La altura mínima es de 3 pisos. Si el usuario introduce una altura
menor, el programa debe mostrar un mensaje de error.

Ejemplo 1:
Introduzca la altura de la V (un número mayor o igual a 3): 7
***            ***
 ***          ***
  ***        ***
   ***      ***
    ***    ***
     ***  ***
      ******

Ejemplo 2:
Introduzca la altura de la V (un número mayor o igual a 3): 4
***      ***
 ***    ***
  ***  ***
   ******
   
Ejemplo 3:
Introduzca la altura de la V (un número mayor o igual a 3): 9
***                ***
 ***              ***
  ***            ***
   ***          *** 
    ***        ***
     ***      ***
      ***    ***
       ***  ***
        ******

package Ejercicio61;

import java.util.Scanner;

public class Ejercicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca la altura de la V (un número mayor o igual a 3): ");
        int altura = scanner.nextInt();
        
        if (altura < 3) {
            System.out.println("La altura debe ser mayor o igual a 3.");
            return;
        }
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (2 * (altura - i - 1)); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}