package Ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir las dimensiones de la tableta
        System.out.print("Introduzca la anchura de la tableta: ");
        int anchura = scanner.nextInt();
        System.out.print("Introduzca la altura de la tableta: ");
        int altura = scanner.nextInt();

        // Verificar que las dimensiones sean válidas
        if (anchura < 2 || altura < 2) {
            System.out.println("Las dimensiones deben ser mayores que 1.");
            return;
        }

        // Generar el borde en el que se hará el bocado (aleatoriamente)
        int borde = (int)(Math.random() * 4); // 0: superior, 1: inferior, 2: izquierdo, 3: derecho

        // Generar la posición del bocado (aleatorio en el borde)
        int posicionBocado = 0;
        if (borde == 0 || borde == 1) {
            posicionBocado = (int)(Math.random() * anchura); // Para borde superior o inferior
        } else {
            posicionBocado = (int)(Math.random() * altura); // Para borde izquierdo o derecho
        }

        // Pintar la tableta con bucles
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                // Determinar si se debe pintar un bocado
                if ((borde == 0 && i == 0 && j == posicionBocado) || // Bocado en el borde superior
                    (borde == 1 && i == altura - 1 && j == posicionBocado) || // Bocado en el borde inferior
                    (borde == 2 && j == 0 && i == posicionBocado) || // Bocado en el borde izquierdo
                    (borde == 3 && j == anchura - 1 && i == posicionBocado)) { // Bocado en el borde derecho
                    System.out.print(" "); // Bocado (vacío)
                } else {
                    System.out.print("*"); // Turrón
                }
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}
