package modelo;

public class Circulo extends ObjetoGeometrico {
    private double radio;

    public Circulo() {
        radio = 1;
    }

    public Circulo(double r) {
        radio = r;
    }

    public Circulo(double r, String c, boolean p) {
        //super(c, p);
        radio = r;
        setColor(c);
        setPintado(p);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public String toString() {
        // return "C: " + this.radio + " " + this.getColor() + " " + this.getPerimetro();
        return  "C: " + this.radio + " " + super.toString();         
    }

}
