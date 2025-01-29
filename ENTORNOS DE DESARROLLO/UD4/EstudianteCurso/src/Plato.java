public class Plato {
    private Ingrediente[] ingredientes;

    public Plato(Ingrediente[] ingredientes) {
        this. ingredientes=ingredientes;
    }

    public void mostrarIngredientes() {
        for (Ingrediente ingrediente:ingredientes) {
            System.out.println("Ingrediente: "+ingrediente.nombre);
        }
    }
}