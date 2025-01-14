package Ejercicio14;

public class FichaDomino {
    private int num1;
    private int num2;

    public FichaDomino(int num1, int num2) {
        this.num1=num1;
        this.num2=num2;
    }

    public FichaDomino voltea() {
        int temp=num1;
        num1=num2;
        num2=temp;
        return new FichaDomino(num1, num2);
    }

    public boolean encaja(FichaDomino f) {
        if ((this.num1)==(f.num1)||(this.num1)==(f.num2)||(this.num2)==(f.num1)||(this.num2)==(f.num2)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        String res1=(num1==0)?" ":String.valueOf(num1);
        String res2=(num2==0)?" ":String.valueOf(num2);
        return String.format("[%s|%s]", res1, res2);
    }
}