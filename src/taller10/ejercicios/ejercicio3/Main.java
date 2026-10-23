package taller10.ejercicios.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Figura figura = new Circulo();
        System.out.println(figura.calcularArea(5));

        Saludo saludo = new SaludoFormal();
        saludo.saludar();
    }
}