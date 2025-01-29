import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanEstudios {
    private String titulo;
    private Date fechaAprobacion;
    private int numeroCreditos;
    private List<Asignatura> asignaturaList;
    private Asignatura[] asignatura;

    public PlanEstudios() {
        asignaturaList = new ArrayList<>();
        asignaturaList.add(new Asignatura());
        asignaturaList.add(new Asignatura());
        asignatura = new Asignatura[] {new Asignatura(), new Asignatura()};
    }
}