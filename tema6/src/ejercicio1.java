//Escribe un programa que pida diez números reales por teclado, los guarde en un vector y después muestre todos sus valores.

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int numReales;

        System.out.println("Introduce los numeros reales: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("numero real " + (i + 1) + ":");
            numReales = sc.nextInt();
            vector[i] = numReales;
        }

        System.out.println("\nValores del vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}