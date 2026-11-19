/**
 * Escribe un programa que pida un número y construya por pantalla una pirámide de asteriscos con tantas filas como indica. Para 6:
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 * ***********
 */
import java.util.Scanner;

public class ejercicio22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = teclado.nextInt();

        if (filas <= 0) {
            System.out.println("Introduce un número mayor que 0.");
        } else {
            for (int fila = 1; fila <= filas; fila++) {

                for (int espacios = 1; espacios <= filas - fila; espacios++) {
                    System.out.print(" ");
                }

                for (int asteriscos = 1; asteriscos <= 2 * fila - 1; asteriscos++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}