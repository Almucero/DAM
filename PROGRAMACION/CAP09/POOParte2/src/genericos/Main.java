package genericos;

public class Main {
    private static String textoAleatorio(int tamanio){
        String texto = "";
        for(int i = 0; i < tamanio; i++){
            texto += (char)(Math.random()*(90 - 65 - 1) + 65);
        }
        return texto;
    }
    public static void main(String[] args) {
        MiArrayList<String> lista1 = new MiArrayList<String>(100);
        for(int i = 0; i < 200; i++)
            lista1.anadir(textoAleatorio(10));
        
        System.out.println(lista1);

        MiArrayList<Integer> lista2 = new MiArrayList<Integer>(100);
        lista2.anadir(100);
        lista2.anadir(200);
        lista2.anadir(300);
        System.out.println(lista2);
    }   
}