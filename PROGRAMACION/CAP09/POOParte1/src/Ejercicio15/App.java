package Ejercicio15;

public class App {
    public static int generarNumero() {
        return (int)(Math.random()*7);
    }
    public static void main(String[] args) {
        FichaDomino f1 = new FichaDomino(generarNumero(), generarNumero());
        System.out.print(f1);
        for (int i=0; i<=6; i++) {
            while(true) {
                FichaDomino f2 = new FichaDomino(generarNumero(), generarNumero());
                if (f1.encaja(f2)) {
                    System.out.print(f2);
                    f1=f2;
                    break;
                }
            }
        }
    }
}