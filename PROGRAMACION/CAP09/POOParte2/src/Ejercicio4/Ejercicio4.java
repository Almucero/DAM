package Ejercicio4;

import Ejercicio3.Disco;

public class Ejercicio4 {

    private static ColeccionDiscosConFiltro coleccion = new ColeccionDiscosConFiltro(10);
    private static void menu(){
        System.out.println(
            """
            COLECCIÓN DE DISCOS
            ===================
            """);
        System.out.println(
            """
                1. Listado
                2. Nuevo disco
                3. Modificar
                4. Borrar
                5. Salir
            """);
        System.out.print("Introduzca una opción: ");
    }
    private static void submenu() {
        System.out.println(
            """
            LISTADO
            ===================
            """);
        System.out.println(
            """
                1. Completo
                2. Por autor
                3. Por género
                4. En un rango de duración
                5. Menu principal
            """);
        System.out.print("Introduzca una opción: ");
    }

    private static void listarCompleto(){
        Disco[] discos = coleccion.consultar();
        for(int i=0; i < discos.length; i++)
            if(discos[i]!=null)
                System.out.println(discos[i]);
    }
    private static void listarPorAutor(){
        System.out.print("Introduzca el nombre del autor: ");
        String autor=System.console().readLine();
        Disco[] discos = coleccion.consultarPorAutor(autor);
        for(int i=0; i < discos.length; i++)
            if(discos[i]!=null)
                System.out.println(discos[i]);
    }
    private static void listarPorGenero(){
        System.out.print("Introduzca el nombre del género: ");
        String genero=System.console().readLine();
        Disco[] discos = coleccion.consultarPorGenero(genero);
        for(int i=0; i < discos.length; i++)
            if(discos[i]!=null)
                System.out.println(discos[i]);
    }
    private static void listarPorRandoDuracion(){
        System.out.println("Establezca el intervalo para la duración");
        System.out.print("Límite inferior de duración en minutos: ");
        int minDuracion=Integer.parseInt(System.console().readLine());
        System.out.print("Límite superior de duración en minutos: ");
        int maxDuracion=Integer.parseInt(System.console().readLine());
        Disco[] discos = coleccion.consultarPorDuracion(minDuracion, maxDuracion);
        for(int i=0; i < discos.length; i++)
            if(discos[i]!=null)
                System.out.println(discos[i]);
    }

    private static void crear(){
        System.out.println("""
                NUEVO DISCO
                ===========
                Por favor, introduzca los datos del disco.
                """);
        System.out.print("Título: ");
        String titulo = System.console().readLine();
        System.out.print("Autor: ");
        String autor = System.console().readLine();
        System.out.print("Genero: ");
        String genero = System.console().readLine();
        System.out.print("Duración: ");
        int duracion = Integer.parseInt(System.console().readLine());
        Disco d = coleccion.crear(new Disco(autor, titulo, genero, duracion));
        if(d==null){
            System.out.println("No hay suficiente espacion en la colección para un nuevo disco");
        }
        else{
            System.out.printf("Disco %s creado corréctamente%n", d.getCod());
        }
    }

    private static void actualizar(){
        System.out.println("Por favor, introduzca el código del disco cuyos datos desea cambiar:" );
        String codigo = System.console().readLine();
        Disco d = coleccion.consultarPorID(codigo);
        if(d!=null){
            System.out.printf("Autor: %s%n", d.getAutor());
            System.out.print("Nuevo Autor: ");
            String autor = System.console().readLine();
            if(autor.isEmpty())
                autor = d.getAutor();
            System.out.printf("Título: %s%n", d.getTitulo());
            System.out.print("Nuevo Título: ");
            String titulo = System.console().readLine();
            if(titulo.isEmpty())
                titulo = d.getTitulo();
            System.out.printf("Género: %s%n", d.getGenero());
            System.out.print("Nuevo Género: ");
            String genero = System.console().readLine();
            if(genero.isEmpty())
                genero = d.getGenero();
            System.out.printf("Duración: %d%n", d.getDuracion());
            System.out.print("Nueva Duración: ");
            String _duracion = System.console().readLine();
            int duracion = 0;
            if(_duracion.isEmpty())
                duracion = d.getDuracion();
            else
                duracion = Integer.parseInt(_duracion);
            Disco actualizado = coleccion.actualizar(d.getCod(), new Disco(autor, titulo, genero, duracion));
            if(actualizado!=null)
                System.out.printf("Disco %s actualizado corréctamente", actualizado.getCod());
            else
                System.out.println("No se ha podido actualizar el disco");
        }
        else
            System.out.println("El disco no existe en la colección");
    }
    
    private static void borrar(){
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        String codigo = System.console().readLine();
        Disco d = coleccion.borrar(codigo);
        if(d!=null)
            System.out.printf("Disco %s eliminado corréctamente", d.getCod());
        else
            System.out.println("No se ha podido eliminar el disco");
    }

    public static void main(String[] args) {
        int opcion = -1;
        int opcion2 = -1;
        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    do {
                        submenu();
                        opcion2 = Integer.parseInt(System.console().readLine());
                        switch (opcion2) {
                            case 1:
                                listarCompleto();
                                break;
                            case 2:
                                listarPorAutor();
                                break;
                            case 3:
                                listarPorGenero();
                                break;
                            case 4:
                                listarPorRandoDuracion();
                                break;
                            default:
                                break;
                        }
                    } while (opcion2!=5);
                    break;
                case 2:
                    crear();
                    break;
                case 3:
                    actualizar();
                    break;
                case 4:
                    borrar();
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}