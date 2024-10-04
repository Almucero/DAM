public class Main {
    public static void main(String[] args) {
        //Definir altura como entero
        int altura1 = 10;
        long altura2 = 100;
        short altura3 = 100;
        byte mibyte = 10;
        boolean salir = false; //true
        char x = 'c'+5;
        System.out.println(x);
        double peso = 200.50;
        float peso2 = 200.50f;
        String nombre = "Este";
        int v1, v2;
        double v3;
        v1 = 10;
        v2 = 3;
        v3 = v1 % v2;
        System.out.println(v3);
        v3 = (double)v1 / (double)v2;
        System.out.println(v3);
        boolean a, b, c, d, e;
        a=true;
        b=false;
        d=false;
        d= a && !b; // ! (no lógico) && (y lógico) || (o lógico) 
        d = a == b; // operador igualdad
        d = a != b; // operador distinto
        System.out.println(d);
        double d1, d2, d3;
        d1 = 27;
        d2 = Math.sqrt(d1); //raiz
        System.out.println(d2);
        d3 = Math.pow(d1, (double)1/2); //potencia
        System.out.println(d3);
        String ñ, l;
        ñ = "Juan";
        l = "Garcia";
        System.out.println(ñ + " " + l);
        short u = -32768; // = short máximo/mínimo
        short i = 32767;
        short o = (short)(u - 2); //Como supera el límite inferior da la vuelta
        System.out.println(o);
        
        //tabla de multiplicar de un número:
        
        int num= 2; //número a multiplicar
        for(int cont = 1;cont<=10;cont++){ //bucle con contador hasta 10
            System.out.println(num + " x " + cont + " = " + num*cont);
        }

        //Hacer pirámide
        
        int altura = 15;
        for(int fila = 1; fila <= altura; fila++){
            for(int espacios = 1; espacios <= altura - fila; espacios++){
            System.out.print(" ");}
            for
        }



    }
}