import java.util.Scanner;

//Escribe un programa que lea 10 números y después muestre
// cuántos son positivos y cuántos negativos.
public class ejercicio7 {
    public static void main(String[] args) {
        int n= 0;
        int negativo = 0;
        int positivo = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce 10 numeros;");

        for (int i=1; i <= 10 ; i++){
            System.out.println("Número "+ i + ":");
            n = sc.nextInt();
            if ( n>0){
                positivo ++;
            }else if (n<0){
                negativo++;
            }
        }

        System.out.println("Hay " + negativo + " números negativos");
        System.out.println("Hay " + positivo + " números positivos");
    }
}