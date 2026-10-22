package taller9.ejemplos.ejemplo2;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, String departamento) {
        super(nombre);
        this.departamento = departamento;
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
        System.out.println("Departamento: " + departamento);
    }
}