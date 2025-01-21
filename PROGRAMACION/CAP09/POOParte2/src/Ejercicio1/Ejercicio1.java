package Ejercicio1;

public class Ejercicio1 {
    private static Gato[] gato = new Gato[4];
    public static void main(String[] args) {
        System.out.println("Por favor introduzca los datos de los gatos: ");
        for (int i=0; i<4; i++) {
            System.out.println("Gato no"+(i+1));
            System.out.print("Nombre: ");
            String nombre = System.console().readLine();
            System.out.print("Color: ");
            String color = System.console().readLine();
            System.out.print("Raza: ");
            String raza = System.console().readLine();
            gato[i] = new Gato(nombre, color, raza);
            System.out.println();
        }
        System.out.println("Datos de los gatos: ");
        for (int j=0; j<4; j++) {
            System.out.print("Gato no"+(j+1)+"\n"+gato[j]);
            System.out.println();
        }
    }
}