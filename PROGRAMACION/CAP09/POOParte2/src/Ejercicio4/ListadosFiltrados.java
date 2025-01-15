package Ejercicio4;

import Ejercicio3.Disco;

public interface ListadosFiltrados {
    public Disco[] consultarPorAutor(String autor);
    public Disco[] consultarPorTitulo(String titulo);
    public Disco[] consultarPorGenero(String genero);
    public Disco[] consultarPorDuracion(int minDuracion, int maxDuracion);
}
