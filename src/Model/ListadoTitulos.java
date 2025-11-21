package Model;

import java.util.ArrayList;
import java.util.List;

public class ListadoTitulos {

    private List<String> titulos = new ArrayList<>();

    public ListadoTitulos() {
        titulos.add("Introducción a la Ciberseguridad (https://teletrabajo.anuies.mx/wp-content/uploads/2020/05/Introduccion_ala_ciberseguridad_v2.pdf?utm_source=)");
        titulos.add("Fundamentos de Protección Digital (https://cens.cl/wp-content/uploads/2024/08/Guia-Privacidad-Datos-CENS.pdf?utm_source=)");
        titulos.add("Guía de Privacidad para Jóvenes (https://www.aepd.es/guias/guia-privacidad-y-seguridad-en-internet.pdf)");
        titulos.add("Buenas Prácticas en Internet (https://www.derechosdigitales.org/wp-content/uploads/Gu%C3%ADa-de-Buenas-Pr%C3%A1cticas-Final.pdf?utm_source=)");
        titulos.add("Conceptos Básicos de Ciberseguridad (https://www.ftc.gov/system/files/attachments/conceptos-basicos-de-ciberseguridad/cybersecurity_sb_cyber-basics-es.pdf?utm_source=)");
    }

    public List<String> getTitulos() {
        return titulos;
    }
}
