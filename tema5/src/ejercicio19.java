//Escribe un programa que lea un número y escriba el carácter * tantas veces como indica el número.
// Si el número no es positivo, escribirá un único asterisco. Para 8 debe mostrar ********.
import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int veces = teclado.nextInt();

        if (veces <= 0) {
            System.out.println("*");
        } else {
            for (int i = 1; i <= veces; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}