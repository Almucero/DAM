import java.io.IOException;
import java.util.InputMismatchException;
import javax.crypto.ExemptionMechanismException;
import Excepciones.CrearExcepcion;

public class App {
    public static void main(String [] args) throws Exception{
        try { 
            CrearExcepcion.ExcepcionAleatoria(); 
        } 
        catch (NumberFormatException e) {
            System.out.println("Tuvo lugar una NumberFormatException");
        } 
        catch (ExceptionInInitializerError e) {
            System.out.println("Tuvo lugar una ExceptionInInitializerError");
        } 
        catch (ExemptionMechanismException e) {
            System.out.println("Tuvo lugar una ExemptionMechanismException");
        } 
        catch (InputMismatchException e) {
            System.out.println("Tuvo lugar una InputMismatchException");
        } 
        catch (IOException e) {
            System.out.println("Tuvo lugar una IOException");
        }
    }
}