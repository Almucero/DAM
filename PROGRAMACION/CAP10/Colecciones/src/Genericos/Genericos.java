package Genericos;

public class Genericos {
	public static void main(String[] args) {
		Tienda<Perro> tiendaPerro = new Tienda<>();
		Tienda<Gato> tiendaGato = new Tienda<>();
		Perro perro1 = new Perro("alberto", 3);
		Perro perro2 = new Perro("Cordobes", 1);
		Gato gato1 = new Gato("Javi", 5);
		Gato gato2 = new Gato("Barba", 6);
		/**Agrego gatos */
		tiendaGato.agregarMascota(gato1);
		tiendaGato.agregarMascota(gato2);
		/**Agrego perros */
		tiendaPerro.agregarMascota(perro1);
		tiendaPerro.agregarMascota(perro2);
		//Muestro ambas mascotas
		System.out.println("GATOS: ");
		System.out.println("----------------------------");
		tiendaGato.mostrarMascotas();
		System.out.println("----------------------------");
		System.out.println("PERROS: ");
		System.out.println("----------------------------");
		tiendaPerro.mostrarMascotas();
	}
}