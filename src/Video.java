public class Video extends Recurso {
    private int duracionMin; // duración en minutos
    private String plataforma; // YouTube, Vimeo, MP4 local, etc.

    public Video(String titulo, String autor, int añoPublicacion, int duracionMin, String plataforma) {
        super(titulo, autor, añoPublicacion);
        this.duracionMin = duracionMin;
        this.plataforma = plataforma;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Video");
        super.mostrarInfo();
        System.out.println("Duración: " + duracionMin + " min");
        System.out.println("Plataforma: " + plataforma);
    }
}
