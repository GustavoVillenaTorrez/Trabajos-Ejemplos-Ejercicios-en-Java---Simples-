import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(1);
        lista.add(4);
        lista.add(0, 10);
        lista.add(3, 30);
        System.out.println("La lista de enteros en lista es:");
        System.out.println(lista);
        
        LinkedList<Integer> listaEnlazada = new LinkedList<>(lista);
        listaEnlazada.add(1, 500);
        listaEnlazada.removeLast();
        listaEnlazada.addFirst(5000);
        System.out.println("Lista enlazada:");
        
	    // iterador
        ListIterator<Integer> iterador = listaEnlazada.listIterator();
        while (iterador.hasNext()) {
            System.out.print(iterador.next() + " ");
        }        
        System.out.println();
        
        System.out.println("Lista enlazada de atras a adelante:");
	    // iterador
        iterador = listaEnlazada.listIterator(listaEnlazada.size());
        while (iterador.hasPrevious()) {
            System.out.print(iterador.previous() + " ");
        }
        System.out.println();
    }

}
