import modelo.*;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        var empleado1 = new Empleado(1, "JUAN", "PEREZ", new Date());
        System.out.println(empleado1.getFechaNacimiento());
        
        var fecha = empleado1.getFechaNacimiento();
        fecha.setTime(200000);
        System.out.println("Fecha: " + fecha);
        System.out.println("Fecha nacimiento: " + empleado1.getFechaNacimiento());
        
    }
}
