package Model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMaterial {

    public List<Material> materiales = new ArrayList<>();

    public void agregar(Material material) {
        materiales.add(material);
        System.out.println("Material agregado.");
    }

    public boolean buscarPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Material m : materiales) {
            if (m.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                m.mostrarInfo();
                System.out.println("--------------------------------------");
                encontrado = true;
            }
        }
        return encontrado;
    }

    public boolean buscarPorAutor(String autor) {
        boolean encontrado = false;
        for (Material m : materiales) {
            if (m.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                m.mostrarInfo();
                System.out.println("--------------------------------------");
                encontrado = true;
            }
        }
        return encontrado;
    }

    public void filtrarPorCategoria(String categoria) {
        for (Material m : materiales) {
            if (m.getCategoria().equalsIgnoreCase(categoria)) {
                m.mostrarInfo();
                System.out.println("--------------------------------------");
            }
        }
    }

    public void filtrarPorTipo(String tipo) {
        for (Material m : materiales) {
            if (m.getTipo().equalsIgnoreCase(tipo)) {
                m.mostrarInfo();
                System.out.println("--------------------------------------");
            }
        }
    }

    public void listar() {
        for (Material m : materiales) {
            m.mostrarInfo();
            System.out.println("--------------------------------------");
        }
    }

    public boolean estaVacio() {
        return materiales.isEmpty();
    }

    public void guardarEnArchivo(String nombreArchivo) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nombreArchivo))) {
            for (Material m : materiales) {
                pw.println(m.toString());
            }
        } catch (Exception e) {
            System.out.println("Error al guardar archivo: " + e.getMessage());
        }
    }

    public void cargarDesdeArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] d = linea.split(";");

                Material m = new Material(d[0], d[1], d[2], d[3], d[4]);
                m.setFormatoArchivo(d[5]);
                m.setNumeroPaginas(Integer.parseInt(d[6]));
                m.setDuracion(d[7]);
                m.setLink(d[8]);
                m.setEditorial(d[9]);
                m.setAñoPublicacion(Integer.parseInt(d[10]));

                materiales.add(m);
            }
        } catch (Exception ignored) {}
    }
}
