package taller10.ejemplos.ejemplo4;

public class Coche extends Vehiculo {
    // Profe, al descomentar el siguiente método marca error de compilación:
    // method does not override or implement a method from a supertype.
    // @Override reclama la misma firma de Vehiculo, que recibe un int, y aquí no recibe parámetros.
    // @Override
    // public void acelerar() {
    //     System.out.println("El coche acelera");
    // }

    public void acelerar() {
        System.out.println("El coche acelera");
    }
}