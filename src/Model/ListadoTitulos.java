package Model;

import java.util.ArrayList;
import java.util.List;

public class ListadoTitulos {

    private List<String> titulos = new ArrayList<>();

    public ListadoTitulos() {
        titulos.add("Introducción a la Ciberseguridad");
        titulos.add("Fundamentos de Protección Digital");
        titulos.add("Guía de Privacidad para Jóvenes");
        titulos.add("Buenas Prácticas en Internet");
        titulos.add("Conceptos Básicos de Ciberseguridad");
    }

    public List<String> getTitulos() {
        return titulos;
    }
}
