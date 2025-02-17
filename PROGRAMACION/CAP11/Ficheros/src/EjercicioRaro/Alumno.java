package EjercicioRaro;

public class Alumno {
    private Integer id;
    private String nombre;
    private String apellido;
    private String dni;
    private Grupo grupo;

    public Alumno(Integer id, String nombre, String apellido, String dni, Grupo grupo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.grupo = grupo;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Grupo getGrupo() {
        return grupo;
    }
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) {
            return true;
        }
        if (obj==null || obj!=this.getClass()) {
            return false;
        }
        Alumno alumno = (Alumno)obj;
        return this.id == alumno.id;
    }
    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
    @Override
    public int compareTo(Alumno o) {
        return this.id.compareTo(o.id);
    }
}