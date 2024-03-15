package Ejericicio2;
import java.util.ArrayList;

public class Cuentas extends CuentasAbs{
    private double saldoCuentaCorriente;
    private double saldoCuentaAhorros;
    private double saldoCDT;
    private ArrayList<Cliente> clients;

    public Cuentas() {
        this.saldoCuentaCorriente = 0;
        this.saldoCuentaAhorros = 0;
        this.saldoCDT = 0;
        this.clients = new ArrayList<>();
    }

    public double getSaldoCuentaCorriente() {
        return saldoCuentaCorriente;
    }

    public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
        this.saldoCuentaCorriente = saldoCuentaCorriente;
    }

    public double getSaldoCuentaAhorros() {
        return saldoCuentaAhorros;
    }

    public void setSaldoCuentaAhorros(double saldoCuentaAhorros) {
        this.saldoCuentaAhorros = saldoCuentaAhorros;
    }

    public double getSaldoCDT() {
        return saldoCDT;
    }

    public void setSaldoCDT(double saldoCDT) {
        this.saldoCDT = saldoCDT;
    }

    public double getSaldoTotal() {
        return saldoCuentaCorriente + saldoCuentaAhorros + saldoCDT;
    }

    public void invertirEnCDT(double montoInversion) {
        saldoCDT += montoInversion;
        System.out.println("Inversión en CDT exitosa.");
    }

    public void cerrarInversionCDT() {
        if (saldoCDT > 0) {
            saldoCuentaCorriente += saldoCDT;
            saldoCDT = 0;
            System.out.println("Inversión en CDT cerrada. Fondos transferidos a Cuenta Corriente.");
        } else {
            System.out.println("No hay inversión en CDT para cerrar.");
        }
    }

    public void consignarEnCuentaCorriente(double monto) {
        saldoCuentaCorriente += monto;
        System.out.println("Consignación exitosa en Cuenta Corriente.");
    }

    public void retirarDeCuentaCorriente(double monto) {
        if (monto <= saldoCuentaCorriente) {
            saldoCuentaCorriente -= monto;
            System.out.println("Retiro exitoso de Cuenta Corriente.");
        } else {
            System.out.println("Saldo insuficiente en Cuenta Corriente.");
        }
    }

    public void consignarEnCuentaAhorros(double monto) {
        saldoCuentaAhorros += monto;
        System.out.println("Consignación exitosa en Cuenta de Ahorros.");
    }

    public void retirarDeCuentaAhorros(double monto) {
        if (monto <= saldoCuentaAhorros) {
            saldoCuentaAhorros -= monto;
            System.out.println("Retiro exitoso de Cuenta de Ahorros.");
        } else {
            System.out.println("Saldo insuficiente en Cuenta de Ahorros.");
        }
    }

    public ArrayList<Cliente> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Cliente> clients) {
        this.clients = clients;
    }

    public void addClient(Cliente client) {
        clients.add(client);
    }

    public void removeClient(Cliente client) {
        clients.remove(client);
    }


}

