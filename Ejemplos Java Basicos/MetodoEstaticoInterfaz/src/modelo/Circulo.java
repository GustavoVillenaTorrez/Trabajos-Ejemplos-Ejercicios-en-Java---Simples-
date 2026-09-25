package modelo;

public class Circulo implements ObjetoGeometrico {
    private double radio;
    
    public Circulo() {
        this.radio = 1;
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return this.radio * this.radio * Math.PI;
    }
}
