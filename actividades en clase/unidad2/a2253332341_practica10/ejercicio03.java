package a223332341_practica_10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio03 {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirdato(String mensaje) throws IOException {
        double num;
        System.out.println(mensaje);
        num = Double.parseDouble(lectura.readLine());
        return num;
    }

    public static double calcularareacirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularareatriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularearectangulo(double base, double altura) {
        return base * altura;
    }

    public static double calcularareatrapecio(double baseMayor, double baseMenor, double altura) {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public static void mostrarmenu() {
        System.out.println("Menú:");
        System.out.println("c.- Calcular área del círculo");
        System.out.println("t.- Calcular área del triángulo");
        System.out.println("r.- Calcular área del rectángulo");
        System.out.println("p.- Calcular área del trapecio");
        System.out.println("s.- Salir");
        System.out.println("Elige una opción: ");
    }

    public static void circulo() throws IOException {
        double radio = pedirdato("Ingresa el radio del círculo: ");
        System.out.println("El área del círculo es: " + calcularareacirculo(radio));
    }

    public static void triangulo() throws IOException {
        double base = pedirdato("Ingresa la base del triángulo: ");
        double altura = pedirdato("Ingresa la altura del triángulo: ");
        System.out.println("El área del triángulo es: " + calcularareatriangulo(base, altura));
    }

    public static void rectangulo() throws IOException {
        double base = pedirdato("Ingresa la base del rectángulo: ");
        double altura = pedirdato("Ingresa la altura del rectángulo: ");
        System.out.println("El área del rectángulo es: " + calcularearectangulo(base, altura));
    }

    public static void trapecio() throws IOException {
        double baseMayor = pedirdato("Ingresa la base mayor del trapecio: ");
        double baseMenor = pedirdato("Ingresa la base menor del trapecio: ");
        double altura = pedirdato("Ingresa la altura del trapecio: ");
        System.out.println("El área del trapecio es: " + calcularareatrapecio(baseMayor, baseMenor, altura));
    }

    public static void main(String[] args) throws IOException {
        String opcion = "";
        while (!opcion.equals("S")) {
            mostrarmenu();
            opcion = lectura.readLine().toUpperCase();
            switch (opcion) {
                case "C":
                    circulo();
                    break;
                case "T":
                    triangulo();
                    break;
                case "R":
                    rectangulo();
                    break;
                case "P":
                    trapecio();
                    break;
                case "S":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}