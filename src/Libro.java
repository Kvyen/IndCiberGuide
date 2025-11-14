public class Libro extends Recurso {
    public Libro(String titulo, String autor, int añoPublicacion) {
        super(titulo, autor, añoPublicacion);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Libro");
        super.mostrarInfo();
    }
}
