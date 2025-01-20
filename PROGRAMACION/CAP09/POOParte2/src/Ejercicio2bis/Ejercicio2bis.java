package Ejercicio2bis;

public class Ejercicio2bis {
    public static void main(String[] args) {
        Gato[] gato = new Gato[4];

        gato[0] = new Gato();
        gato[0].setNombre("Garfield");
        gato[0].setColor("naranja");
        gato[0].setRaza("mestizo");

        gato[1] = new Gato();
        gato[1].setNombre("Pepe");
        gato[1].setColor("gris");
        gato[1].setRaza("angora");

        gato[2] = new Gato();
        gato[2].setNombre("Mauri");
        gato[2].setColor("blanco");
        gato[2].setRaza("manx");

        gato[3] = new Gato();
        gato[3].setNombre("Ulises");
        gato[3].setColor("marrón");
        gato[3].setRaza("persa");

        System.out.println("Datos de los gatos: ");
        for (int i=0; i<4; i++) {
            System.out.print("\nGato no"+(i+1)+gato[i]);
        }
    }
}