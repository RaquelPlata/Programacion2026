//Escribe un programa en el que el usuario «piensa» un número del 1 al 100 y el ordenador intenta adivinarlo: propone un número, el usuario le responde si el suyo es mayor (>), menor (<) o igual (=),
// y el ordenador vuelve a proponer, hasta acertar.
import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Piensa un número del 1 al 100.");
        System.out.println("Responde con '>' si tu número es mayor, '<' si es menor, o '=' si he acertado.\n");

        int minimo = 1;
        int maximo = 100;
        int intentos = 0;
        boolean acertado = false;

        while (minimo <= maximo) {
            intentos++;
            int propuesta = minimo + (maximo - minimo) / 2;

            System.out.print("Intento " + intentos + ": ¿Es el " + propuesta + "? (>, <, =): ");
            String respuesta = scanner.nextLine().trim();

            if (respuesta.equals("=")) {
                System.out.println("\n¡Genial! He adivinado tu número (" + propuesta + ") en " + intentos + " intentos.");
                acertado = true;
                break;
            } else if (respuesta.equals(">")) {
                minimo = propuesta + 1;
            } else if (respuesta.equals("<")) {
                maximo = propuesta - 1;
            } else {
                System.out.println("Entrada no válida. Por favor, escribe solo '>', '<' o '='.");
                intentos--;
            }
        }

        if (!acertado) {
            System.out.println("\nHmm, algo no cuadra. Parece que has cambiado de número o te has equivocado al responder.");
        }

    }
}