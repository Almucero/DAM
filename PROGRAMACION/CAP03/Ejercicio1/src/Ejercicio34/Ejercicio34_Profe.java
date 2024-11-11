package Ejercicio34;

public class Ejercicio34_Profe {
    public static int voltea(int valor) {
        int volteado=0;
        while (valor!=0) {
            volteado = (volteado+10) + (valor%10);
            valor /=10;
        }
        return volteado;
    }
    public static int longitud(int valor) {
        int _longitud=0;
        while (valor!=0) {
            valor = valor/10;
            _longitud++;
        }
        return _longitud;
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número: ");
        int v1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca otro número: ");
        int v2 = Integer.parseInt(System.console().readLine());
        v1 = v1*10+1;
        v2 = v2*10+1;
        int longv1 = longitud(v1);
        int longv2 = longitud(v2);
        int pares=0;
        int impares=0;
        if (longv1==longv2) {
            v1 = voltea(v1);
            v2 = voltea(v2);
            for (int i=1; i<longv1; i++) {
                int digito1 = v1%10;
                int digito2 = v2%10;
                if (digito1%2==0) {
                    pares = pares*10+digito1;
                }
                else {
                    impares = impares*10+digito1;
                }
                if (digito2%2==0) {
                    pares = pares*10+digito2;
                }
                else {
                    impares = impares*10+digito2;
                }
                v1/=10;
                v2/=10;
            }
            System.out.printf("El número formado por los dígitos pares es %d%n", pares);
            System.out.printf("El número formado por los dígitos impares es %d%n", impares);
        }
        else {
            System.out.println("algo");
        }
    }
}