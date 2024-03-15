package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibrosDAO librosDAO = new LibrosDAO();

        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar un libro: ");
            System.out.println("2. Remover el libro: ");
            System.out.println("3. Mostrar libros: ");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el número de páginas del libro: ");
                    int paginas = scanner.nextInt();
                    Libro nuevoLibro = new Libro(titulo, autor, paginas);
                    librosDAO.agregarLibro(nuevoLibro);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Ingrese el título del libro a remover:");
                    String tituloRemover = scanner.nextLine();
                    librosDAO.removerLibro(tituloRemover);
                    break;
                case 3:
                    librosDAO.mostrarLibros();
                    break;
                case 0:
                    System.out.println("____________________");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 0);
    }
}
