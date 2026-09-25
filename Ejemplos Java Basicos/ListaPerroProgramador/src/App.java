import java.util.ArrayList;
import modelo.PerroProgramador;

public class App {
    public static void main(String[] args) throws Exception {
        // Lista que va a contener perros programadores
        // (Objetos PerroProgramador)
        var perrosProgramadores = new ArrayList<PerroProgramador>();
        // obtener el largo del ArrayList
        System.out.println("Largo actual: " + perrosProgramadores.size());
        // Creamos un objeto PerroProgramador con nombre Pepe
        var programadorPepe = new PerroProgramador("Pepe");
        // imprimimos a Pepe
        System.out.println(programadorPepe);
        // lo agregamos al ArrayList
        perrosProgramadores.add(programadorPepe);
        // obtener el largo del ArrayList
        System.out.println("Largo actual: " + perrosProgramadores.size());
        System.out.println(perrosProgramadores);
        // creen un objeto PerroProgramador con nombre Charly y lo agrega a la lista
        perrosProgramadores.add(new PerroProgramador("Charly"));
        // creen un objeto PerroProgramador con nombre Willy y lo agrega a la lista
        perrosProgramadores.add(new PerroProgramador("Willy"));
        // creen un objeto PerroProgramador con nombre Silvestre y lo agrega a la lista
        perrosProgramadores.add(new PerroProgramador("Silvestre"));
        // creen un objeto PerroProgramador con nombre Olivia y lo agrega a la lista
        perrosProgramadores.add(new PerroProgramador("Olivia"));
        // obtener el largo del ArrayList
        System.out.println("Largo: " + perrosProgramadores.size());
        // contenido del ArrayList
        System.out.println(perrosProgramadores);
        // ciclo for donde cada perroProgramador coma y muestre 
        // su estado --> usando toString()
        for (var i = 0; i < perrosProgramadores.size(); i++) {
            // perrosProgramadores.get(i).comer();
            // System.out.println(perrosProgramadores.get(i));
            var perro = perrosProgramadores.get(i);
            perro.comer();
            System.out.println(perro);
        }
        // ciclo mejorado (Usar este tipo de for)
        for (var perro : perrosProgramadores) {
            perro.comer();
            System.out.println(perro);
        }

    }
}
