package app.ejercicios.ejercicio1;

public class Empleado {

    private String nombre;
    private String dni;
    private String apellido;
    private double salario;

    public Empleado() {

    }

    public Empleado(String nombre, String dni, String apellido, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioAnual() {
        return salario * 12;
    }

}