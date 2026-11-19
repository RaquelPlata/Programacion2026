//Escribe un programa que lea números y acepte únicamente los que sean mayores que el último introducido.
// La introducción termina con un 0. Al final se mostrará el total de números introducidos, sin contar el 0, y el total de fallos.
// Por ejemplo, con 20 21 8 15 10 30 0 el programa avisa de que el 8 y el 10 son fallos,
// y al final dice que se han introducido 6 números y que ha habido 2 fallos.
import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalNumeros = 0;
        int fallos = 0;
        int ultimoAceptado = 0;
        boolean hayAnterior = false;

        System.out.println("Introduce números (0 para terminar):");
        int numero = teclado.nextInt();

        while (numero != 0) {
            totalNumeros++;

            if (!hayAnterior) {
                ultimoAceptado = numero;
                hayAnterior = true;
            } else if (numero > ultimoAceptado) {
                ultimoAceptado = numero;
            } else {
                System.out.println("Fallo: el " + numero + " no es mayor que " + ultimoAceptado + ".");
                fallos++;
            }

            numero = teclado.nextInt();
        }

        System.out.println("Total de números introducidos: " + totalNumeros);
        System.out.println("Total de fallos: " + fallos);
    }
}