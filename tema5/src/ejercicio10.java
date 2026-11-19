//Escribe un programa que lea una secuencia de notas, con valores de 0 a 10, que termina con el valor −1,
// y diga si hubo o no alguna nota con valor 10.

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        double notas = 0;
        boolean hayDiez = false;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce las notas ((-1) para terminar): ");
        notas = sc.nextDouble();

        while (notas != -1) {
            if (notas == 10) {
                hayDiez = true;
            }

            System.out.print("Introduce otra nota ((-1) para terminar): ");
            notas = sc.nextDouble();
        }


        if (hayDiez) {
            System.out.println("¡Sí! Hubo algún diez en la secuencia.");
        } else {
            System.out.println("No hubo ningún diez en la secuencia.");
        }

    }
}