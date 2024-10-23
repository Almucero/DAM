package Ejercicio24;
import java.util.Scanner;

public class Ejercicio24 {
    public static Scanner sc = new Scanner(System.in);

    public static int solicitaTipoTrabajador(){
        System.out.println("1. Programador junior");
        System.out.println("2. Programador senior");
        System.out.println("3. Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int solicitaDiasVisitas(){
        System.out.println("¿Cuántos días ha estado de viaje visitando clientes? ");
        return Integer.parseInt(sc.nextLine());
    }

    public static int solicitaEstadoCivil(){
        System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        return Integer.parseInt(sc.nextLine());
    }

    public static double obtenerSueldoBase(int tipoTrabajador) throws Exception{
        if(tipoTrabajador>=1 && tipoTrabajador <= 3){
            return switch(tipoTrabajador){
                case 1->950.0;
                case 2->1200.0;
                case 3->1600.0;
                default->0.0;
            };
        }
        throw new Exception("Trabajador no válido");
    }

    public static double obtenerPorcentajeIRPF(int estadoCivil) throws Exception{
        if(estadoCivil>=1 && estadoCivil <= 2){
            return switch(estadoCivil){
                case 1->0.25;
                case 2->0.2;
                default->0.0;
            };
        }
        throw new Exception("Estado civil no válido");
    }

    public static void mostrarSeparador(String separador, int longitud){
        for(int i = 0; i < longitud; i++)
            System.out.print(separador);
        System.out.println();
    }

    public static void mostrarNomina(double sueldoBase, 
                                     int diasVisita, 
                                     double porcentajeIRPF,
                                     double precioDia){
        String sueldoBasePantalla = String.format("Sueldo base %.2f",sueldoBase);
        double precioVisitas = diasVisita*precioDia;
        double sueldoBruto =  precioVisitas + sueldoBase;
        String dietasPantalla = String.format("Dietas ( %d viajes ) %.2f", 
                                              diasVisita, precioVisitas);
        String sueldoBrutoPantalla = String.format("Sueldo bruto %.2f", sueldoBruto);
        double retencion = porcentajeIRPF*sueldoBruto;
        String retencionPantalla = String.format("Retención IRPF ( %d%% ) %.2f", 
                                             (int)(porcentajeIRPF*100), retencion);
        String sueldoNetoPantalla = String.format("Sueldo neto %.2f",sueldoBruto - retencion);
        int maximaLongitud = Math.max(sueldoBasePantalla.length(),
                                      Math.max(dietasPantalla.length(),
                                      Math.max(sueldoBrutoPantalla.length(),
                                      Math.max(retencionPantalla.length(),
                                                sueldoNetoPantalla.length()))));
        
        
        mostrarSeparador("-", maximaLongitud+4);                                                                                
        String linea = String.format("| %%-%ds |\n", maximaLongitud);                                                
        System.out.printf(linea, sueldoBasePantalla);
        System.out.printf(linea, dietasPantalla);
        mostrarSeparador("-", maximaLongitud+4);
        System.out.printf(linea, sueldoBrutoPantalla);
        System.out.printf(linea, retencionPantalla);
        mostrarSeparador("-", maximaLongitud+4);
        System.out.printf(linea, sueldoNetoPantalla);
        mostrarSeparador("-", maximaLongitud+4);
    }
    
    public static void nominaDesglosada(){
        try {
            int tipoTrabajador = solicitaTipoTrabajador();
            int diasVisita = solicitaDiasVisitas();
            int estadoCivil = solicitaEstadoCivil();
            double porcentajeIRPF = obtenerPorcentajeIRPF(estadoCivil);
            double sueldoBase = obtenerSueldoBase(tipoTrabajador);
            mostrarNomina(sueldoBase, diasVisita, porcentajeIRPF, 30.0);
        } catch (Exception e) {
            System.err.println("Ocurrió un error");
        }
    }
    
}
