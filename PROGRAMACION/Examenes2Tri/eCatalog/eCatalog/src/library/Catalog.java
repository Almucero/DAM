package library;
import java.util.HashSet;
import java.util.ArrayList;

/**
 * Implementación genérica de un catálogo que puede almacenar cualquier tipo de elemento.
 * Mantiene un conjunto de elementos únicos y proporciona operaciones básicas para su gestión.
 * @param <T> tipo de elementos que almacenará el catálogo
 */
/*1. Crear `Catalog<T>` que implemente `ICatalog<T>`: 
○  Necesitarás una estructura para almacenar elementos de 
tipo T (¿ArrayList tal vez? 🤔) 
○  addItem debe devolver true si añade el elemento, false si 
ya existía 
○  removeItem debe eliminar el elemento (y no explotar si no 
existe) 
 
○  getAllItems debe devolver una copia de la colección (¡no 
seas tacaño!) 
2. Las pruebas verificarán: 
○  Que funciona con Strings (fácil, como un paseo por el 
parque 🌳) 
○  Que funciona con Books (aquí es donde el equals importa y 
donde empezarás a apreciar haberlo implementado bien) 
○  Que no permite duplicados (¡tendrás que verificar antes 
de añadir! No queremos gemelos malvados en nuestro 
catálogo) 
○  Que manejas las colecciones como un ninja 🥷 (sin 
efectos secundarios, sin referencias directas) 
 
¡PISTA DE ORO! 🌟 Recuerda que T puede ser CUALQUIER cosa. Sí, 
incluso ese tipo raro que tu compañero inventó ayer. 
 
●  Implementación de Catalog<T> (25 puntos): 
○  Estructura de datos correcta (5 puntos) 
○  addItem con control de duplicados (8 puntos) 
○  removeItem funcionando (5 puntos) 
○  getAllItems devolviendo copia (7 puntos) 
●  Pruebas Fase2.java pasan correctamente (5 puntos) */
public class Catalog<T> implements ICatalog<T> {
    private ArrayList<T> elementos;

    public Catalog() {
        this.elementos = new ArrayList<T>();
    }

    @Override
    public boolean addItem(T item) {
        for (int i=0; i<elementos.size(); i++) {
            if (elementos.get(i)!=null && elementos.get(i)==item) {
                return false;
            }
        }
        elementos.add(item);
        return true;
    }

    @Override
    public void removeItem(T item) {
        for (int i=0; i<elementos.size(); i++) {
            if (elementos.get(i)!=null && elementos.get(i)==item) {
                elementos.remove(i);
            }
        }
    }

    @Override
    public ArrayList<T> getAllItems() {
        return elementos;
    }
    
} 