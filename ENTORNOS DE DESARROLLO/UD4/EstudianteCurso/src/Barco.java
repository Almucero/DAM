public class Barco implements IVehiculo {
    @Override
    public void desplazarse(double coorX, double coorY) {
        System.out.printf("Estoy navegando a las coordenadas %.2fx %.2fy%n", coorX, coorY);
    }
}
