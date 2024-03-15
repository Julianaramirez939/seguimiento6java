package Ejercicio1;
import java.util.Scanner;

public interface IEmpleado {
   public void agregarEmpleado(Empleado empleado);
    public void visualizarInformacion();
    public void modificarSalario(int indice, double nuevoSalario);
    public void calcularEdad(int indice);
   public void calcularAntiguedad(int indice);
    public void calcularPrestaciones(int indice);
    public void ejecutarModificarSalario(Scanner scanner);
   public void ejecutarCalcularEdad(Scanner scanner);
    public void ejecutarCalcularAntiguedad(Scanner scanner);
    public void ejecutarCalcularPrestaciones(Scanner scanner);
}
