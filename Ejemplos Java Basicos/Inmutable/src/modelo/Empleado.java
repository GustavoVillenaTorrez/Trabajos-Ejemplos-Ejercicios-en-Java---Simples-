package modelo;

import java.util.Date;

public class Empleado {
    private int legajo;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;

    public Empleado (int legajo, String nombres, String apellidos, Date fechaNacimiento) {
        this.legajo = legajo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNacimiento() {
        // return fechaNacimiento;
        // copia defensiva
        return (Date) fechaNacimiento.clone();
        // alternativa de copia defensiva
        // new Date (fechaNacimiento.getTime());
    }
    
}
