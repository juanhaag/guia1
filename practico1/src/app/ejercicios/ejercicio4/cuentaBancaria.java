package app.ejercicios.ejercicio4;

public class cuentaBancaria {
    private int id;
    private String nombre;
    private double balance;

    public cuentaBancaria() {

    }

    public cuentaBancaria(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(double deposito) {
        double balanceActual = this.balance + deposito;
        setBalance(balanceActual);
        return balanceActual;
    }

    public double debito(double sustraccion) {
        if (this.balance > sustraccion) {
            double balanceActual = this.balance - sustraccion;
            setBalance(balanceActual);
            return balanceActual;
        } else {
            System.out.println("Fondos insuficientes");
        }
        return this.balance;
    }

    public void verCuenta() {
        System.out.println(this.id + " " + this.nombre + " $" + this.balance);
    }
}