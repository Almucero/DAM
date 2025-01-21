package EjercicioPila;

public class Pila {
    private int[] pila;
    private int tope;

    // Constructor: inicializa la pila con una capacidad fija
    public Pila(int capacidad) {
        pila = new int[capacidad];
        tope = -1; // Indica que la pila está vacía
    }

    // Método para agregar un elemento a la pila si no está llena
    public void push(int elemento) {
        if (tope == pila.length - 1) {
            System.out.println("Error: La pila está llena. No se puede agregar más elementos.");
        } else {
            pila[++tope] = elemento;
            System.out.println("Elemento " + elemento + " añadido a la pila.");
        }
    }

    // Método para quitar el elemento del tope de la pila
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Error: La pila está vacía.");
        }
        return pila[tope--];
    }

    // Método para ver el elemento en el tope sin eliminarlo
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Error: La pila está vacía.");
        }
        return pila[tope];
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return tope == -1;
    }

    // Método para mostrar todos los elementos de la pila
    public void mostrarPila() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elementos en la pila:");
            for (int i = tope; i >= 0; i--) {
                System.out.println(pila[i]);
            }
        }
    }
}