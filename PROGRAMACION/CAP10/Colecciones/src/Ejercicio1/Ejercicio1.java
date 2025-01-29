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

        for (String gente:personas) {
            System.out.println(gente);
        }
    } 
}