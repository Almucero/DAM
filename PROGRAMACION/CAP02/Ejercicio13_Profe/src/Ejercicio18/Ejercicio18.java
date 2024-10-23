package Ejercicio18;
public class Ejercicio18 {
    public static void primerDigito(){
        
        try {
            System.out.println("Por favor, introduzca un número entero positivo (de 5 cifras como máximo): ");
            int valor = Math.abs(Integer.parseInt(System.console().readLine()));
           
            if(valor > 99999)
                System.out.println("El número debe contener como máximo 5 cifras");
            else {
                int primera = 0;
                if(valor/10 > 0 && valor/10 < 10)
                    primera = valor/10;
                else if(valor/100 > 0 && valor/100 < 10)
                    primera = valor/100;
                else if(valor/1000 > 0 && valor/1000 < 10)
                    primera = valor/1000;
                else if(valor/10000 > 0 && valor/10000 < 10)
                    primera = valor/10000;
                else
                    primera = valor;
                System.out.printf("La primera cifra del número introducido es el %d", primera);
            }
        } catch (Exception e) {
            System.err.println("Ocurrió un error");
        }
        

    }   
}
