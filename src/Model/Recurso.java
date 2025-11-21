package Model;

public class Recurso {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Recurso(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Autor: " + autor + " | Año: " + añoPublicacion);
    }
}
