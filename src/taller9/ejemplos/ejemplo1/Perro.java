package taller9.ejemplos.ejemplo1;

public class Perro extends Animal {
    private String raza;

    public Perro(String especie, String raza) {
        super(especie);
        this.raza = raza;
    }

    public void mostrarRaza() {
        System.out.println("Raza: " + raza);
    }
}