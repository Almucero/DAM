package Ejercicio5;

public class Disco {
    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    public static String generarCodigo() {
        char maxLetra = 'Z';
        char minLetra = 'A';
        char maxNumero = '9';
        char minNumero = '0';
        String codigo = "";
        for (int i=0; i<=3; i++) {
            if (Math.random()>0.5) {
                codigo += (char)Math.random()*((maxLetra-minLetra+1)+minLetra);
            }
            else {
                codigo += (char)Math.random()*((maxNumero-minNumero+1)+minNumero);
            }
        }
        return codigo;
    }

    public Disco(String autor, String titulo, String genero, int duracion) {
        this.autor=autor;
        this.titulo=titulo;
        this.genero=genero;
        this.codigo=generarCodigo();
    }

    @Override
    public String toString() {
        return String.format("autor", null);
    }
}