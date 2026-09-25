import modelo.*;

public class App {
    public static void main(String[] args) {
        ObjetoGeometrico[] objetosGeometricos = {
            new Circulo(10),       // Area es casi 314.159
            new Rectangulo(5, 10),  // Area es 50
            new Cuadrado(10)};     // Area es 100
        System.out.println("Suma de areas: " + ObjetoGeometrico.sumaAreas(objetosGeometricos));
        // Area es casi 464.159        
    }

}