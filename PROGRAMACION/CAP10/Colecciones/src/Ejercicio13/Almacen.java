package Ejercicio13;

import java.util.ArrayList;
import Ejercicio13.Excepciones.*;

public class Almacen implements AlmacenInterface {
    private ArrayList<Articulo> articulos;

    public Almacen() {
        articulos = new ArrayList<Articulo>();
    }

    public int comprobarExistenciaArticulo(String codigo) throws ArticuloNoExisteException {
        for (int i=0; i<articulos.size(); i++) {
            if (articulos.get(i).getCodigo().equals(codigo)) {
                return i;
            }
        }
        throw new ArticuloNoExisteException();
    }

    public Articulo devolverArticuloPorPosicion(int posicion) {
        return articulos.get(posicion);
    }

    @Override
    public Articulo crearArticulo(Articulo articulo) throws ArticuloYaExisteException {
        try {
            comprobarExistenciaArticulo(articulo.getCodigo());
            throw new ArticuloYaExisteException();
        }
        catch (ArticuloNoExisteException e) {
            articulos.add(articulo);
            return articulo;
        }
    }

    @Override
    public void borrarArticulo(String codigo) throws ArticuloNoExisteException {
        int posicion = comprobarExistenciaArticulo(codigo);
        articulos.remove(posicion);
    }

    @Override
    public void modificarArticulo(String codigo, Articulo nuevoArticulo) throws ArticuloNoExisteException {
        int posicion = comprobarExistenciaArticulo(codigo);
        articulos.set(posicion, nuevoArticulo);
    }

    @Override
    public void entradaMercancia(String codigo, int cantidad) throws ArticuloNoExisteException {
        int posicion = comprobarExistenciaArticulo(codigo);
        articulos.get(posicion).setStock(articulos.get(posicion).getStock()+cantidad);
    }

    @Override
    public void salidaMercancia(String codigo, int cantidad) throws ArticuloNoExisteException {
        int posicion = comprobarExistenciaArticulo(codigo);
        articulos.get(posicion).setStock(articulos.get(posicion).getStock()-cantidad);
    }
    
    @Override
    public String toString() {
        String listado = "";
        for (int i=0; i<articulos.size(); i++) {
            if (articulos.get(i)!=null) {
                listado += articulos.get(i);
            }
        }
        return listado = (articulos.isEmpty()) ? "" : listado;
    }
}