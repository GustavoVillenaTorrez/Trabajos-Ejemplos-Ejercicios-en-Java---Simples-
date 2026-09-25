import java.util.ArrayList;
import modelo.Circulo;
import modelo.CirculoRadio2;
import modelo.ObjetoGeometrico;
import modelo.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {
        //Circulo c1 = new Circulo();
        //System.out.println(c1);

        var misObjetos = new ArrayList<ObjetoGeometrico>();
        misObjetos.add(new Circulo());
        misObjetos.add(new Rectangulo());
        misObjetos.add(new CirculoRadio2());
        System.out.println(misObjetos);

        for (var og : misObjetos) {
            System.out.println(og.getArea());
        }

    }
}
