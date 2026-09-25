package modelo;

public class Rectangulo extends ObjetoGeometrico {

    private double ancho;
    private double largo;

    public Rectangulo () {
        ancho = 1.0;
        largo = 1.0;
    }

    public Rectangulo(double a, double l) {
        ancho = a;
        largo = l;
    }

    public Rectangulo(double a, double l, String c, boolean p) {
        ancho = a;
        largo = l;
        setColor(c);
        setPintado(p);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public double getArea() {
        return largo * ancho;
    }

    @Override
    public double getPerimetro() {
        return 2 * largo + 2 * ancho;
    }

    @Override
    public String toString() {
        return super.toString() + ". R largo: " + largo + ", ancho: " + ancho; 
    }

}
