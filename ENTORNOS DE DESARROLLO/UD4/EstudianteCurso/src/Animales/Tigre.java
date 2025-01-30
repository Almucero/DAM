package Animales;

public class Tigre extends Animal implements Carnivoro {
    @Override
    public void cazar() {
        System.out.println("Estoy cazando al máximo nivel");
    }

    @Override
    public void relacionarse() {
        System.out.println("Me relaciono con tigres");
    }
}