package modelo;

import java.util.Date;

public class ObjetoGeometrico {

    private String color;
    private boolean pintado;
    private Date fechaCreacion = new Date();

    public ObjetoGeometrico() {
        // probar descomentando esto
        // System.out.println("HOLA SOY EL CONSTRUCTOR SIN ARGUMENTOS DE OG");
        color = "";
        pintado = false;
    }

    public ObjetoGeometrico (String c, boolean p) {
        color = c;
        pintado = p;
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
        return "OG: " + this.color + " " + this.pintado; 
    }

    // definir double getArea() que retorne 0.0
    // definir double getPerimetro() que retorne 0.0
    

}
