package Model;

public class Material {
    private String titulo;
    private String autor;
    private String categoria;
    private String descripcion;
    private String tipo;

    private String formatoArchivo;
    private int numeroPaginas;

    private String duracion;
    private String link;

    private String editorial;
    private int añoPublicacion;

    public Material(String titulo, String autor, String categoria, String descripcion, String tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public void setFormatoArchivo(String formatoArchivo) { this.formatoArchivo = formatoArchivo; }
    public void setNumeroPaginas(int numeroPaginas) { this.numeroPaginas = numeroPaginas; }

    public void setDuracion(String duracion) { this.duracion = duracion; }
    public void setLink(String link) { this.link = link; }

    public void setEditorial(String editorial) { this.editorial = editorial; }
    public void setAñoPublicacion(int añoPublicacion) { this.añoPublicacion = añoPublicacion; }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getCategoria() { return categoria; }
    public String getTipo() { return tipo; }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoría: " + categoria);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Tipo: " + tipo);

        switch (tipo) {
            case "GUIA" -> {
                System.out.println("Formato: " + formatoArchivo);
                System.out.println("Páginas: " + numeroPaginas);
            }
            case "VIDEO" -> {
                System.out.println("Duración: " + duracion);
                System.out.println("Link: " + link);
            }
            case "LIBRO" -> {
                System.out.println("Editorial: " + editorial);
                System.out.println("Año publicación: " + añoPublicacion);

            }
        }
    }

    @Override
    public String toString() {
        return titulo + ";" + autor + ";" + categoria + ";" + descripcion + ";" + tipo + ";" +
                formatoArchivo + ";" + numeroPaginas + ";" + duracion + ";" + link + ";" +
                editorial + ";" + añoPublicacion + ";" ;
    }
}
