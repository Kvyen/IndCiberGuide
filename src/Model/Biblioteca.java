package Model;

import java.util.ArrayList;
import java.util.List;
import Exception.RecursoNoEncontradoException;

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
        throw new RecursoNoEncontradoException("Model.Recurso no encontrado: " + titulo);
    }
}
