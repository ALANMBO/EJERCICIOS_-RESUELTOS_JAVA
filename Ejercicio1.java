/*public class Ejercicio1 {
    public static void main(String[] args) {
     
    int a = 5;
    int b = 5;
        
    System.out.println(a);
    System.out.println(b);

    }
}*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número entero: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número entero: ");
        int numero2 = scanner.nextInt();
        
        System.out.println("El primer número que ingresaste es: " + numero1);
        System.out.println("El segundo número que ingresaste es: " + numero2);
        
        scanner.close();
    }
}
