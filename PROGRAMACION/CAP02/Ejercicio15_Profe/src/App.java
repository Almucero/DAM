import poo.Calculadora;
import tema2.Ejercicio1.Ejercicio1;
import tema2.Ejercicio2.Ejercicio2;
import tema2.Ejercicio4.Ejercicio4;
import tema2.Ejercicio5.Ejercicio5;
import tema2.Ejercicio6.Ejercicio6;
import tema2.Ejercicio7.Ejercicio7;
import tema3.*;


public class App {
    public static void main(String[] args) throws Exception {
        /* 
        Ejercicio1.ejercicio1();
        Ejercicio2.ejercicio2();
        Ejercicio4.ejercicio4();
        Ejercicio5.ejercicio4();
        Ejercicio6.ejercicio6();
        Ejercicio7.ejercicio7();
        tema3.Ejercicio1.ejercicio1();
        
        tema3.Ejercicio5.ejercicio5();
        */
        poo.Calculadora calculadora = new Calculadora("Calculadora1");
    
        calculadora.entrada(1);
        calculadora.entrada(5);
        calculadora.entrada(8);
        System.out.println(calculadora.mostrar());
        poo.Calculadora calculadora2 = new  Calculadora("Calculadora2", calculadora.getLcd());
        calculadora2.entrada(9);
        System.out.println(calculadora2.mostrar());

    }
}
