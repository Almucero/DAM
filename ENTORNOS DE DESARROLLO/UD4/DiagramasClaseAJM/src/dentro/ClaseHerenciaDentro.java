package dentro;

public class ClaseHerenciaDentro extends Superclase {
    public boolean claseHerenciaDentroPublico;
    private boolean claseHerenciaDentroPrivado;
    protected boolean claseHerenciaDentroProtected;
    boolean claseHerenciaDentroPaquete;

    public void probarVisibilidadSuperclase() {
        superclasePublico=true;
        superclasePrivado=true;
        superclaseProtected=true;
        superclasePaquete=true;
    }
}
