package genericos;

public interface ArrayMethodsInterface<T> {

    public void anadir(T elemento);

    public void modificar(int indice, T elemento);

    public void eliminar(int indice);

    public T obtener(int indice) throws IndexOutOfBoundsException;
}