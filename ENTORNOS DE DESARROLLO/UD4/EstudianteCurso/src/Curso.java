public class Curso {
    private String nombreCurso;
    private int codigoCurso;
    Estudiante[] estudiantes;

    public String getNombreCurso() {
        return nombreCurso;
    }
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void mostrarInformacion() {
        System.out.println("El curso es: "+nombreCurso);
    }

    @Override
    public String toString() {
        return "El curso se llama: "+nombreCurso+" y su código es: "+codigoCurso;
    }
}