package modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Cuenta {
    
    // atributos
    private int nroCuenta = 0;
    private BigDecimal saldo = BigDecimal.valueOf(0);
    private static BigDecimal tasaInteresAnual = BigDecimal.valueOf(0);
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    // constructores 
    public Cuenta() {
    }

    public Cuenta(int nroCuenta, BigDecimal saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    // bicho raro
    public Cuenta (int nroCuenta, String saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = BigDecimal.valueOf(Double.parseDouble(saldo));
    } 
    // métodos accesores y modificadores

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public static BigDecimal getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public static void setTasaInteresAnual(BigDecimal tasaInteresAnual) {
        Cuenta.tasaInteresAnual = tasaInteresAnual;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    // métodos personalizados
    public static BigDecimal getTasaInteresMensual() {
        return tasaInteresAnual.divide(BigDecimal.valueOf(12));
    }

    public BigDecimal getInteresMensual() {
        return this.saldo.multiply(Cuenta.getTasaInteresMensual().divide(BigDecimal.valueOf(100)));
    }

    public void retirar(BigDecimal monto) {
        this.saldo = this.saldo.subtract(monto);
    }

    public void depositar(BigDecimal monto) {
        this.saldo = this.saldo.add(monto);
    }

    public static Cuenta crearCuentaSimple(int nroCuenta) {
        return new Cuenta(nroCuenta, BigDecimal.valueOf(0));
    }

    public String toString() {
        return nroCuenta + " " + saldo + " " + getInteresMensual() + " " + fechaCreacion; 
    }
}
