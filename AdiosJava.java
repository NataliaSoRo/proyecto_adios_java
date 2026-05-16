
import java.util.Scanner;

public class AdiosJava{
    public static void main(String[] args) {
       int numero1, numero2;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Escribe el numero 1:");
       numero1 = scanner.nextInt();
       System.out.println("Escribe el numero 2: ");
       numero2 = scanner.nextInt();
       int resultado = numero1 + numero2;
       System.out.println("La suma es: " + resultado);
       // La llamada al metodo de restar
        int resultadoResta = restar(numero1, numero2);
        System.out.println("La resta es: " + resultadoResta);
    }
    // Metodo de la resta
    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

}