package Genericos;

public class Mascota {
	private String nombre;
	private int edad;
	
	public Mascota(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return String.format("Nombre: %s | Edad: %s%n", nombre,edad);
	}
}