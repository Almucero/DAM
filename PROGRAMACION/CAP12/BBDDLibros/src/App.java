import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/ejercicio_alter_table";
        String usuario = "almucero";
        String clave = "1206";

        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultado = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            String sql = "SELECT ISBN, NumeroCopias, NombreEditorial, TituloLibro FROM librosoriginal";
            String sql2 = "SELECT DNI, Nombre, PrimerApellido, SegundoApellido, Edad, Nacionalidad, Direccion, Genero FROM comprador";
            sentencia = conexion.createStatement();

            resultado = sentencia.executeQuery(sql);

            while(resultado.next()) {
                String ISBN = resultado.getString("ISBN");
                int NumeroCopias = resultado.getInt("NumeroCopias");
                String NombreEditorial = resultado.getString("NombreEditorial");
                String TituloLibro = resultado.getString("TituloLibro");
                String DNI = resultado.getString("DNI");
                String Nombre = resultado.getString("Nombre");
                String PrimerApellido = resultado.getString("PrimerApellido");
                String SegundoApellido = resultado.getString("SegundoApellido");
                Date Edad = 
                System.out.println("ISBN: "+ISBN+", NumeroCopias: "+NumeroCopias+", NombreEditorial: "+NombreEditorial+", TituloLibro: "+TituloLibro);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (conexion!=null) conexion.close();
                if (sentencia!=null) sentencia.close();
                if (resultado!=null) resultado.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
