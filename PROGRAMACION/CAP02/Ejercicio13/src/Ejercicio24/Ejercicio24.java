package Ejercicio24;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ejercicio24 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
        try {
            int Cargo = Integer.parseInt(scanner.nextLine());
            if (Cargo<=0 || Cargo>=4) {
                System.out.println("Por favor, seleccione un cargo válido");
            }
            else {
                System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
                int Viajes = Integer.parseInt(scanner.nextLine());
                if (Viajes>=23) {
                    System.out.println("No puede haber viajado tanto");
                }
                else if (Viajes<=-1) {
                    System.out.println("Por favor, ingrese un valor válido");
                }
                else {
                    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
                    int Estado = Integer.parseInt(scanner.nextLine());
                    if (Estado>=3 || Estado<=0) {
                        System.out.println("Por favor, introduzca un valor válido");
                    }
                    else {
                        int SueldoBase = 0;
                        double Porciento = 0;
                        if (Cargo==1) {
                            SueldoBase = 950;
                        }
                        else if (Cargo==2) {
                            SueldoBase = 1200;
                        }
                        else if (Cargo==3) {
                            SueldoBase = 1600;
                        }
                        if (Estado==1) {
                            Porciento = 25.0 /100;
                        }
                        else if (Estado==2) {
                            Porciento = 20.0 /100;
                        }
                        int SueldoViaje = Viajes*30;
                        double IRPF = SueldoBase*Porciento;
                        double SueldoBruto = (SueldoBase+SueldoViaje);
                        double SueldoNeto = (SueldoBruto-IRPF);
                        System.out.println("----------------------------------");
                        System.out.println("| Sueldo base "+df.format(SueldoBase)+"            |");
                        System.out.println("| Dietas ("+Viajes+" viajes) "+df.format(SueldoViaje)+"       |");
                        System.out.println("|--------------------------------|");
                        System.out.println("| Sueldo bruto "+df.format(SueldoBruto)+"           |");
                        System.out.println("| Retención IRPF ("+Porciento*100+"%) "+df.format(IRPF)+"  |");
                        System.out.println("|--------------------------------|");
                        System.out.println("| Sueldo neto "+df.format(SueldoNeto)+"            |");
                        System.out.println("----------------------------------");
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("Ocurrió un error inesperado");
        }
        scanner.close();
    }
}