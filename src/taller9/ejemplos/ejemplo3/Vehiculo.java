package taller9.ejemplos.ejemplo3;

public class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + marca);
    }
}