package Ejercicio23;

public class Ejercicio23 {
    public static void main(String[] args) {
        int maxVecesDama=1, numVecesDama=0;
        int maxVecesTorre=2, numVecesTorre=0;
        int maxVecesAlfil=2, numVecesAlfil=0;
        int maxVecesCaballo=2, numVecesCaballo=0;
        int maxVecesPeon=8, numVecesPeon=0;
        int numVeces=0;
        int puntosTotales=0;
        do {
            switch ((int)(Math.random()*6)) {
                case 1:
                    if (numVecesDama==maxVecesDama) {
                        break;
                    }
                    numVecesDama++;
                    numVeces++;
                    puntosTotales += 9;
                    break;
                case 2:
                    if (numVecesTorre==maxVecesTorre) {
                        break;
                    }
                    numVecesTorre++;
                    numVeces++;
                    puntosTotales += 5;
                    break;
                case 3:
                    if (numVecesAlfil==maxVecesAlfil) {
                        break;
                    }
                    numVecesAlfil++;
                    numVeces++;
                    puntosTotales += 3;
                    break;
                case 4:
                    if (numVecesCaballo==maxVecesCaballo) {
                        break;
                    }
                    numVecesCaballo++;
                    numVeces++;
                    puntosTotales += 2;
                    break;
                case 5:
                    if (numVecesPeon==maxVecesPeon) {
                        break;
                    }
                    numVecesPeon++;
                    numVeces++;
                    puntosTotales += 1;
                    break;
            }
        } while (numVeces!=(int)(Math.random()*16));
        System.out.println("Fichas capturadas por el jugador: ");
        if (numVecesDama!=0) {
            System.out.println("Dama (9 peones)");
        }
        if (numVecesTorre!=0) {
            if (numVecesTorre>1) {
                System.out.println(numVecesTorre+" Torres ("+(5*numVecesTorre)+" peones)");
            }
            else {
                System.out.println("Torre ("+(5*numVecesTorre)+" peones)");
            }
        }
        if (numVecesAlfil!=0) {
            if (numVecesAlfil>1) {
                System.out.println(numVecesAlfil+" Alfiles ("+(3*numVecesAlfil)+" peones)");
            }
            else {
                System.out.println("Alfil ("+(3*numVecesAlfil)+" peones)");
            }
        }
        if (numVecesCaballo!=0) {
            if (numVecesCaballo>1) {
                System.out.println(numVecesCaballo+" Caballos ("+(2*numVecesCaballo)+" peones)");
            }
            else {
                System.out.println("Caballo ("+(2*numVecesCaballo)+" peones)");
            }
        }
        if (numVecesPeon!=0) {
            if (numVecesPeon>1) {
                System.out.println(numVecesPeon+" Peones ("+(1*numVecesPeon)+" peones)");
            }
            else {
                System.out.println("Peón ("+(1*numVecesPeon)+" peón)");
            }
        }
        System.out.println("Puntos totales: "+puntosTotales+" peones");
    }
}