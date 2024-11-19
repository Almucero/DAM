package Ejercicio61;

public class Ejercicio61 {
    public static void main(String[] args) {
        int altura=9;
        for (int i=altura; i>=1; i--) {
            for (int espacios=1; espacios<=altura-i; espacios++) {
                System.out.print(" ");
            }
            System.out.print("***");
            for (int espaciosInternos=1; espaciosInternos<=2*i-3; espaciosInternos++) {
                System.out.print(" ");
            }
            if (i>1) {
                System.out.print("***");
            }
            if (i==1) {
                System.out.print("**");
            }
            System.out.println();
        }

    }
}