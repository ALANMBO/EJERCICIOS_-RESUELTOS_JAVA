import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un numero ");
        double r = scanner.nextDouble();
        
        double v = (4.0/3.0)*Math.PI*Math.pow(r,3);
        
      
        System.out.println("El resultado es: " + v);
        
        
    }
}

