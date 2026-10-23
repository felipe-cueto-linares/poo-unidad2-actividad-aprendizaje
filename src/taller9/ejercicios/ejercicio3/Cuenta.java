package taller9.ejercicios.ejercicio3;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}