import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        HashSet<String> ciudades = new HashSet<>();
        ciudades.add("Londres");
        ciudades.add("Paris");
        ciudades.add("Nueva York");
        ciudades.add("San Francisco");
        ciudades.add("Beijing");
        ciudades.add("Nueva York");
        
        System.out.println(ciudades);
        
        for (String s : ciudades) {
            System.out.println("- " + s.toUpperCase());
        }
    }
}
