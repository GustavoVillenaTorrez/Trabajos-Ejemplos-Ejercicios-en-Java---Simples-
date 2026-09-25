import modelo.*;

public class App {
    public static void main(String[] args) throws Exception {
        var pegaso1 = new Pegaso();
        System.out.println("Pegaso1 vuela? : " + pegaso1.puedeVolar());
        var paloma1 = new Paloma();
        System.out.println("Paloma1 vuela? : " + paloma1.puedeVolar());        
        var tigre1 = new Tigre();
        System.out.println("Tigre1 vuela? : " + tigre1.puedeVolar());
    }
}

/* Tarea clase:
Crear clase Paloma que implementa Pajaro
En el main() crear objeto Paloma y ver si vuela
---
Crear clase Tigre que implementa Animal
En el main() crear objeto Tigre y ver si vuela
*/
