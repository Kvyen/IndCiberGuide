import Model.Material;
import Model.RepositorioMaterial;
import Model.ListadoTitulos;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        RepositorioMaterial repo = new RepositorioMaterial();
        repo.cargarDesdeArchivo("materiales.txt");

        ListadoTitulos listado = new ListadoTitulos();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nBienvenidx a IndCiberSec");
            System.out.println("1. Ingresar guía");
            System.out.println("2. Ingresar video");
            System.out.println("3. Ingresar libro");
            System.out.println("4. Buscar por título");
            System.out.println("5. Buscar por autor");
            System.out.println("6. Filtrar por categoría");
            System.out.println("7. Filtrar por tipo");
            System.out.println("8. Listar todo el material");
            System.out.println("9. Salir");
            System.out.print("> Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1 -> {
                    System.out.println("\nIngresar Guía");
                    System.out.print("Título: ");
                    String t = sc.nextLine();
                    System.out.print("Autor: ");
                    String a = sc.nextLine();
                    System.out.print("Categoría: ");
                    String c = sc.nextLine();
                    System.out.print("Descripción: ");
                    String d = sc.nextLine();

                    Material guia = new Material(t, a, c, d, "GUIDE");

                    System.out.print("Formato (PDF/DOCX): ");
                    guia.setFormatoArchivo(sc.nextLine());

                    System.out.print("Número de páginas: ");
                    guia.setNumeroPaginas(sc.nextInt());
                    sc.nextLine();

                    repo.agregar(guia);
                }

                case 2 -> {
                    System.out.println("\nIngresar Video");
                    System.out.print("Título: ");
                    String t = sc.nextLine();
                    System.out.print("Autor: ");
                    String a = sc.nextLine();
                    System.out.print("Categoría: ");
                    String c = sc.nextLine();
                    System.out.print("Descripción: ");
                    String d = sc.nextLine();

                    Material video = new Material(t, a, c, d, "VIDEO");

                    System.out.print("Duración (mm:ss): ");
                    video.setDuracion(sc.nextLine());

                    System.out.print("Link: ");
                    video.setLink(sc.nextLine());

                    repo.agregar(video);
                }

                case 3 -> {
                    System.out.println("\nIngresar Libro");
                    System.out.println("Título: ");
                    String t = sc.nextLine();
                    System.out.print("Autor: ");
                    String a = sc.nextLine();
                    System.out.print("Categoría: ");
                    String c = sc.nextLine();
                    System.out.print("Descripción: ");
                    String d = sc.nextLine();

                    Material libro = new Material(t, a, c, d, "BOOK");

                    System.out.print("Editorial: ");
                    libro.setEditorial(sc.nextLine());

                    System.out.print("Año de publicación: ");
                    libro.setAñoPublicacion(sc.nextInt());
                    sc.nextLine();


                    repo.agregar(libro);
                }

                case 4 -> {
                    System.out.print("\nBuscar por título: ");
                    String titulo = sc.nextLine();

                    boolean encontradoRepo = repo.buscarPorTitulo(titulo);
                    boolean encontradoListado = false;

                    for (String t : listado.getTitulos()) {
                        if (t.toLowerCase().contains(titulo.toLowerCase())) {
                            if (!encontradoListado) {
                                System.out.println("\nCoincidencias en lista de títulos:");
                            }
                            System.out.println("- " + t);
                            encontradoListado = true;
                        }
                    }

                    if (!encontradoRepo && !encontradoListado) {
                        System.out.println("No se encontraron coincidencias.");
                    }
                }

                case 5 -> {
                    System.out.print("\nBuscar por autor: ");
                    String autor = sc.nextLine();
                    boolean encontrado = repo.buscarPorAutor(autor);

                    if (!encontrado) {
                        System.out.println("No se encontraron coincidencias.");
                    }
                }

                case 6 -> {
                    System.out.print("\nFiltrar por categoría: ");
                    String categoria = sc.nextLine();
                    repo.filtrarPorCategoria(categoria);
                }

                case 7 -> {
                    System.out.print("\nFiltrar por tipo (GUIDE / VIDEO / BOOK): ");
                    String tipo = sc.nextLine();
                    repo.filtrarPorTipo(tipo);
                }

                case 8 -> {
                    System.out.println("Títulos Disponibles");
                    for (String t : listado.getTitulos()) {
                        System.out.println("- " + t);
                    }

                    System.out.println("\nMaterial Añadido");

                    if (repo.estaVacio()) {
                        System.out.println("No hay materiales añadidos.");
                    } else {
                        repo.listar();
                    }
                }


                case 9 -> {
                    System.out.println("Guardando datos...");
                    repo.guardarEnArchivo("materiales.txt");
                    System.out.println("Saliendo...");
                }

                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 9);

        sc.close();
    }
}
