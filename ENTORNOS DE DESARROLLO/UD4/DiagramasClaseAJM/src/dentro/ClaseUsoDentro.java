package dentro;

import fuera.ClaseHerenciaFuera;

public class ClaseUsoDentro {

    public void usar() {
        Superclase superclase = new Superclase();
        superclase.superclaseProtected = true;
        superclase.superclasePaquete = true;
        superclase.superclasePublico = true;
        superclase.superclasePrivado = true;

        ClaseHerenciaDentro claseHerenciaDentro = new ClaseHerenciaDentro();
        claseHerenciaDentro.superclaseProtected = true;
        claseHerenciaDentro.superclasePublico = true;
        claseHerenciaDentro.superclasePaquete = true;
        claseHerenciaDentro.superclasePrivado = true;

        claseHerenciaDentro.claseHerenciaDentroProtected = true;
        claseHerenciaDentro.claseHerenciaDentroPaquete = true;
        claseHerenciaDentro.claseHerenciaDentroPublico = true;
        claseHerenciaDentro.claseHerenciaDentroPrivado = true;

        ClaseHerenciaFuera claseHerenciaFuera = new ClaseHerenciaFuera();
        claseHerenciaFuera.superclaseProtected = true;
        claseHerenciaFuera.superclasePublico = true;
        claseHerenciaFuera.superclasePaquete = true;
        claseHerenciaFuera.superclasePrivado = true;

        claseHerenciaFuera.claseHerenciaFueraProtected = true;
        claseHerenciaFuera.claseHerenciaFueraPaquete = true;
        claseHerenciaFuera.claseHerenciaFueraPublico = true;
        claseHerenciaFuera.claseHerenciaFueraPrivado = true;
    }
}