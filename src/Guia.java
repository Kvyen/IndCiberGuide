public class Guia extends Recurso {
    private String Tema;

    public Guia(String titulo, String autor, int añoPublicacion, String Tema) {
        super(titulo, autor, añoPublicacion);
        this.Tema = Tema;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Guía");
        super.mostrarInfo();
        System.out.println("Tema: " + Tema);
    }
}
