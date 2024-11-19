package Ejercicio11;

public class Ejercicio11 {
    public static void main(String[] args) {
        String nota="";
        int numSuspenso=0;
        int numSuficiente=0;
        int numBien=0;
        int numNotable=0;
        int numSobresaliente=0;
        for (int i=1; i<=20; i++) {
            int aleatorio = (int)(Math.random()*5)+1;
            switch (aleatorio) {
                case 1-> {
                    nota="suspenso";
                    numSuspenso++;
                }
                case 2-> {
                    nota="suficiente";
                    numSuficiente++;
                }
                case 3-> {
                    nota="bien";
                    numBien++;
                }
                case 4-> {
                    nota="notable";
                    numNotable++;
                }
                case 5-> {
                    nota="sobresaliente";
                    numSobresaliente++;
                }
            }
            System.out.printf("%s ", nota);
        }
        System.out.printf("%nNo de suspensos: %d%n", numSuspenso);
        System.out.printf("No de suficientes: %d%n", numSuficiente);
        System.out.printf("No de bienes: %d%n", numBien);
        System.out.printf("No de notables: %d%n", numNotable);
        System.out.printf("No de sobresalientes: %d%n", numSobresaliente);
    }
}