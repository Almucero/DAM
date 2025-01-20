package Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Gato[] gato = new Gato[4];

        gato[0] = new Gato("Garfield", "naranja", "mestizo");
        gato[1] = new Gato("Pepe", "gris", "angora");
        gato[2] = new Gato("Mauri", "blanco", "manx");
        gato[3] = new Gato("Ulises", "marrón", "persa");
        System.out.println("\nDatos de los gatos:");
        for (int i=0; i<4; i++) {
            System.out.print("\nGato no"+(i+1)+gato[i]);
        }
    }
}