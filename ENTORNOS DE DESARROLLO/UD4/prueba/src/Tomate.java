public class Tomate extends Comida implements IPatata {
    private String apellido;

    public Tomate(String nombre, double valor, String apellido) {
        super(nombre, valor);
        this.apellido = apellido;
    }

    @Override
    public void quemar() {

    }
}
