package taller10.ejemplos.ejemplo3;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Empleado gerente = new Gerente();

        empleado.trabajar();
        gerente.trabajar();
    }
}