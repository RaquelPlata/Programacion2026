//Escribe un programa que pida dos números enteros A y B, con B mayor que A,
// muestre los números desde A hasta B e indique cuántos de ellos son pares.
// Para 5 y 11 debe mostrar 5 6 7 8 9 10 11 y decir que hay 3 pares.
import java.util.Scanner;

public class ejercicio21 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número A: ");
        int a = teclado.nextInt();

        System.out.print("Introduce el número B (mayor que A): ");
        int b = teclado.nextInt();

        if (b <= a) {
            System.out.println("Error: B debe ser mayor que A.");
        } else {
            int pares = 0;

            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
                if (i % 2 == 0) {
                    pares++;
                }
            }
            System.out.println();
            System.out.println("Hay " + pares + " números pares.");
        }
    }
}