package modelo;

public class Rectangulo implements ObjetoGeometrico {
    private double ancho;
    private double largo;
        
    public Rectangulo () {
        this.ancho = 1;
        this.largo = 1;
    }
    
    public Rectangulo (double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
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
        return this.ancho * this.largo;
    }    
}
