package app.ejercicios.ejercicio1;

public class Rectangulo {
    private double ancho = 1.0;
    private double alto = 1.0;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double area(){
        return alto * ancho;
    }

    public double perimetro(){
        return 2 * (alto + ancho);
    }
}

