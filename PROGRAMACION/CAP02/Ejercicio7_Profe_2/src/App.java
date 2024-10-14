import java.util.Date;
import java.util.InputMismatchException;

import animales.Perro;
import personas.Persona;
import java.util.Scanner;


public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void menu(){
        System.out.println("***********************");
        System.out.println("1. Añadir persona");
        System.out.println("2. Añadir perro");
        System.out.println("3. Leer chip");
        System.out.println("4. Hacer ladrar al perro");
        System.out.println("5. Hacer caminar al perro");
        System.out.println("6. Salir");
        System.out.print("Introduzca una opción: ");
    }
    public static int leerOpcion(int ret){
        ret = Integer.parseInt(scanner.nextLine());
        return ret;
    }

    public static Persona obtenerDatosPersona(){
        System.out.print("Introduzca el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduzca los apellidos: ");
        String apellidos = scanner.nextLine();

        int anio = pedirValorEntero("Introduzca su año de nacimiento: ");
        int mes = pedirValorEntero("Introduzca su mes de nacimiento: ");
        int dia = pedirValorEntero("Introduzca su día de nacimiento: ");
        Date fecha = new Date(anio-1900, mes-1, dia);
        System.out.print("Introduzca el dni: ");
        String dni = scanner.nextLine();
        return new Persona(nombre, apellidos, fecha, dni);
    }

    public static int pedirValorEntero(String texto){
        int ret = 0;
        boolean correcto = false;
        while(!correcto){
            System.out.print(texto);
            try {
                ret = Integer.parseInt(scanner.nextLine());    
                correcto = true;
            } catch (Exception e) {
            }
        }
        return ret;
    }
    public static Perro obtenerDatosPerro(){
        System.out.print("Introduzca el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduzca la raza: ");
        String raza = scanner.nextLine();
        int anio = pedirValorEntero("Introduzca su año de nacimiento: ");
        int mes = pedirValorEntero("Introduzca su mes de nacimiento: ");
        int dia = pedirValorEntero("Introduzca su día de nacimiento: ");
        Date fecha = new Date(anio-1900, mes-1, dia);
        return new Perro(nombre, raza, fecha);
    }
    public static void hacerladrar(Perro perro) {
        int cantidad = pedirValorEntero("Introduzca cunatas veces quieres que ladre el perro: ");
        System.out.println(perro.ladrar(cantidad));
    }
    public static void hacercaminar(Perro perro) {
        int distancia = pedirValorEntero("Introduzca la distancia que quieres que camine el perro: ");
        System.out.println(perro.caminar(distancia));
    }
    public static void main(String[] args) throws Exception {
        Persona persona = null;
        Perro perro = null;
        int opcion = 0;
        while(opcion != 6){
            opcion = 0;
            menu();
            try {
                opcion = leerOpcion(0);
            } catch (NumberFormatException e) {
                System.out.println("Introduzca una opción correcta");
            } catch (Exception e){
                System.out.println("Ocurrió un error inesperado");
            }
            switch(opcion){
                case 1:
                    try {
                        persona = obtenerDatosPersona();    
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al dar de alta a la persona");
                    }
                    break;

                case 2:
                    if(persona != null){
                        try {
                            perro = obtenerDatosPerro();
                            perro.setAmo(persona);
                        } catch (Exception e) {
                            System.out.println("Ocurrió un error al dar de alta al perro");
                        }
                    }
                    else{
                        System.out.println("Debe añadir antes a una persona");
                    }
                    break;

                case 3:
                    if(perro!=null){
                        try {
                            System.out.println(perro.leerChip());    
                        } catch (Exception e) {
                            System.out.println("Ocurrió un error inesperado");
                        }
                    }
                    else{
                        System.out.println("Por favor, tiene que registrar al perro");
                    }
                    break;

                case 4:
                    if(perro!=null){
                        try {
                            hacerladrar(perro);
                        } catch (Exception e) {
                            System.out.println("Ocurrió un error inesperado");
                        }
                    }
                    else{
                        System.out.println("Por favor, primero debe registrar un perro");
                    }
                    break;

                case 5:
                    if(perro!=null){
                        try {
                            hacercaminar(perro);
                        } catch (Exception e) {
                            System.out.println("Ocurrió un error inesperado");
                        }
                    }
                    else {
                        System.out.println("Por favor, primero debe registrar un perro");
                    }
                    break;
                    
                case 6:

                default:
            }
            
        }
        System.out.println("Hasta luego!!!");
        scanner.close();
    }
}
/*hacer que el perro ladre y camine en el menu, con menus independientes para persona y perro */