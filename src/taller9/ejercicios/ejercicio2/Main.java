package taller9.ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Mamifero");
        Pez pez = new Pez("Atun", "Salada");

        animal.mostrarEspecie();
        pez.mostrarEspecie();
    }
}