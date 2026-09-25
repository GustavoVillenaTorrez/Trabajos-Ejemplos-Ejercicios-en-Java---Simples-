import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        // Creo un HashMap
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Pepe", 30);
        mapa.put("Roberto", 31);
        mapa.put("Alberto", 29);
        mapa.put("Luis", 29);

        System.out.println("Entradas del mapa: ");
        System.out.println(mapa);

        // Creo un TreeMap desde un HashMap
        Map<String, Integer> mapaOrdenado = new TreeMap<>(mapa);
        System.out.println("Entradas ordenadas: ");
        System.out.println(mapaOrdenado);

        // Creo un LinkedHashMap 
        // para ordenar por acceso
        // constructor(capacidad inicial, factor de carga, true)
        // El factor de carga es una medida de cuán llena se permite que se encuentre
        // la tabla hash antes de que su capacidad aumente automáticamente 
        Map<String, Integer> mapaAcceso = new LinkedHashMap<>(16, 0.75f, true);
        mapaAcceso.put("Florencia", 30);
        mapaAcceso.put("Rosana", 31);
        mapaAcceso.put("Amalia", 29);
        mapaAcceso.put("Ana", 29);

        System.out.println("Entradas de mapaAcceso: ");
        System.out.println(mapaAcceso);
        // Muestra la edad de Amalia
        System.out.println("La edad de Amalia es: " + mapaAcceso.get("Amalia"));
        System.out.println("Entradas de mapaAcceso: ");
        System.out.println(mapaAcceso);
        // Muestra la edad de Rosana
        System.out.println("La edad de Rosana es: " + mapaAcceso.get("Rosana"));
        System.out.println("Entradas de mapaAcceso: ");
        System.out.println(mapaAcceso);        
    }

}
