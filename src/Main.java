public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarRecurso(new Libro("Cien años de soledad", "García Márquez", 1967));
        biblioteca.agregarRecurso(new Guia("guia sobre ciberseguridad", "WKI", 2025, "Seguridad Online"));
        biblioteca.agregarRecurso(new Video("Tutorial VPN", "Kvyen", 2025, 5, "Youtube"));

        try {
            Recurso r1 = biblioteca.buscarRecurso("guia sobre ciberseguridad");
            r1.mostrarInfo();

            System.out.println();

            Recurso r2 = biblioteca.buscarRecurso("Tutorial VPN");
            r2.mostrarInfo();

        } catch (RecursoNoEncontradoException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
