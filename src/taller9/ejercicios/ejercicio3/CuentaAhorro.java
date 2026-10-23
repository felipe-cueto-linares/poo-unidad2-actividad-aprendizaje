package taller9.ejercicios.ejercicio3;

public class CuentaAhorro extends Cuenta {
    private double interes;

    public CuentaAhorro(double saldo, double interes) {
        super(saldo);
        this.interes = interes;
    }

    public void mostrarDetalle() {

        super.mostrarSaldo();
        System.out.println("Interes: " + interes);
    }
}