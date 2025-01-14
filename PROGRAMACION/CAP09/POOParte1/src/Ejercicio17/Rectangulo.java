package Ejercicio17;

public class Rectangulo {
    private int base;
    private int altura;
    private static int RectangulosCreados;

    public static int getRectangulosCreados() {
        return RectangulosCreados;
    }

    public Rectangulo(int base, int altura) {
        this.base=base;
        this.altura=altura;
        RectangulosCreados++;
    }

    @Override
    public String toString() {
        String rectangulo="";
        for (int i=0; i<=altura; i++) {
            for (int j=0; j<=base; j++) {
                rectangulo+="*";
            }
            rectangulo+="\n";
        }
        return rectangulo;
    }
}
