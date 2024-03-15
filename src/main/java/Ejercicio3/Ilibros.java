package Ejercicio3;

public interface Ilibros {


    public interface LibrosDAOInterface {
        public void agregarLibro(Libro libro);
        public void removerLibro(String titulo);
        public void mostrarLibros();
    }

}
