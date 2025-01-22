public class Curso {
    private String nombreCurso;
    private int codigoCurso;
    Estudiante[] estudiantes;

    public void mostrarInformacion() {
        System.out.println("El curso es: "+nombreCurso);
    }

    @Override
    public String toString() {
        return "El curso se llama: "+nombreCurso+" y su código es: "+codigoCurso;
    }
}