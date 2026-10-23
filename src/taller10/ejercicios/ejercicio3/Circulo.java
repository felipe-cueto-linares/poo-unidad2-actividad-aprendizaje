package taller10.ejercicios.ejercicio3;

public class Circulo extends Figura {
    // Profe, al descomentar el siguiente método marca error de compilación:
    // method does not override or implement a method from a supertype.
    // Se cambió la firma (recibe un String en vez de un double), por lo que no es una sobrescritura.
    // @Override
    // public double calcularArea(String medida) {
    //     return 0;
    // }

    public double calcularArea(String medida) {
        return Double.parseDouble(medida) * 3.14;
    }
}