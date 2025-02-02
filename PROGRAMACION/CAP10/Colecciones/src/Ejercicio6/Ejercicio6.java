package Ejercicio6;

import java.util.HashMap;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<String, String>();
        usuarios.put("Abascal", "1234567890");
        usuarios.put("Hitler", "0987654321");
        for (int i=1; i<=3; i++) {
            System.out.println("\nLogin");
            System.out.print("Usuario: ");
            String usuario = System.console().readLine();
            System.out.print("Contraseña: ");
            String contrasena = System.console().readLine();
            if (usuarios.get(usuario)!=null && usuarios.get(usuario).equals(contrasena)) {
                System.out.println("Accediste al área 51");
                break;
            }
            else {
                if (i==3) {
                    System.out.println("Definitivamente eres inútil");
                    break;
                }
                System.out.println("Ni para esto vales");
            }
        }
    }
}