package modelo;

public class Cuadrado implements ObjetoGeometrico {
    private double lado;

    public Cuadrado() {
        this.lado = 1;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return this.lado * this.lado;
    }
    
}
