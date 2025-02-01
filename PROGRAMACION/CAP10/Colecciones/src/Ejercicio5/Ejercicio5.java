package Ejercicio5;

public class Ejercicio5 {
    public static int menu() {
        System.out.print("""
            \nCOLECCIÓN DE DISCOS
            ===================
            1. Listado
            2. Nuevo disco
            3. Modificar
            4. Borrar
            5. Salir
            """);
        System.out.print("Introduzca una opción: ");
        return (Integer.parseInt(System.console().readLine()));
    }
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opcion!=5);
    }
}
