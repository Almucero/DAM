public class Avion implements IVehiculo {
    @Override
    public void desplazarse(double coorX, double coorY) {
        System.out.printf("Estoy volando a las coordenadas %.2fx %.2fy%n", coorX, coorY);
    }
}
