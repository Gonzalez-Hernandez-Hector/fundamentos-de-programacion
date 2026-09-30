package a223332341_practica_10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejecicio01 {
 
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirdato(String mensaje) throws IOException {
        double num;
        System.out.println(mensaje);
        num = Double.parseDouble(lectura.readLine());
        return num;
    }

    public static double calcularareacirculo(double radio) {
        double area;
        area = Math.PI * radio * radio;
        return area;
    }

    public static double calcularareatriangulo(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public static void mostrarmenu() {
        System.out.println("Menú:");
        System.out.println("c.- Calcular área del círculo");
        System.out.println("t.- Calcular área del triángulo");
        System.out.println("s.- Salir");
        System.out.println("Elige una opción: ");
    }

    public static void main(String[] args) throws IOException {
        String opcion;
        double radio, base, altura, areaCirculo, areaTriangulo;
        do {
            mostrarmenu();
            opcion = lectura.readLine().toUpperCase();
            switch (opcion) {
                case "C":
                    radio = pedirdato("Ingresa el radio del círculo: ");
                    areaCirculo = calcularareacirculo(radio);
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;
                case "T":
                    base = pedirdato("Ingresa la base del triángulo: ");
                    altura = pedirdato("Ingresa la altura del triángulo: ");
                    areaTriangulo = calcularareatriangulo(base, altura);
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;
                case "S":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!(opcion.equals("S")));
    }
}