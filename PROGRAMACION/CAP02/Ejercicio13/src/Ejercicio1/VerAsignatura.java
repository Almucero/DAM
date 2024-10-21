package Ejercicio1;

public class VerAsignatura {
    private String dia;

    public VerAsignatura(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void Horario() throws Exception {
        switch (dia) {
            case "Lunes":
                System.out.println("Lunes");
                System.out.println("Programación");
                break;
            case "Martes":
                System.out.println("Martes");
                System.out.println("IPEI");
                break;
            case "Miercoles":
                System.out.println("Miércoles");
                System.out.println("Programación");
                break;
            case "Jueves":
                System.out.println("Jueves");
                System.out.println("Lenguajes de marcas");
                break;
            case "Viernes":
                System.out.println("Viernes");
                System.out.println("Lenguajes de marcas");
                break;
            default:
                throw new Exception("Introduzca un valor válido");
        }
    }
}