package modelo;

public class Rectangulo extends ObjetoGeometrico {

    private double ancho;
    private double largo;

    public Rectangulo () {
        ancho = 1;
        largo = 1;
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

    public double getArea() {
        return largo * ancho;
    }

    public double getPerimetro() {
        return 2 * largo + 2 * ancho;
    }
    
}
