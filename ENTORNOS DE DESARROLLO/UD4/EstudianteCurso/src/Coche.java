public class Coche {
    private Motor motor;

    public Coche() {
        this.motor = new Motor();
    }

    public void arrancar() {
        motor.encender();
        System.out.println("El coche está en marcha.");
    }
}