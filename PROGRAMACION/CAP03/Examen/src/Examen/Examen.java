package Examen;

public class Examen {
    public static long pedirNumero(String mensaje) {
        long num;
        while (true) {
            try {
                System.out.print(mensaje);
                num = Long.parseLong(System.console().readLine());
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Introduzca un valor válido: "+e+"\n");
            }
            catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: "+e+"\n");
            }
        }
        return num;
    }
    public static long longitudNumero(long num) {
        long longitud=0;
        while (num!=0) {
            longitud++;
            num = num/10;
        }
        return longitud;
    }
    public static long voltearNum(long num) {
        long numVolteado=0;
        while (num!=0) {
            long digito=num%10;
            numVolteado = numVolteado*10+digito;
            num = num/10;
        }
        return numVolteado;
    }
    public static long encontrarDigitoMasGrande(long num) {
        long digitoMasGrande=0;
        while (num!=0) {
            long digito = num%10;
            if (digito>=digitoMasGrande) {
                digitoMasGrande = digito;
            }
            num = num/10;
        }
        return digitoMasGrande;
    }
    public static void generarPalo(long anchura) {
        for (int i=1; i<=anchura+1; i++) {
            System.out.print("--- ");
        }
    }
    public static void hacerTabla(long MAXIMO, long MINIMO) {
        long numAleatorio = (long)(Math.random()*(MAXIMO-MINIMO+1))+MINIMO;
        long numAleatorioVolteado = voltearNum((numAleatorio*10+1));
        long anchura = encontrarDigitoMasGrande(numAleatorio);
        System.out.print(" "); 
        generarPalo(anchura); 
        System.out.println();
        while (longitudNumero(numAleatorioVolteado)!=1) {
            long digito=numAleatorioVolteado%10;
            System.out.printf("| %d |", digito);
            for (int i=1; i<=anchura; i++) {
                if (digito>=i) {
                    System.out.printf(" * |");
                }
                else {
                    System.out.printf("   |");
                }
            }
            System.out.println();
            System.out.print(" ");
            generarPalo(anchura);
            System.out.println();
            numAleatorioVolteado = numAleatorioVolteado/10;
        }
    }
    public static void generarPaloColor(long anchura) {
        for (int i=1; i<=anchura+1; i++) {
            System.out.print("\u2550\u2550\u2550 ");
        }
    }
    public static void hacerTablaColor(long MAXIMO, long MINIMO) {
        long numAleatorio = (long)(Math.random()*(MAXIMO-MINIMO+1))+MINIMO;
        long numAleatorioVolteado = voltearNum((numAleatorio*10+1));
        long anchura = encontrarDigitoMasGrande(numAleatorio);
        System.out.print("\u2554"); 
        generarPaloColor(anchura); 
        System.out.println();
        while (longitudNumero(numAleatorioVolteado)!=1) {
            long digito=numAleatorioVolteado%10;
            System.out.printf("\u2551 %d \u2551", digito);
            for (int i=1; i<=anchura; i++) {
                if (digito>=i) {
                    if (digito<=4) {
                        System.out.printf(" "+BLUE_BACKGROUND+" "+RESET+" \u2551");
                    }
                    if (digito==5 || digito==6) {
                        System.out.printf(" "+RED_BACKGROUND+" "+RESET+" \u2551");
                    }
                    if (digito==7 || digito==8) {
                        System.out.printf(" "+GREEN_BACKGROUND+" "+RESET+" \u2551");
                    }
                    if (digito==9) {
                        System.out.printf(" "+PURPLE_BACKGROUND+" "+RESET+" \u2551");
                    }
                }
                else {
                    System.out.printf("   \u2551");
                }
            }
            System.out.println();
            System.out.print(" ");
            generarPaloColor(anchura);
            System.out.println();
            numAleatorioVolteado = numAleatorioVolteado/10;
        }
    }
    public static final String RESET = "\033[0m" ;
    public static final String RED_BACKGROUND = "\033[41m"; 
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";
    public static void main(String[] args) {
        try {
            while (true) {
                System.out.printf("GRAPHIFY%n===================%n");
                final long MINIMO = pedirNumero("Introduce el valor mínimo del rango: ");
                final long MAXIMO = pedirNumero("Introduce el valor máximo del rango: ");
                if (MAXIMO<0 || MINIMO<0) {
                    System.out.println("ERROR: Los valores del rango deben ser mayores o iguales a 0");
                    break;
                }
                else if (MINIMO>MAXIMO) {
                    System.out.println("ERROR: El valor mínimo no puede ser más grande que el valor máximo");
                    break;
                }
                System.out.print("Dibujo la gráfica en blanco y negro o en color (B|C): ");
                String eleccion = System.console().readLine();
                boolean blanco_negro=false;
                switch (eleccion.toLowerCase()) {
                    case "b"-> blanco_negro=true;
                    case "c"-> blanco_negro=false;
                    default-> blanco_negro=true;
                }
                if (blanco_negro) {
                    hacerTabla(MAXIMO, MINIMO);
                }
                else {
                    hacerTablaColor(MAXIMO, MINIMO);
                }
                break;
            }
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: "+e);
        }
    }
}