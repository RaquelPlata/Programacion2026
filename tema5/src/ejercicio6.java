import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        boolean hay_Negativo = false;

        System.out.println("Introduce 10 numeros: ");

        for (int i=1; i<= 10 ; i++){
            System.out.print("Numero " + i +":");
            n = sc.nextInt();
        }
        if( n<0){
            hay_Negativo = true ;
        }
        if(hay_Negativo){
            System.out.println("Si se ha introducido algun numero negativo");
        }else  {
            System.out.println("No se ha introducido numeros negativo");
        }

    }
}