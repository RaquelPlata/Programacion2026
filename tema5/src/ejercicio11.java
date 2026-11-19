//Escribe un programa que sume por separado los números pares y los impares comprendidos
// entre 100 y 200, y muestre las dos sumas.

public class ejercicio11 {
    public static void main(String[] args) {
        int numPares=0;
        int numImpares = 0;

        for (int i=100 ;i<=200 ; i++){
            if(i % 2 == 0){
                numPares += i;
            }else {
                numImpares += i;
            }
        }
        System.out.println("La suma de los numeros pares es :"+numPares);
        System.out.println("La suma de los numeros impares es :"+numImpares);

    }
}