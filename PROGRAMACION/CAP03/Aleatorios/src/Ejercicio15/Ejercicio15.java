package Ejercicio15;

public class Ejercicio15 {
    public static String generarNota() {
        int aleatorio = (int)(Math.random()*7)+1;
        return switch (aleatorio) {
            case 1-> "do";
            case 2-> "re";
            case 3-> "mi";
            case 4-> "fa";
            case 5-> "sol";
            case 6-> "la";
            case 7-> "si";
            default->"";
        };
    }
    public static void main(String[] args) {
        int aleatorio2 = (int)(Math.random()*7)+1;
        String primeraNota = generarNota();
        System.out.printf("%s ", primeraNota);
        //para que coincida la nota inicial y final
        if (aleatorio2>1) {
            //si se va a generar más de 1 grupo de notas
            for (int j=1; j<=3; j++) {
                System.out.printf("%s ", generarNota());
            }
            System.out.print("| ");
            for (int i=1; i<=aleatorio2-1; i++) {
                for (int j=1; j<=3; j++) {
                    System.out.printf("%s ", generarNota());
                }
                System.out.printf("%s ", generarNota());
                System.out.print("| ");
            }
            for (int j=1; j<=3; j++) {
                System.out.printf("%s ", generarNota());
            }
            System.out.printf("%s |", primeraNota);
        }
        else {
            //si solo se genera 1 grupo de notas
            System.out.printf("%s %s %s |", generarNota(), generarNota(), primeraNota);
        }
        System.out.print("|");
    }
}