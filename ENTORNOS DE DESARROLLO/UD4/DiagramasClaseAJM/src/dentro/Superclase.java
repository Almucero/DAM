package dentro;

public class Superclase {
    public boolean superclasePublico;
    private boolean superclasePrivado;
    protected boolean superclaseProtected;
    boolean superclasePaquete;

    public void probarVisibilidadSuperclase() {
        superclasePublico=true;
        superclasePrivado=true;
        superclaseProtected=true;
        superclasePaquete=true;
    }
}