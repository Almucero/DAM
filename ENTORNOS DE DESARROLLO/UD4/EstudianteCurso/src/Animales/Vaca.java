package Animales;

public class Vaca extends Animal implements Herbivoro {
    @Override
    public void buscarPlantas() {
        System.out.println("Estoy buscando plantas");
    }

    @Override
    public void relacionarse() {
        System.out.println("Me relaciono con Vacas");
    }
}