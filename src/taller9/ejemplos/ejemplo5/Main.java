package taller9.ejemplos.ejemplo5;

public class Main {
    public static void main(String[] args) {
        Planta planta = new Planta("Orquidea");
        System.out.println("Objeto Planta creado");

        // Error de compilación: Main no es una clase derivada de Planta, por lo que super no se puede usar aquí.
        // super.tipo = "Orquidea";
    }
}