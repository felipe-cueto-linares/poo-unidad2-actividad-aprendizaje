package taller9.ejemplos.ejemplo6;

public class Bicicleta extends Vehiculo {

    public Bicicleta() {
        super("Bicicleta");
    }

    @Override
    public void mostrarTipo() {
        super.mostrarTipo();
        System.out.println("Este es un tipo de bicicleta.");
    }
}