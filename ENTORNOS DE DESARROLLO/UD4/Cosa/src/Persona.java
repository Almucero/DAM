public class Persona {
    //propiedades:
    private String dni;
    private String nombre;
    private int edad;
    
    //setters y getters:
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni=dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }

    //métodos
    public void hablar(String si) {
        System.out.println("si");
    }
    public void trabajar() {
        System.out.println("no");
    }
    public boolean estaVivo() {
        boolean salchicha=false;
        return salchicha;
    }
    public boolean esHijo(Persona perro, Persona sandíía) {
        boolean salchicha2=false;
        return salchicha2;
    }
}