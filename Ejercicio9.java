import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Introduce la longitud del lado a: ");
        double a = scanner.nextDouble();
        
        System.out.println("Introduce la longitud del lado b: ");
        double b = scanner.nextDouble();
        
        System.out.println("Introduce la longitud del lado c: ");
        double c = scanner.nextDouble();
        
        double p = (a + b + c) / 2;
        
      
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        
        
        System.out.println("El área del triángulo es: " + area);
        
    }
}
