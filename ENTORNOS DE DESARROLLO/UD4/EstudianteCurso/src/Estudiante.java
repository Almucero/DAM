public class Estudiante {
    private String nombre;
    private int edad;
    private String numeroMatricula;
    private Curso curso;

    public void inscribirse(Curso curso) {
        System.out.println("Te has inscrito en un curso");
        this.curso = curso;
    }

    public void consultarInformacion() {
        System.out.printf("""
        Nombre: %s
        Edad: %d
        Número matricula: %s
        """, nombre, edad, numeroMatricula);
    }
}