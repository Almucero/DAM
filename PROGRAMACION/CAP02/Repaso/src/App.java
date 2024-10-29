import Maximo.Maximo;
import Producto.Producto;
import Vehiculo.Vehiculo;

public class App {
    public static void main(String[] args) {

        //Ejercicio1
        System.out.print("Introduzca el nombre del prodcuto que desea añadir: ");
        String nombre = System.console().readLine();
        System.out.print("Introduzca el precio del producto: ");
        double precio = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca la cantidad del producto: ");
        int cantidad = Integer.parseInt(System.console().readLine());

        Producto producto1 = new Producto(nombre, precio, cantidad);

        producto1.mostarInfo();

        System.out.println();
        System.out.print("Ingrese cuanto quiere aumentar las existencias del producto: ");
        int aumento = Integer.parseInt(System.console().readLine());
        producto1.aumentarCantidad(aumento);

        producto1.mostarInfo();

        System.out.println();
        System.out.print("Ingrese cuanto quiere reducir las existencias del producto: ");
        int reduccion = Integer.parseInt(System.console().readLine());
        producto1.reducirCantidad(reduccion);

        producto1.mostarInfo();
        System.out.println();

        //Ejercicio2
        System.out.println("Vehículo 1: ");
        System.out.print("Introduzca el número de matrícula del vehículo: ");
        int matricula = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la marca del vehículo: ");
        String marca = System.console().readLine();
        System.out.print("Introduzca el año de fabricación del vehículo: ");
        int anio = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el precio de alquiler del vehículo: ");
        double alquiler = Double.parseDouble(System.console().readLine());
        Vehiculo vehiculo1 = new Vehiculo(matricula, marca, anio, alquiler);

        vehiculo1.mostarInfo();
        System.out.println();

        System.out.println("Vehículo 2: ");
        System.out.print("Introduzca el número de matrícula del vehículo: ");
        int matricula2 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la marca del vehículo: ");
        String marca2 = System.console().readLine();
        System.out.print("Introduzca el año de fabricación del vehículo: ");
        int anio2 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el precio de alquiler del vehículo: ");
        double alquiler2 = Double.parseDouble(System.console().readLine());
        Vehiculo vehiculo2 = new Vehiculo(matricula2, marca2, anio2, alquiler2);

        vehiculo2.mostarInfo();
        System.out.println();

        System.out.print("¿A qué vehículo deseas cambiar el precio de alquiler?: ");
        String decision = System.console().readLine();
        if (decision.equalsIgnoreCase(marca)) {
            System.out.print("¿Cuál va a ser el nuevo precio?: ");
            double precio1 = Double.parseDouble(System.console().readLine());
            vehiculo1.setprecioAlquiler(precio1);
        }
        else if (decision.equalsIgnoreCase(marca2)) {
            System.out.print("¿Cuál va a ser el nuevo precio?: ");
            double precio2 = Double.parseDouble(System.console().readLine());
            vehiculo2.setprecioAlquiler(precio2);
        }
        else {
            System.out.println("Introduzca un valor válido");
        }
        System.out.println();

        System.out.println("Vehículo 1: ");
        vehiculo1.mostarInfo();
        System.out.println();

        System.out.println("Vehículo 2: ");
        vehiculo2.mostarInfo();
        System.out.println();

        //Ejercicio3
        System.out.print("Introduzca el valor del primer número: ");
        int a = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el valor del segundo número: ");
        int b = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el valor del tercer número: ");
        int c = Integer.parseInt(System.console().readLine());
        System.out.println("El número más grande de entre los tres es: "+Maximo.MaxDeTresNumeros(a, b, c));
        System.out.println();
    }
}
