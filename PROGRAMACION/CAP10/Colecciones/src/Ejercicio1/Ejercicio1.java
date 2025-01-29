package Ejercicio1;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> personas = new ArrayList<String>();
        personas.add("Adolf Hitler");
        personas.add("Mussolini");
        personas.add("Francisco Franco");
        personas.add("Hirohito");
        personas.add("Julio Cesar");
        personas.add("Vladimir Putin");

        //opción 1
        for (String gente:personas) {
            System.out.println(gente);
        }

        System.out.println();
        //opción 2
        for (int i=0; i<personas.size(); i++) {
            String gente = personas.get(i);
            System.out.println(gente);
        }

        System.out.println();
        //opción 3
        for (int i=0; i<personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }
}