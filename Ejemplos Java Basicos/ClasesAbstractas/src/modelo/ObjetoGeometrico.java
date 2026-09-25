package modelo;

import java.util.Date;

public abstract class ObjetoGeometrico {
    private String color;
    private boolean pintado;
    private Date fechaCreacion;
    
    protected ObjetoGeometrico() {
        color = "";
        pintado = false;
        fechaCreacion = new Date();
    }

    protected ObjetoGeometrico(String c, boolean p) {
        color = c;
        pintado = p;
        fechaCreacion = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPintado() {
        return pintado;
    }

    public void setPintado(boolean pintado) {
        this.pintado = pintado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public String toString() {
        return "OG color: " + color + ", pintado: " + pintado + ", fecha creación: " + fechaCreacion;
    }
    
    public abstract double getArea();

    public abstract double getPerimetro();

}
