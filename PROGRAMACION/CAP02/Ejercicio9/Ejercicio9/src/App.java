import java.util.Scanner;
import Comparacion.Comparacion;


public class App {

public static Scanner scanner = new Scanner(System.in);

public static int leerNumero(String mensaje) {
    System.out.print(mensaje);
    return Integer.parseInt(scanner.nextLine());
}

public static void main(String [] args) throws Exception {
    try {
        int a = leerNumero("Introduzca el primer número: ");
        int b = leerNumero("Introduzca el segundo número: ");
        int c = leerNumero("Introduzca el tercer número: ");
        System.out.println("El número más grande de entre los 3 es: "+ Comparacion.maxDeTresValores(a,b,c));
    } catch (Exception e){
        System.out.println("Ocurrió un error al realizar la comparación, debe introducir solo números");
    }
}
}