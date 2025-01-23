public class Estudiante {
    private String nombre;
    private int edad;
    private String numeroMatricula;
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }
    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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