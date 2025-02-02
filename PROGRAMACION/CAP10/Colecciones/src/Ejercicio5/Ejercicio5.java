package Ejercicio5;

import Ejercicio5.Excepciones.DiscoNoExisteException;
import Ejercicio5.Excepciones.DiscoYaExisteException;

public class Ejercicio5 {
    private static AlmacenDiscos almacenDiscos = new AlmacenDiscos();

    public static int menu() {
        System.out.print("""
            COLECCIÓN DE DISCOS
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
    public static void nuevoDisco() {
        System.out.println("""
            NUEVO DISCO
            ===========
            Por favor, introduzca los datos del disco.
            """);
        System.out.print("Autor: ");
        String autor = System.console().readLine();
        System.out.print("Titulo: ");
        String titulo = System.console().readLine();
        System.out.print("Género: ");
        String genero = System.console().readLine();
        System.out.print("Duración: ");
        int duracion = Integer.parseInt(System.console().readLine());
        do {
            Disco nuevoDisco = new Disco(autor, titulo, genero, duracion);
            try {
                almacenDiscos.crearDisco(nuevoDisco);
                break;
            }
            catch (DiscoYaExisteException e) {
                System.out.println("El valor asignado al código del artículo ya existía, se generará uno nuevo");
            }
        } while (true);
    }
    public static void modificar() {
        Disco discoAntiguo;
        do {
            System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
            String codigo = System.console().readLine();
            try {
                almacenDiscos.comprobarExistenciaDisco(codigo);
                discoAntiguo = almacenDiscos.devolverDiscoPorCodigo(codigo);
                break;
            } catch (DiscoNoExisteException e) {
                System.out.println("Ese código no está asignado a ningún disco");
            }
        } while (true);
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual");
        System.out.print("Autor: "+discoAntiguo.getAutor()+"\n");
        System.out.print("Nuevo autor: ");
        String nuevoAutor = System.console().readLine();
        nuevoAutor = nuevoAutor.isEmpty() ? discoAntiguo.getAutor() : nuevoAutor;
        System.out.print("Título: "+discoAntiguo.getTitulo()+"\n");
        System.out.print("Nuevo título: ");
        String nuevoTitulo = System.console().readLine();
        nuevoTitulo = nuevoTitulo.isEmpty() ? discoAntiguo.getTitulo() : nuevoTitulo;
        System.out.print("Género: "+discoAntiguo.getGenero()+"\n");
        System.out.print("Nuevo género: ");
        String nuevoGenero = System.console().readLine();
        nuevoGenero = nuevoGenero.isEmpty() ? discoAntiguo.getGenero() : nuevoGenero;
        System.out.print("Duración: "+discoAntiguo.getDuracion()+"\n");
        System.out.print("Nueva duración: ");
        String nuevaDuracionString = System.console().readLine();
        int nuevaDuracion = nuevaDuracionString.isEmpty() ? discoAntiguo.getDuracion() : Integer.parseInt(nuevaDuracionString);
        try {
            almacenDiscos.modificarDisco(discoAntiguo.getCodigo(), new Disco(nuevoAutor, nuevoTitulo, nuevoGenero, nuevaDuracion));
        } catch (DiscoNoExisteException e) {}
    }
    public static void borrar() {
        do {
            System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
            String codigo = System.console().readLine();
            try {
                almacenDiscos.borrarDisco(codigo);
            }
            catch (DiscoNoExisteException e) {
                System.out.println("Ese código no está asignado a ningún disco");
            }
        } while (true);
    }
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println(almacenDiscos);
                    break;
                case 2:
                    nuevoDisco();
                    break;
                case 3:
                    modificar();
                    break;
                case 4:
                    borrar();
                    break;
                case 5:
                    break;
            }
        } while (opcion!=5);
    }
}