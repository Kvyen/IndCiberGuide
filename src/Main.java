public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarRecurso(new Libro("Cien años de soledad", "García Márquez", 1967));
        biblioteca.agregarRecurso(new Guia("Derivadas nivel 1", "Kvyen", 2024, "Matemática"));
        biblioteca.agregarRecurso(new Video("Clase de Java Polimorfismo", "Kvyen", 2024, 45, "YouTube"));

        try {
            Recurso r1 = biblioteca.buscarRecurso("Derivadas nivel 1");
            r1.mostrarInfo();

            System.out.println();

            Recurso r2 = biblioteca.buscarRecurso("Clase de Java Polimorfismo");
            r2.mostrarInfo();

        } catch (RecursoNoEncontradoException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
