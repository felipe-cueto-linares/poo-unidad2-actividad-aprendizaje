package taller10.ejercicios.ejercicio1;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y dicto " + materia);
    }
}