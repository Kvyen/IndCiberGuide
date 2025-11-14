import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Recurso> recursos = new ArrayList<>();

    public void agregarRecurso(Recurso recurso) {
        recursos.add(recurso);
    }

    public Recurso buscarRecurso(String titulo) throws RecursoNoEncontradoException {
        for (Recurso recurso : recursos) {
            if (recurso.getTitulo().equalsIgnoreCase(titulo)) {
                return recurso;
            }
        }
        throw new RecursoNoEncontradoException("Recurso no encontrado: " + titulo);
    }
}
