package Ejercicio17;

public class Piramide {
    private int altura;
    private static int PiramidesCreadas;

    public Piramide(int altura) {
        this.altura=altura;
        PiramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return PiramidesCreadas;
    }

    @Override
    public String toString() {
        String piramide="";
        for (int i=1; i<=altura; i++) {
            for (int j=1; j<=(altura-i); j++) {
                piramide+=" ";
            }
            for (int j=1; j<=(2*i-1); j++) {
                piramide+="*";
            }
            piramide+="\n";
        }
        return piramide;
    }
}
