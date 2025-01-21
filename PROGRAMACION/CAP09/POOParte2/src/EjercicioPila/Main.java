package EjercicioPila;

public class Main {
    public static void main(String[] args) {
        try {
            Pila miPila = new Pila(3); // Pila con capacidad de 3 elementos

            // Intentar agregar elementos
            miPila.push(10);
            miPila.push(20);
            miPila.push(30);
            miPila.push(40); // Este intento no se podrá realizar, ya que la pila está llena

            miPila.mostrarPila(); // Mostrar los elementos en la pila

            System.out.println("Elemento en el tope: " + miPila.peek());
            System.out.println("Elemento retirado: " + miPila.pop());
            miPila.mostrarPila();

            System.out.println("¿Está vacía? " + miPila.isEmpty());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}