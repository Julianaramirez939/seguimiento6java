package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class LibrosDAO extends LibrosAbs{
    private List<Libro> libros;

    public LibrosDAO() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void removerLibro(String titulo) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libros.remove(libro);
                encontrado = true;
                System.out.println("libro eliminado: " + titulo);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Libro no encontrado.");
        }
    }

    public void mostrarLibros() {
        if (libros.size() > 0) {
            System.out.println("Lista de libros:");
            for (Libro libro : libros) {
                System.out.println(libro.getInfo());
            }
        } else {
            System.out.println("No hay libros en la lista.");
        }
    }
}
