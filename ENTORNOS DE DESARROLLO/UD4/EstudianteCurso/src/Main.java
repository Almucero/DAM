import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IVehiculo> vehiculos = new ArrayList<IVehiculo>();

        vehiculos.add(new Barco());
        vehiculos.add(new Coche());
        vehiculos.add(new Avion());

        for (int i=0; i<vehiculos.size(); i++) {
            vehiculos.get(i).desplazarse(80, 60);
        }
    }
}