package app;

import app.ejercicios.ejercicio1.Rectangulo;
import app.ejercicios.ejercicio3.ItemVenta;
import app.ejercicios.ejercicio4.cuentaBancaria;
import app.ejercicios.ejercicio1.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * System.out.println("///-ejercicio 1 \n");
         * 
         * Rectangulo rectangulo = new Rectangulo(20,10);
         * System.out.println("La altura es: " + rectangulo.getAlto());
         * System.out.println("El ancho es: " + rectangulo.getAncho());
         * 
         * System.out.println("El perimetro es:" + rectangulo.perimetro() +"  " +
         * "El area es: " + rectangulo.area());
         */

        /* Ejercicio 2 */
        /*
         * System.out.println("Ejercicio 2 \n");
         * 
         * Empleado empleado1 = new Empleado("Carlos ", "23456345 ", "Gutierrez ",
         * 25000);
         * 
         * System.out.println(empleado1.getNombre() + empleado1.getApellido() +
         * empleado1.getDni() + empleado1.getSalario());
         * empleado1.setSalario(empleado1.getSalario()+(empleado1.getSalario()*15)/100);
         * System.out.println(empleado1.getSalario());
         * System.out.println("El salario anual es de: " + empleado1.salarioAnual());
         */
        /*
         * System.out.println("Ejercicio 3");
         * 
         * ItemVenta producto1 = new ItemVenta(167,"Lapiz",3,20);
         * producto1.precioTotal(); producto1.productoYcantidad();
         */

        System.out.println("Ejercicio 4");

        cuentaBancaria nuevaCuenta1 = new cuentaBancaria(1, "Jose", 15000);

        nuevaCuenta1.credito(2500);
        nuevaCuenta1.debito(1500);
        nuevaCuenta1.debito(30000);
        nuevaCuenta1.verCuenta();




    }

}