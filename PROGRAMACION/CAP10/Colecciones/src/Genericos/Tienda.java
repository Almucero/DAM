package Genericos;

import java.util.ArrayList;

public class Tienda<T extends Mascota> {
	private ArrayList<T> mascotas = new ArrayList<>();

	public  void agregarMascota(T mascota){
		if(mascota!=null){
			mascotas.add(mascota);
		}else{
			System.out.println("No se ha podido agregar");
		}
	}

	public void mostrarMascotas(){
		if (mascotas.isEmpty()) {
			System.out.println("Añade antes una mascota anda picha");
		}else{
			System.out.println("Mascotas listadas: ");
			for (T mascota : mascotas) {
				System.out.print(mascota);
			}
		}
	}
}