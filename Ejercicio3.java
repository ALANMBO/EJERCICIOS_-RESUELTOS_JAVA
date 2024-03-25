import java.util.Scanner;
@SuppressWarnings("unused")
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");

        int num1 = scanner.nextInt();

        int num2 = num1 * 2 ;

        int num3 = num1 * 3;

        System.out.println("EL DOBLE DE ESE NUMERO ES;" + num2);
        System.out.println("EL DOBLE DE ESE NUMERO ES;" + num3);
    }
}
