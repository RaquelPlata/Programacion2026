/**
 * Escribe un programa que pida un número entero N entre 0 y 20 y muestre los números desde 1 hasta N,
 * uno en cada línea, repitiendo cada número tantas veces como su valor:
 * Número: 5
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */
import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero entre 0 y 20: ");
        int n = teclado.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("El número debe estar entre 0 y 20.");
        } else {
            for (int fila = 1; fila <= n; fila++) {
                for (int veces = 1; veces <= fila; veces++) {
                    System.out.print(fila);
                }
                System.out.println(); // Salta a la siguiente línea al acabar cada fila
            }
        }
    }
}