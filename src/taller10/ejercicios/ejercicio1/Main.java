package taller10.ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Ana Perez"),
                new Estudiante("Felipe Cueto", "Ingenieria de Software"),
                new Profesor("John Arrieta", "Programacion Orientada a Objetos")
        };

        for (Persona p : personas) {
            p.presentarse();
        }
    }
}