package taller9.ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Ana Perez", 30);
        Empleado empleado = new Empleado("Carlos Ruiz", 28, "Sistemas");

        persona.mostrarDetalles();
        empleado.mostrarDetalles();
    }
}