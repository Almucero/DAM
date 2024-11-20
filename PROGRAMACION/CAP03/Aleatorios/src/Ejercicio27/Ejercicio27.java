package Ejercicio27;

public class Ejercicio27 {
    public static void main(String[] args) {
        int tiradaJugadorNum=0;
        String tiradaOrdenadorStr="";
        while (true) {
            System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
            String tiradaJugadorNumStr = System.console().readLine();
            switch (tiradaJugadorNumStr.toLowerCase()) {
                case "piedra"-> {
                    tiradaJugadorNum=1;
                    break;
                    }
                case "papel"-> {
                    tiradaJugadorNum=2;
                    break;
                    }
                case "tijera"-> {
                    tiradaJugadorNum=3;
                    break;
                    }
                default-> {
                    System.out.println("Error. Debe introducir una de las 3 opciones válidas");
                    System.out.println();
                    continue;
                    }
            }
            if (tiradaJugadorNum==1 || tiradaJugadorNum==2 || tiradaJugadorNum==3) {
                break;
            }
        }
        System.out.print("Turno del ordenador: ");
        int tiradaOrdenadorNum = (int)(Math.random()*3)+1;
        switch (tiradaOrdenadorNum) {
            case 1-> tiradaOrdenadorStr="piedra";
            case 2-> tiradaOrdenadorStr="papel";
            case 3-> tiradaOrdenadorStr="tijera";
        }
        System.out.printf(tiradaOrdenadorStr+"%n");
        if (tiradaJugadorNum==tiradaOrdenadorNum) {
            System.out.println("Empate");
        }
        else if ((tiradaJugadorNum==1 && tiradaOrdenadorNum==3) || 
                 (tiradaJugadorNum==2 && tiradaOrdenadorNum==1) || 
                 (tiradaJugadorNum==3 && tiradaOrdenadorNum==2)) {
            System.out.println("Gana el jugador");    
        }
        else {
            System.out.println("Gana el ordenador");
        }
    }
}