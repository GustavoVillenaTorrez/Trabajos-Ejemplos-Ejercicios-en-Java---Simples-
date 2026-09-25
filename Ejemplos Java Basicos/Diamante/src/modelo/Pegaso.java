package modelo;

public class Pegaso implements Caballo, Pajaro {
    
    @Override
    public boolean puedeVolar() {
        //return true;
        return Pajaro.super.puedeVolar();
    }
}
