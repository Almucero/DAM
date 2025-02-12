package EjerciciosClase.Ejercicio7;

import EjerciciosClase.Ejercicio7.Excepciones.*;

public class Main {
    private static GestorCoches gestor = new GestorCoches();

    public static int menu() {
        int opcion = 0;
        System.out.print("""
            \nGestor de Coches
            ======================
            1. Añadir coche
            2. Listar coches
            3. Buscar coche por id
            4. Eliminar coche
            5. Salir
            """);
        while (true) {
            try {
                System.out.print("Eliga una opcion: ");
                opcion = Integer.parseInt(System.console().readLine());
                System.out.println();
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Debe introducir un número\n");
            }
        }
        return opcion;
    }
    public static void añadirCoche() {
        System.out.print("Introduzca la marca del coche: ");
        String marca = System.console().readLine();
        System.out.print("Introduzca el modelo del coche: ");
        String modelo = System.console().readLine();
        int anioFabricacion;
        double precio;
        while (true) {
            try {
                System.out.print("Introduzca el año de fabricación del coche: ");
                anioFabricacion = Integer.parseInt(System.console().readLine());
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Error. El formato no es válido\n");
            }
        }
        while (true) {
            try {
                System.out.print("Introduzca el precio del coche: ");
                precio = Double.parseDouble(System.console().readLine());
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Error. El formato no es válido\n");
            }
        }
        while (true) {
            try {
                gestor.añadirCoche(new Coche(marca, modelo, anioFabricacion, precio));
                break;
            }
            catch (CocheYaExisteException e) {}
        }
    }
    public static void buscar() {
        System.out.print("Introduzca la id del coche a buscar: ");
        String id = System.console().readLine();
        try {
            System.out.println(gestor.devolverCocheEspecifico(id));
        }
        catch (CocheNoExisteException e) {
            System.out.println("El código introducido no corresponde con nigún coche almacenado");
        }
    }
    public static void eliminar() {
        System.out.print("Introduzca la id del coche a eliminar: ");
        String id = System.console().readLine();
        try {
            gestor.eliminarCoche(id);
            System.out.println("El coche con id: "+id+" ha sido eliminado");
        }
        catch (CocheNoExisteException e) {
            System.out.println("El código introducido no corresponde con nigún coche almacenado");
        }
    }
    public static void main(String[] args) {
        ArchivoCohes.leerYCargarCoches(gestor);
        int opcion = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    añadirCoche();
                    ArchivoCohes.guardarCoches(gestor);
                    break;
                case 2:
                    System.out.println(gestor);
                    ArchivoCohes.guardarCoches(gestor);
                    break;
                case 3:
                    buscar();
                    ArchivoCohes.guardarCoches(gestor);
                    break;
                case 4:
                    eliminar();
                    ArchivoCohes.guardarCoches(gestor);
                    break;
                default:
                    if (opcion!=5) {
                        System.out.println("Introduzca una opcion correcta");
                    }
                    System.out.println("Actualmente hay almacenados "+ArchivoCohes.devolverNumeroLineas()/3+" coches en el fichero");
                    break;
            }
        } while (opcion!=5);
    }
}