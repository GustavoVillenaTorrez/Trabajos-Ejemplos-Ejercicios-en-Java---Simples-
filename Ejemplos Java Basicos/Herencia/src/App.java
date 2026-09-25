import java.util.ArrayList;
import modelo.*;

public class App {
    public static void main(String[] args) {
        /*
        var r1 = new Rectangulo();
        var r2 = new Rectangulo(2, 2, "Azul", true);
        var c1 = new Circulo();
        var c2 = new Circulo(3, "Rojo", true); 
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(c1);
        System.out.println(c2);
        */

        var misObjetos = new ArrayList<ObjetoGeometrico>();
        misObjetos.add(new ObjetoGeometrico());
        misObjetos.add(new Rectangulo());
        misObjetos.add(new Rectangulo(2, 2, "Azul", true));
        misObjetos.add(new Circulo());
        misObjetos.add(new Circulo(3, "Rojo", true));
        
        for (var og : misObjetos) {
            if (og instanceof Circulo) {
                // downcasting
                var c = (Circulo) og;
                System.out.println(c.getRadio());
            }
            if (og instanceof Rectangulo) {
                // downcasting
                // var r = (Rectangulo) og;
                //System.out.println(r.getAncho() + " " + r.getLargo());
                System.out.println( ((Rectangulo) og).getAncho() + " " + ((Rectangulo) og).getLargo());
            }
            System.out.println("-> " + og.getFechaCreacion());
        }

        // armar for que devuelva el area de cada objeto
        // contenido en el ArrayList
    }
}
