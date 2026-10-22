package taller9.ejemplos.ejemplo6;

public class Vehiculo {
    protected String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarTipo() {
        System.out.println("Tipo de vehiculo: " + tipo);
    }
}