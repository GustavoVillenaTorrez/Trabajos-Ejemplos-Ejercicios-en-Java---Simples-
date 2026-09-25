import modelo.PerroProgramador;

public class App {
    public static void main(String[] args) {
        var miPerro = new PerroProgramador();
        System.out.println(miPerro);
        miPerro.comer();
        System.out.println(miPerro);
        miPerro.jugar();
        System.out.println(miPerro);
        miPerro.programar();
        System.out.println(miPerro);
    }
}
