import java.util.Scanner;

//Escribe un programa que muestre
//los números desde el 1 hasta un número N que se introduce por teclado.
public class ejercicio4 {
    public static void main(String[] args) {
        int n ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        n = sc.nextInt();

        for (int i = 1 ; i<= n ; i++){
            System.out.println(i);
        }
    }
}