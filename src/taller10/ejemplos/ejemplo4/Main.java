package taller10.ejemplos.ejemplo4;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche();

        vehiculo.acelerar(60);
        coche.acelerar();
        coche.acelerar(80);
    }
}