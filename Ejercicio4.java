import java.util.Scanner;
@SuppressWarnings("unused")
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESE UN NUMERO EN CENTIGRADOS");
         
        int C = scanner.nextInt();
        int F = 32 + ( 9 * C / 5);

        System.out.println("pasar de grados centígrados a fahrenheit es:" + F  );


    }
}
