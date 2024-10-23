package Ejercicio1;
public class Ejercicio1 {
    public static String diasSemana(){
        System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
        String dia = System.console().readLine();
        return switch(dia.toUpperCase()){
            case "LUNES"->"Programación";
            case "MARTES"->"Ipe I";
            case "MIERCOLES", "MIÉRCOLES"->"Programación";
            case "JUEVES"->"Lenguajes de marcas";
            case "VIERNES"->"Lenguajes de marcas";
            default->"No hay clase";
        };
        
    }
}