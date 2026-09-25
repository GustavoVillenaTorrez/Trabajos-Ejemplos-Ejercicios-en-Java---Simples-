import java.util.Set;
import java.util.HashSet;

public class App {

    public static void main(String[] args) {

        Set<String> ciudades = new HashSet<>();
        ciudades.add("Londres");
        ciudades.add("Paris");
        ciudades.add("Nueva York");
        ciudades.add("San Francisco");
        ciudades.add("Beijing");
        ciudades.add("Montevideo");
        ciudades.add("Nueva York");

        System.out.println("Ciudades: " + ciudades);
        System.out.println(ciudades.size() + " elementos en ciudades");

        ciudades.remove("Londres");
        System.out.println("Ciudades: " + ciudades);
        System.out.println(ciudades.size() + " elementos en ciudades");

        Set<String> ciudadesSudamerica = new HashSet<>();
        ciudadesSudamerica.add("Montevideo");
        ciudadesSudamerica.add("Rio de Janeiro");
        ciudadesSudamerica.add("Santiago");
        System.out.println("ciudadesSudamerica es " + ciudadesSudamerica);
        System.out.println(ciudadesSudamerica.size() + " elementos en ciudadesSudamerica");
        
        System.out.println("\nTaipei en ciudadesSudamerica? " + ciudadesSudamerica.contains("Taipei"));

        ciudades.addAll(ciudadesSudamerica);
        System.out.println("\nLuego de agregar ciudadesSudamerica a ciudades, ciudades es: "
                + ciudades);

        ciudades.removeAll(ciudadesSudamerica);
        System.out.println("Luego de eliminar ciudadesSudamerica de ciudades, ciudades es "
                + ciudades);

        ciudades.retainAll(ciudadesSudamerica);
        System.out.println("Luego de eliminar los elementos no comunes con ciudadesSudamerica "
                + "de ciudades, ciudades es " + ciudades);
    }
}
