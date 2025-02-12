package EjerciciosClase.Ejercicio2;

import java.io.File;

public class CodiceEncantado implements ICodiceEncantado {

    @Override
    public void crearCodice() {
        File fichero = new File("codice.txt");
        if (!fichero.exists()) {
            try {
                
            }
            catch (Exception e) {

            }
        }
    }

    @Override
    public void escribirRelato(String relato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'escribirRelato'");
    }

    @Override
    public String leerCodice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'leerCodice'");
    }

    @Override
    public void borrarCodice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrarCodice'");
    }
    
}
