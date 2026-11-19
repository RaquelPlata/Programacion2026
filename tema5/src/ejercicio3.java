//Escribe un programa que muestre los números pares comprendidos
// entre el 1 y el 200. Esta vez utiliza
// un contador que suba de 1 en 1 y comprueba cada número.

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Mostrar los numeros pares comprendidos entre 1 y 200");
        for (int i = 1 ; i<=200; i++){
            if(i %2==0){
                System.out.println(i);
            }
        }

    }
}