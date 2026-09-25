import java.math.BigInteger;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        var misNumeros = new ArrayList<Number>();

        misNumeros.add(2);
        misNumeros.add(2.5f);
        misNumeros.add(new BigInteger("99999999999"));

        for (var n : misNumeros) {
            imprimir(n);
        }
    }

    private static void imprimir(Number n) {
        System.out.println(n.getClass() + ": " + n);
    }
}
