import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) {
        
        Set<String> ciudades = new HashSet<>();
        ciudades.add("Londres");
        ciudades.add("Paris");
        ciudades.add("Nueva York");
        ciudades.add("San Francisco");
        ciudades.add("Beijing");
        ciudades.add("Nueva York");

        TreeSet<String> ciudadesOrdenadas = new TreeSet<>(ciudades);
        System.out.println("Conjunto: " + ciudades);
        System.out.println("Conjunto ordenado: " + ciudadesOrdenadas);

        // primer elemento
        System.out.println("first(): " + ciudadesOrdenadas.first());
        // ultimo elemento
        System.out.println("last(): " + ciudadesOrdenadas.last());
        // elementos anteriores al indicado
        System.out.println("headSet(\"Nueva York\"): " + ciudadesOrdenadas.headSet("Nueva York"));
        // elementos posteriores al indicado (incluye el indicado)
        System.out.println("tailSet(\"Nueva York\"): "  + ciudadesOrdenadas.tailSet("Nueva York"));
        
        // el mayor elemento menor al buscado
        System.out.println("lower(\"Paris\"): " + ciudadesOrdenadas.lower("Paris"));
        // el menor elemento mayor al buscado
        System.out.println("higher(\"Paris\"): " + ciudadesOrdenadas.higher("Paris"));
        // el mayor elemento menor o igual al buscado
        System.out.println("floor(\"Paris\"): " + ciudadesOrdenadas.floor("Paris"));
        // el menor elemento mayor o igual al buscado
        System.out.println("ceiling(\"Paris\"): " + ciudadesOrdenadas.ceiling("Paris"));
        // remueve el primer elemento
        System.out.println("pollFirst(): " + ciudadesOrdenadas.pollFirst());
        // remueve el ultimo elemento
        System.out.println("pollLast(): " + ciudadesOrdenadas.pollLast());
        System.out.println("Nuevo ciudadesOrdenadas: " + ciudadesOrdenadas);
    }
}

/*
Los Strings son ordenados en el Tree Set usando compareTo()  de la interfaz 
Comparable.

Si se crea un TreeSet usando su constructor sin argumentos compareTo() es usado 
para comparar los elementos del conjunto, asumiendo que la clase de elementos 
implementa la interfaz Comparable.

Para usar un comparador, se debe usar el constructor: TreeSet(Comparator comparador) 
para crear un conjunto ordenado que usa el metodo comparador para ordenar los 
elementos.

*/
