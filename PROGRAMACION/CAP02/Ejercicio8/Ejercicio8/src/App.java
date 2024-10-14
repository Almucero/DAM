import java.util.Scanner;
import operaciones.operaciones;

public class App {
public static Scanner scanner = new Scanner(System.in);
public static void menu(){
    System.out.println("****SELECCIONA LA OPERACIÓN****");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");
    System.out.println("5. Resto entre a y b");
    System.out.println("6. Potencia");
    System.out.println("7. Salir");
    System.out.print("Introduzca una opción:");
}
public static int leerOpcion(int ret) {
    ret = Integer.parseInt(scanner.nextLine());
    return ret;
}
public static int leerNumero(String mensaje) {
    System.out.print(mensaje);
    return Integer.parseInt(scanner.nextLine());
}
public static void main(String[] args) throws Exception {
    int opcion = 0;
    while (opcion != 7) {
        opcion = 0;
        menu();
        try {
           opcion = leerOpcion(0);
        } catch (NumberFormatException e) {
            System.out.println("Introduzca un opción correcta");
        } catch (Exception e) {
            System.out.println("Ocuriió un error inesperado");
        }        
        switch(opcion) {
            case 1: //suma
                try {
                    int a = leerNumero("Introduzca el primer número: ");
                    int b = leerNumero("Introduzca el segundo número: ");
                    System.out.println("Resultado: "+ operaciones.sumar(a,b));
                } catch (Exception e){
                    System.out.println("Ocurrió un error al realizar la suma");
                }
                break;
            case 2: //resta
                try {
                    int a = leerNumero("Introduzca el primer número: ");
                    int b = leerNumero("Introduzca el segundo número: ");
                    System.out.println("Resultado: "+ operaciones.restar(a,b));
                } catch (Exception e){
                    System.out.println("Ocurrió un error al realizar la resta");
                }
                break;   
            case 3: //multiplicación
                try {
                    int a = leerNumero("Introduzca el primer número: ");
                    int b = leerNumero("Introduzca el segundo número: ");
                    System.out.println("Resultado: "+ operaciones.multiplicar(a,b));
                } catch (Exception e){
                    System.out.println("Ocurrió un error al realizar la multiplicación");
                }
                break;  
            case 4: //división
                try {
                    int a = leerNumero("Introduzca el primer número: ");
                    int b = leerNumero("Introduzca el segundo número: ");
                    System.out.println("Resultado: "+ operaciones.dividir(a,b));
                } catch (Exception e){
                    System.out.println("Ocurrió un error al realizar la división");
                }
                break;  
            case 5: //resto
                try {
                    int a = leerNumero("Introduzca el primer número: ");
                    int b = leerNumero("Introduzca el segundo número: ");
                    System.out.println("Resultado: "+ operaciones.resto(a,b));
                } catch (Exception e){
                    System.out.println("Ocurrió un error al realizar el resto");
                }
                break;  
            case 6: //potencia
                try {
                    int a = leerNumero("Introduzca el primer número: ");
                    int b = leerNumero("Introduzca el exponente: ");
                    System.out.println("Resultado: "+ operaciones.potencia(a,b));
                } catch (Exception e){
                    System.out.println("Ocurrió un error al realizar la potencia");
                }
                break;  
            case 7:
            default:
        }
    }
    System.out.println("Hasta la vista");
    scanner.close();
}
}
