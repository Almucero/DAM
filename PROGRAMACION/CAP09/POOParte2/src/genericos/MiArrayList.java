package genericos;

public class MiArrayList<T> implements ArrayMethodsInterface<T>{
    private T[] lista;
    int tamanio;

    @SuppressWarnings("unchecked")
    public MiArrayList(int tamanioInicial){
        lista = (T[]) new Object[tamanioInicial];
        tamanio = 0;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void anadir(T elemento){
        if(tamanio+1 >= this.lista.length){
            T[] aux = (T[]) new Object[this.lista.length*2];
            int i = 0;
            for(T elem:this.lista){
                aux[i]=elem;
                i++;
            }
            this.lista = aux;
        }
        this.lista[this.tamanio++] = elemento;
    }

    @Override
    public void modificar(int indice, T elemento){
        if(indice>=0 && indice<this.tamanio){
            this.lista[indice] = elemento;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void eliminar(int indice){
        if(indice>=0 && indice<this.tamanio){
            for(int i=indice; i <tamanio-1;i++){
                this.lista[i]=this.lista[i+1];
            }
            this.tamanio--;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public T obtener(int indice) throws IndexOutOfBoundsException{
        if(indice>=0 && indice<this.tamanio){
            return this.lista[indice];
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        String res = "";
        for(int i = 0; i<this.tamanio;i++){
            res += String.format("""
                -----------------------------
                %s
                -----------------------------
                """,this.lista[i].toString());
        }
        return res;
    }
}