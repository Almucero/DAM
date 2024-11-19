package Ejercicio7;

public class Ejercicio7 {
    public static String golesMarcados(int aleatorio) {
        String goles="0";
        switch (aleatorio) {
            case 1-> goles="0";
            case 2-> goles="1";
            case 3-> goles="2";
            case 4-> goles="M";
        };
        return goles;
    }
    public static void main(String[] args) {
        int contador=0;
        String apuesta="";
        for (int i=1; i<=14; i++) {
            contador++;
            System.out.printf("%2d. |", contador);
            for (int j=1; j<=3; j++) {
                int aleatorio1 = (int)(Math.random()*3)+1;
                switch (aleatorio1) {
                    case 1-> apuesta=" X ";
                    case 2-> apuesta="1  ";
                    case 3-> apuesta="  2";
                }
                System.out.printf(apuesta+"|");
            }
            System.out.println();
        }
        int aleatorio2 = (int)(Math.random()*4)+1;
        int aleatorio3 = (int)(Math.random()*4)+1;
        System.out.printf("%nPLENO AL 15 - Local..."+golesMarcados(aleatorio2)+"  Visitante..."+golesMarcados(aleatorio3));
    }
}