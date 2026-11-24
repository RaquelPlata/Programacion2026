//Escribe un programa que pida diez números reales por teclado, los guarde en un vector y muestre la suma de todos ellos.
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector = new double[10];
        double numReales;
        double suma = 0;

        System.out.println("Introduce los numeros reales: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("numero real " + (i + 1) + ":");
            numReales = sc.nextDouble();
            vector[i] = numReales;
            suma = suma + vector[i];
        }

        System.out.println("La suma de todos los valores es: " + suma);
    }
}