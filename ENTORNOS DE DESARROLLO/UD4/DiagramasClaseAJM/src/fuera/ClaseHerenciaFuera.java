package fuera;

import dentro.Superclase;

public class ClaseHerenciaFuera extends Superclase {
    public boolean claseHerenciaFueraPublico;
    private boolean claseHerenciaFueraPrivado;
    protected boolean claseHerenciaFueraProtected;
    boolean claseHerenciaFueraPaquete;

    public void probarVisibilidadSuperclase() {
        superclasePublico=true;
        superclasePrivado=true;
        superclaseProtected=true;
        superclasePaquete=true;
    }
}
