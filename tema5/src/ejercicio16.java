//Escribe un programa que pida un número entero positivo y diga si es primo o no.
// Para 13 debe decir que es primo.
import java.util.Scanner;

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int numero = teclado.nextInt();

        if (numero <= 1) {
            System.out.println("El número " + numero + " NO es primo.");
        } else {
            boolean esPrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("El número " + numero + " ES primo.");
            } else {
                System.out.println("El número " + numero + " NO es primo.");
            }
        }
    }
}