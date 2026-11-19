//Escribe un programa que muestre y cuente los múltiplos de 3 desde el 1
// hasta un número que se introduce por teclado. Para 13 debe decir que hay 4.
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int limite = teclado.nextInt();

        int contador = 0;

        for (int i = 1; i <= limite; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Hay " + contador + " múltiplos de 3.");
    }
}