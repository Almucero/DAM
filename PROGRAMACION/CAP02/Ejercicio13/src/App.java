import java.util.Scanner;
import Ejercicio1.VerAsignatura;

public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Por favor, introduzca un día de la semana y le diré qué asignatura toca a primera hora ese día: ");
                String dia = scanner.nextLine();

                VerAsignatura asignatura = new VerAsignatura(dia);

                asignatura.Horario();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
