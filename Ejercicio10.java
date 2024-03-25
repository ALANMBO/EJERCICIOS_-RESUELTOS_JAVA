import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO DE TRES CIFRAS:");
        int numero = scanner.nextInt();

    
        int digito3 = numero % 10;

        
        numero = numero / 10;

    
        int digito2 = numero % 10;

        
        numero = numero / 10;

    
        int digito1 = numero;

        
        System.out.println("El primer dígito es: " + digito1);
        System.out.println("El segundo dígito es: " + digito2);
        System.out.println("El tercer dígito es: " + digito3);

    
    }
}
