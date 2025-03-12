import java.sql.*;
import alumnos.*;
import connection.ConnectionPool;
import grupos.*;
import java.util.*;

public class App {

    private static int menuPrincipal() {
        int opcion = 0;
        System.out.println("\n==============");
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("==============");
        System.out.println("1. Menú de grupos");
        System.out.println("e. Menú de alumnos");
        System.out.println("3. Salir");
        while (true) {
            try {
                System.out.print("Introduzca una opción: ");
                opcion = Integer.parseInt(System.console().readLine());
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Introduzca un número");
            }
        }
        return opcion;
    }
    private static int menuGrupo() {
        int opcion = 0;
        System.out.println("\n===========");
        System.out.println("MENÚ GRUPOS");
        System.out.println("===========");
        System.out.println("1. Crear un grupo de alumnos");
        System.out.println("2. Editar un grupo de alumnos");
        System.out.println("3. Borrar un grupo de alumnos");
        System.out.println("4. Visualizar grupos de alumnos");
        System.out.println("5. Visualiza un grupo");
        System.out.println("6. Importar al csv");
        System.out.println("7. Exportar al csv");
        System.out.println("8. Volver");
        while (true) {
            try {
                System.out.print("Introduzca una opción: ");
                opcion = Integer.parseInt(System.console().readLine());
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Introduzca un número");
            }
        }
        return opcion;
    }
    private static int menuAlumno() {
        int opcion = 0;
        System.out.println("\n============");
        System.out.println("MENÚ ALUMNOS");
        System.out.println("============");
        System.out.println("1. Crear un alumno");
        System.out.println("2. Editar un alumno");
        System.out.println("3. Borrar un alumno");
        System.out.println("4. Visualizar lista de alumnos");
        System.out.println("5. Visualiza alumno");
        System.out.println("6. Importar al csv");
        System.out.println("7. Exportar al csv");
        System.out.println("8. Volver");
        while (true) {
            try {
                System.out.print("Introduzca una opción: ");
                opcion = Integer.parseInt(System.console().readLine());
                break;
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Introduzca un número");
            }
        }
        return opcion;
    }
    
    //opciones menu grupo
    public static void crearGrupo(GruposService gservice) {
        System.out.print("Introduzca el nombre del grupo: ");
        String nombre = System.console().readLine();
        System.out.print("Introduzca el nombre del tutor: ");
        String profesor = System.console().readLine();
        try {
            Long id = gservice.create(new Grupo(0, nombre, profesor));    
            System.out.printf("Grupo creado correctamente (id: %d)\n", id);
        } 
        catch (SQLException e) {
            if(e.getErrorCode() == 1062){
                System.out.println("El grupo ya existe con ese nombre");
            }
        }
    }
    public static void editarGrupo(GruposService gservice) {
        try {
            gservice.requestAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.print("Elija el grupo a editar: ");
        Long id = Long.parseLong(System.console().readLine());
        System.out.println("Introduzca el nombre del grupo: ");
        String nombre = System.console().readLine();
        System.out.println("Introduzca el nombre del tutor: ");
        String profesor = System.console().readLine();
        try {
            int rowAffected = gservice.update(new Grupo(id, nombre, profesor));
            if(rowAffected == 1)
                System.out.println("Grupo actualizado correctamente");
            else
                System.out.println("No se ha podido actualizar el grupo");
        } 
        catch (SQLException e) {
            System.out.println("No se ha podido actualizar el grupo");
            System.out.println("Ocurrión una excepción: "+ e.getMessage());
        }
    }
    private static void borrargrupo(GruposService gservice) {
        try {
            gservice.requestAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.print("Elija el grupo a borrar: ");
        Long id = Long.parseLong(System.console().readLine());
        try {
            gservice.delete(id);
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void listarGrupos(GruposService service){
        try {
            ArrayList<Grupo> grupos = service.requestAll();
            if(grupos.size()==0){
                System.out.println("No hay grupos de alumnos");
            }
            else{
                for(Grupo g : grupos){
                    System.out.println(g);
                }
            }  
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void visualizarGrupo(GruposService gservice) {
        try {
            gservice.requestAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.print("Elija el grupo a visualizar: ");
        Long id = Long.parseLong(System.console().readLine());
        Grupo grupo;
        try {
            grupo = gservice.requestById(id);
            if(grupo!=null)
            System.out.println(grupo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static void importarCSVGrupo() {

    }
    private static void exportarCSVGrupo() {

    }

    //opciones menu alumno
    public static void crearAlumno(AlumnosService aservice) {

    }
    public static void editarAlumno(AlumnosService aservice) {

    }
    public static void borrarAlumno(AlumnosService aservice) {

    }
    public static void listarAlumnos(AlumnosService aservice) {

    }
    public static void visualizarAlumno(AlumnosService aservice) {

    }
    private static void importarCSVAlumno() {

    }
    private static void exportarCSVAlumno() {

    }

    public static void main(String[] args) throws Exception {
        // Configuración de la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/alumnos";
        String usuario = "almucero";
        String clave = "1206";

        ConnectionPool pool = new ConnectionPool(url, usuario, clave);
        GruposService gservice = new GruposService(pool.getConnection());
        AlumnosService aservice = new AlumnosService(pool.getConnection());

        boolean salir = false, salirGrupo = false, salirAlumno = false;
        while (!salir) {
            switch (menuPrincipal()) {
                case 1:
                    while(!salirGrupo){
                        switch (menuGrupo()) {
                            case 1:
                                crearGrupo(gservice);
                                break;
                            case 2:
                                editarGrupo(gservice);
                                break;
                            case 3:
                                borrargrupo(gservice);
                                break;
                            case 4:
                                listarGrupos(gservice);
                                break;
                            case 5:
                                visualizarGrupo(gservice);
                                break;
                            case 6:
                                importarCSVGrupo();
                                break;
                            case 7:
                                exportarCSVGrupo();
                                break;
                            case 8:
                                salirGrupo = true;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    while(!salirAlumno){
                        switch (menuAlumno()) {
                            case 1:
                                crearAlumno(aservice);
                                break;
                            case 2:
                                editarAlumno(aservice);
                                break;
                            case 3:
                                borrarAlumno(aservice);
                                break;
                            case 4:
                                listarAlumnos(aservice);
                                break;
                            case 5:
                                visualizarAlumno(aservice);
                                break;
                            case 6:
                                importarCSVAlumno();
                                break;
                            case 7:
                                exportarCSVAlumno();
                                break;
                            case 8:
                                salirAlumno = true;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    break;
            }
        }
    }
}