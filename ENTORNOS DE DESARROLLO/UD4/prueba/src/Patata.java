public class Patata extends PatataAbstracta implements IPatata {
    private String apellido;
    private Hortaliza hortaliza;

    //agregación
    public Patata(String apellido, Hortaliza hortaliza) {
        this.hortaliza = hortaliza;
    }

    //composición
    public Patata(String apellido) {
        this.hortaliza = new Hortaliza("loca");
    }

    @Override
    public void classcrecer() {

    }

    @Override
    public void quemar() {

    }
}
