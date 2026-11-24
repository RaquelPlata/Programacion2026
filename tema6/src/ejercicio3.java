//Escribe un programa que pida diez números reales por teclado, los guarde en un vector y
//lo recorra para encontrar el máximo y el mínimo, que mostrará por pantalla.

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[10];
        double numReales;
        double max = vector[0];
        double min = vector[0];

        System.out.println("Introduce los numeros reales: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("numero real " + (i + 1) + ":");
            numReales = sc.nextDouble();
            vector[i] = numReales;
        }



        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > min) {
                max = vector[i];
            }
            if (vector[i] < min) {
                min = vector[i];
            }
        }

        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);

    }
}