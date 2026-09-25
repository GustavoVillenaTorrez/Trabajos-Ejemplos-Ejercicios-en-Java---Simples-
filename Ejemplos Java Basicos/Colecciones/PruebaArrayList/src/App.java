import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Corrientes");
        ciudades.add("Goya");
        ciudades.add("Colonia Liebig");
        ciudades.add("Ituzaingo");

        System.out.println("La lista de ciudades de ciudades es:");
        System.out.println(ciudades);
        System.out.println("Ituzaingo se encuentra en ciudades? " + 
            ciudades.contains("Ituzaingo"));
        ciudades.remove("Ituzaingo");
        System.out.println("Hay " + ciudades.size() + " ciudades ahora");

        ArrayList<String> capitales = new ArrayList<>();
        capitales.add("Corrientes");
        capitales.add("Posadas");
        capitales.add("Resistencia");
        capitales.add("Salta");
        System.out.println("La lista de ciudades de capitales es:");
        System.out.println(capitales);

        ArrayList<String> prueba = (ArrayList<String>) (ciudades.clone());
        prueba.addAll(capitales);
        System.out.println("Ciudades en ciudades o capitales: ");
        System.out.println(prueba);
        prueba.remove("Corrientes");
        System.out.println("Ciudades en ciudades o capitales: ");
        System.out.println(prueba);        
        
        prueba =  (ArrayList<String>) (ciudades.clone());
        System.out.println("Elementos en prueba: " + prueba);        
        prueba.retainAll(capitales);
        System.out.print("Ciudades en ciudades y capitales: : ");
        System.out.println(prueba);

        prueba = (ArrayList<String>) (ciudades.clone());
        prueba.removeAll(capitales);
        System.out.print("Ciudades en ciudades y no en capitales: : ");
        System.out.println(prueba);
    }
}
