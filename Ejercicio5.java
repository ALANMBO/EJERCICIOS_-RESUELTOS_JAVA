import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el valor del radio: ");
        double r = scanner.nextDouble();
        
        double longitud = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);
        
        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área de la circunferencia: " + area);
        
        scanner.close();
    }
}
