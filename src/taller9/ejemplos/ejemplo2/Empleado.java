package taller9.ejemplos.ejemplo2;

public class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }
}