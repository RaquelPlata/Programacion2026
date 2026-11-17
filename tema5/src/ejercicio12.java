import java.util.Scanner;

public class ejercicio12 {
    static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                double A;
                int B;
                double resultado = 1;

                System.out.println("Introduce la base:");
                A = sc.nextDouble();

                System.out.println("Introduce el exponente:");
                B = sc.nextInt();

                for (int i = 1; i <= B; i++) {
                    resultado = resultado * A;
                }

                System.out.println("El resultado es: " + resultado);


    }
}

