package Ejercicio4;

public class Fraccion {
    private int numerador;
    private int denominador;
    
    public Fraccion(int numerador, int denominador) {
        this.numerador=numerador;
        this.denominador=denominador;
    }
  
    //multiplicación
    public Fraccion multiplica(int n) {
        return new Fraccion(this.numerador*n, this.denominador);
    }
    public Fraccion multiplica(Fraccion f) {
        return new Fraccion(this.numerador*f.numerador, this.denominador*f.denominador);
    }

    //división
    public Fraccion divide(int n) {
        return new Fraccion(this.numerador, this.denominador*n);
    }
    public Fraccion divide(Fraccion f) {
        return new Fraccion(this.numerador*f.denominador, denominador*f.numerador);
    }

    //inversión
    public Fraccion invierte() {
        return new Fraccion(this.denominador, this.numerador);
    }

    //simplificación
    public Fraccion simplifica() {
        int mcd = mcd(this.numerador, this.denominador);
        return new Fraccion(this.numerador/mcd, this.denominador/mcd);
    }
    private int mcd(int a, int b) {
        for (int i=Math.min(Math.abs(a), Math.abs(b)); i>=1; i--) {
            if (a%i == 0 && b%i == 0) {
                return i;
            }
        }
        return 1;
    }

    public String toString() {
        return String.format("%s%d/%d", (numerador*denominador)<0?"-":"", Math.abs(numerador), Math.abs(denominador));
    }
}