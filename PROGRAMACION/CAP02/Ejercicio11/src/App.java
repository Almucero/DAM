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
        Persona paula = new Persona();
        Persona javier = new Persona();
        Perro goofy = new Perro();
        Perro milu = new Perro();
        Perro snoopy = new Perro();
        Perro pluto = new Perro();
        Perro laika  = new Perro();
        Gato tom = new Gato();
        Gato silvestre = new Gato();
        Caballo rocinante = new Caballo();
        Caballo bucefalo = new Caballo();
        Caballo pegaso = new Caballo();
        Animal pato_lucas = new Animal();
        Mineral pirita = new Mineral();
        Mineral cuarzo = new Mineral();
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
