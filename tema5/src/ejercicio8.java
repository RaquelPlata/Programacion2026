//Escribe un programa que lea una secuencia de números hasta que se
// introduzca un 0, y después muestre si se ha leído algún número negativo,
// cuántos positivos había y cuántos negativos.

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduce una secuencia de números (introduce 0 para terminar):");

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

        } while (numero != 0);
        if (negativos > 0) {
            System.out.println("Sí, se ha introducido al menos un número negativo.");
        } else {
            System.out.println("No se ha introducido ningún número negativo.");
        }
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

    }
}