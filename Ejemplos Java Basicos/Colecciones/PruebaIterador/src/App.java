import java.util.*;


public class App {

    public static void main(String[] args) {
        
        // creamos una colección mediante ArrayList
        Collection<String> ciudades = new ArrayList<>();
        // agregamos elementos
        ciudades.add("Paris");
        ciudades.add("Nueva York");
        ciudades.add("Buenos Aires");
        ciudades.add("Rio de Janeiro");
        
        // obtenemos un iterador de la colección
        Iterator<String> iterador = ciudades.iterator();
        
        // usamos el iterador
        while (iterador.hasNext()) {
            System.out.println(iterador.next().toUpperCase() + " ");
        }
        System.out.println();
        
        // opc. simple
        for (String s : ciudades) {
            System.out.println(s.toUpperCase());
        }
    
    }
}

/* 
Equivalente a:

    Iterator<String> iterador = ciudades.iterator();
    while (iterador.hasNext()) {
        System.out.print(iterador.next().toUpperCase() + " ");
    }

es:

    for (String elemento: cidades)
        System.out.print(elemento.toUpperCase() + " ");

- Es un foreach loop sin usar un iterador.
- Este bucle se lee como "para cada elemento de la colección, haga lo siguiente." 
- Un foreach loop puede ser utilizado para los arreglos y en cualquier instancia de iterable.
*/
