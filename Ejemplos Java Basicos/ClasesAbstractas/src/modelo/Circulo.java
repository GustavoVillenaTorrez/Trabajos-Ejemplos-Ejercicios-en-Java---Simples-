package modelo;

public class Circulo extends ObjetoGeometrico {
 
    private double radio;

    public Circulo() {
        radio = 1.0;
    }

    public Circulo(double r) {
        radio = r;
    }

    public Circulo(double r, String c, boolean p) {
        super(c, p);
        radio = r;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return super.toString() + ". C radio: " + radio; 
    }

}
