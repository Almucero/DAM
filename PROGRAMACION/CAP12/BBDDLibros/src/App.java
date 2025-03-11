import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/ejercicio_alter_table";
        String usuario = "almucero";
        String clave = "1206";

        Connection conexion = null;
        Statement sentencia = null;
        Statement sentencia2 = null;
        ResultSet resultado = null;
        ResultSet resultado2 = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            String sql = "SELECT ISBN, NumeroCopias, NombreEditorial, TituloLibro FROM librosoriginal";
            String sql2 = "SELECT DNI, Nombre, PrimerApellido, SegundoApellido, Edad, Nacionalidad, Direccion, Genero FROM comprador";
            /*String sql3 = "SELECT DNI, ISBN, PuntoVenta, Unidades FROM compra";*/
            sentencia = conexion.createStatement();
            sentencia2 = conexion.createStatement();

            resultado = sentencia.executeQuery(sql);
            resultado2 = sentencia2.executeQuery(sql2);

            while(resultado.next()) {
                String ISBN = resultado.getString("ISBN");
                int NumeroCopias = resultado.getInt("NumeroCopias");
                String NombreEditorial = resultado.getString("NombreEditorial");
                String TituloLibro = resultado.getString("TituloLibro");
                String DNI = resultado2.getString("DNI");
                String Nombre = resultado2.getString("Nombre");
                String PrimerApellido = resultado2.getString("PrimerApellido");
                String SegundoApellido = resultado2.getString("SegundoApellido");
                Date Edad = resultado2.getDate("Edad");
                String Nacionalidad = resultado2.getString("Nacionalidad");
                String Genero = resultado2.getString("Genero");
                System.out.println("ISBN: "+ISBN+", NumeroCopias: "+NumeroCopias+", NombreEditorial: "+NombreEditorial+", TituloLibro: "+TituloLibro);
                System.out.println("DNI: "+DNI+", Nombre:"+Nombre+", PrimerApellido: "+PrimerApellido+", SegundoApellido: "+SegundoApellido+", Edad: "+Edad+", Nacionalidad: "+Nacionalidad+", Genero: "+Genero);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (conexion!=null) conexion.close();
                if (sentencia!=null) sentencia.close();
                if (sentencia2!=null) sentencia2.close();
                if (resultado!=null) resultado.close();
                if (resultado2!=null) resultado2.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
