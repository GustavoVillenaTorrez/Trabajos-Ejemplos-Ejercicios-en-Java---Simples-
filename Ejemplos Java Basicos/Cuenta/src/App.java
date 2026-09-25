import java.math.BigDecimal;
import modelo.Cuenta;

public class App {
    public static void main(String[] args) {
    /*    Escriba un programa de prueba que cree un objeto Cuenta con un nro. de cuenta 1122, 
    un saldo de $ 20.000 y una tasa de interés anual del 4,5%; retire $ 2.500, deposite $ 3,000 
    e imprima: el id, saldo, interés mensual y fecha en que se creó la cuenta. 
    Luego cree una cuenta por defecto con nro. de cuenta 2234.
*/

        var miCuenta = new Cuenta(1122, BigDecimal.valueOf(20000.0));
        Cuenta.setTasaInteresAnual(BigDecimal.valueOf(4.5));
        miCuenta.retirar(BigDecimal.valueOf(2500.0));
        miCuenta.depositar(BigDecimal.valueOf(3000.0));
        System.out.println(miCuenta);
        System.out.println(miCuenta.getNroCuenta() + " " + miCuenta.getSaldo() + " " + miCuenta.getInteresMensual() + " " + miCuenta.getFechaCreacion());
        var miSegundaCuenta = Cuenta.crearCuentaSimple(2234);
        System.out.println(miSegundaCuenta);
        
    }
}
