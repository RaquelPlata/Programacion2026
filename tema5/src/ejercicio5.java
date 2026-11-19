import java.util.Scanner;

//Escribe un programa que lea un número entero positivo N y calcule
// y muestre su factorial, N!, sabiendo que 0! = 1, 1! = 1, 2! = 2 · 1,
// 3! = 3 · 2 · 1, y en general N! = N · (N − 1) · (N − 2) · … · 2 · 1.
public class ejercicio5 {
    public static void main(String[] args) {
        int n;
        long factorial = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Introduce un número válido");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
                System.out.println(n+"! =" + factorial);

            }

        }
    }
}