package modelo;

public interface ObjetoGeometrico {

    // todas los objetos deben implementar getArea()
    public abstract double getArea();

    public static double sumaAreas(ObjetoGeometrico[] objetosGeometricos) {
        double suma = 0;
        for (ObjetoGeometrico og : objetosGeometricos) {
            suma = suma + og.getArea();
        }
        return suma;
    }
}
