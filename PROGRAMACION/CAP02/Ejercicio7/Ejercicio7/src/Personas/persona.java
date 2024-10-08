package Personas;

public class persona {
    private String nombre;
    private String apellidos;
    private Date fechaNac;
    private String dni;
}
public persona(String nombre, String apellidos, Date fechaNac, String dni){
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.fechaNac = fechaNac;
}
public date getfechaNac(){
    return fechaNac;
}
public String obtenerFica(){
    return "Nombre: "+nombre+"\nApellidos: "+apellidos+"\ndni"+dni
}
