package Ejercicio18;

public class Incidencia {
    private int codigo;
    private int puesto;
    private String problema;
    private String estado;
    private String solucion;
    private static int numTotalIncidencias;
    private static int numIncidenciasResueltas;

    public Incidencia(int puesto, String problema) {
        this.puesto=puesto;
        this.problema=problema;
        this.codigo=++numTotalIncidencias;
        this.estado="Pendiente";
        this.solucion="";
    }

    public void resuelve(String solucion) {
        this.estado="resuelta";
        this.solucion=solucion;
        numIncidenciasResueltas++;
    }

    public static int getPendientes() {
        return numTotalIncidencias-numIncidenciasResueltas;
    }

    @Override
    public String toString() {
        if (estado.equals("Pendiente")) {
            return String.format("Incidencia %d - Puesto: %d - %s - Pendiente", codigo, puesto, problema);
        }
        else {
            return String.format("Incidencia %d - Puesto: %d - %s - Resuelta - %s", codigo, puesto, problema, solucion);
        }
    }
}