package taller9.ejemplos.ejemplo3;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int numeroDePuertas) {
        super(marca);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarPuertas() {
        System.out.println("Numero de puertas: " + numeroDePuertas);
    }
}