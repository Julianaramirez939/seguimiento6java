package Ejercicio6;

public interface Icarrito {
   public void agregarLibro(Libro libro);
    public void agregarPelicula(Pelicula pelicula);
   public void registrarVenta(Libro libro);
   public void registrarVenta(Pelicula pelicula);
  public void mostrarLibrosDisponibles();
    public void mostrarPeliculasDisponibles();
    public void mostrarTotalVentas();



}
