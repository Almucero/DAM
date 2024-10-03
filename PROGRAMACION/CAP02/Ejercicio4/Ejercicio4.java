public class Ejercicio4 {
    public static void main(String[] args) {
        String Título = "HORARIO", Día1 = "LUNES", Día2 = "MARTES", Día3 = "MIÉRCOLES", Día4 = "JUEVES", Día5 = "VIERNES", Asignatura01 = "SINF", Asignatura02 = "PROG", Asignatura03 = "EDES", Asignatura04 = "DIG", Asignatura05 = "BADAT", Asignatura06 = "LMSGb", Asignatura07 = "SOS", Asignatura08 = "IPEI";
        System.out.printf("%27s%n", Título);
        System.out.printf("%-10s%-10s%-13s%-10s%-10s%n", Día1, Día2, Día3, Día4, Día5);
        System.out.printf("%-10s%-10s%-13s%-10s%-10s%n", Asignatura02, Asignatura08, Asignatura02, Asignatura06, Asignatura06);
        System.out.printf("%-10s%-10s%-13s%-10s%-10s%n", Asignatura02, Asignatura08, Asignatura02, Asignatura06, Asignatura05);
        System.out.printf("%-10s%-10s%-13s%-10s%-10s%n", Asignatura01, Asignatura08, Asignatura02, Asignatura05, Asignatura06);
        System.out.printf("%-10s%-10s%-13s%-10s%-10s%n", Asignatura01, Asignatura02, Asignatura04, Asignatura05, Asignatura01);
        System.out.printf("%-10s%-10s%-13s%-10s%-10s%n", Asignatura05, Asignatura02, Asignatura03, Asignatura07, Asignatura01);
        System.out.printf("%-10s%-10s%-13s%-10s%-10s%n", Asignatura05, Asignatura02, Asignatura03, Asignatura03, Asignatura01);
    }
}