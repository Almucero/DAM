public class Coche implements IVehiculo {
    private Motor motor;

    public Coche() {
        this.motor = new Motor();
    }

    public void arrancar() {
        motor.encender();
        System.out.println("El coche está en marcha.");
    }

    @Override
    public void desplazarse(double coorX, double coorY) {
        System.out.printf("Estoy conduciendo a las coordenadas %.2fx %.2fy%n", coorX, coorY);
    }
}