package Ejercicio4;

public interface ICarro {
    void agregarCarro(Carro carro);
    void eliminarCarro(int cantidad);
    String getInfo();
    boolean venderCarro(int cantidad);
    void mostrarCarros();
}
