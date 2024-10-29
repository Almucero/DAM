import Ejercicio1.PilotoFormula1;
import Ejercicio2.Animal;
import Ejercicio2.Caballo;
import Ejercicio2.Gato;
import Ejercicio2.Mineral;
import Ejercicio2.Perro;
import Ejercicio2.Persona;
import Ejercicio7.Ventana;
import Ejercicio7.Punto;

public class App {
    public static void ejercicio1(){
        //Ejercicio 1
        PilotoFormula1 piloto1 = new PilotoFormula1(
            "Fernando Alonso",
            "Aston Martin",
            25,
            "Aston Martin 2023"
        );
        PilotoFormula1 piloto2 = new PilotoFormula1(
            "Carlos Sainz",
            "Ferrari",
            2,
            "Ferrari 2022"
        );
    }

    public static void ejercicio2(){
        Animal animal1 = new Animal();
    }
    public static void main(String[] args) throws Exception {
        ejercicio1();
        ejercicio2();

        Ventana ventana1 = new Ventana();
        Ventana ventana2 = new Ventana();
        
        ventana1.cerrar();
        ventana2.cerrar();
    }
}
