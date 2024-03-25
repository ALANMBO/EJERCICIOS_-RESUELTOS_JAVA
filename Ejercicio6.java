import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la velocidad en kilómetros por hora (km/h): ");
        double velocidadKmh = scanner.nextDouble();
        
        double velocidadMs = velocidadKmh * (1000.0 / 3600.0);
        
        System.out.println("La velocidad " + velocidadKmh + " km/h equivale a " + velocidadMs + " m/s.");
        
    }
}
