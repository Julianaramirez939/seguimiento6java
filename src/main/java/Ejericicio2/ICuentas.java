package Ejericicio2;
import java.util.ArrayList;

public interface ICuentas {
    double getSaldoCuentaCorriente();
    void setSaldoCuentaCorriente(double saldoCuentaCorriente);

    double getSaldoCuentaAhorros();
    void setSaldoCuentaAhorros(double saldoCuentaAhorros);

    double getSaldoCDT();
    void setSaldoCDT(double saldoCDT);

    double getSaldoTotal();

    void invertirEnCDT(double montoInversion);
    void cerrarInversionCDT();

    void consignarEnCuentaCorriente(double monto);
    void retirarDeCuentaCorriente(double monto);

    void consignarEnCuentaAhorros(double monto);
    void retirarDeCuentaAhorros(double monto);

    ArrayList<Cliente> getClients();
    void setClients(ArrayList<Cliente> clients);

    void addClient(Cliente client);
    void removeClient(Cliente client);
}
