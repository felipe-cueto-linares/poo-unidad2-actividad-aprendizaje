package taller9.ejercicios.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(150);
        motor.mostrarPotencia();

        CuentaAhorro cuenta = new CuentaAhorro(2000, 0.05);
        cuenta.mostrarDetalle();
    }
}