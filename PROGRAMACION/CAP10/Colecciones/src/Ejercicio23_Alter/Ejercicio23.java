package Ejercicio23_Alter;

public class Ejercicio23 {
    public static void main(String[] args) {
        String[] piezas = {"Dama", "Torre", "Alfil", "Caballo", "Peón"};
        int[] valores = {9, 5, 3, 2, 1}, maxVeces = {1, 2, 2, 2, 8}, numveces = {0, 0, 0, 0, 0};
        int numCapturas=0, puntosTotales=0;
        do {
            int pieza = (int)(Math.random()*5);
            if (numveces[pieza]<maxVeces[pieza]) {
                numveces[pieza]++;
                puntosTotales += valores[pieza];
                numCapturas++;
            }
        } while (numCapturas!=(int)(Math.random()*16));
        System.out.println("Fichas capturadas por el jugador:");
        for (int i=0; i<piezas.length; i++) {
            if (numveces[i]>0) {
                if (numveces[i]>1) {
                    piezas[i] = piezas[i].equals("Peón") ? piezas[i] = "Peone" : piezas[i];
                    piezas[i] = piezas[i].equals("Alfil") ? piezas[i] = "Alfile" : piezas[i];
                }
                System.out.println(numveces[i]+" "+piezas[i]+(numveces[i]>1?"s":"")+" ("+(valores[i]*numveces[i])+" peones)");
            }
        }
        System.out.println("Puntos totales: "+puntosTotales+" peones");
    }
}