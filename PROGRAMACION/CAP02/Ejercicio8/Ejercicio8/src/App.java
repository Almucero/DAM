import java.util.Scanner;

public class App {
public static Scanner scanner = new Scanner(System.in);
public static void menu(){
    System.out.println("****SELECCIONA LA OPERACIÓN****");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");
    System.out.println("4. División");
    System.out.println("5. Resto entre a y b");
    System.out.println("6. Potencia");
    System.out.println("7. Salir");
    System.out.print("Introduzca una opción");
}
public static int leerOpcion(int ret) {
    ret = Integer.parseInt(scanner.nextLine());
    return ret;
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
            case 1:
                try {
                    operaciones = sumar();
                } catch (Exception e){
                    System.out.println("Ocurrió un error al realizar la suma");
                }
                break;
            case 2:
                
            case 3:

            case 4:

            case 5:

            case 6:

            case 7:
            default:
        }
    }
}
}
