package modelo;

public interface Pajaro extends Animal {
    
    @Override
    default boolean puedeVolar() {
        return true;
    }
}
