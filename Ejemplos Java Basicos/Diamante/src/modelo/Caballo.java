package modelo;

public interface Caballo extends Animal {
    
    @Override
    default boolean puedeVolar() {
        return false;
    }
}
