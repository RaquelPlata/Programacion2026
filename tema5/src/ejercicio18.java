//Escribe un programa que calcule la suma de los cuadrados de los 5 primeros números naturales: 1² + 2² + 3² + 4² + 5².

public class ejercicio18 {

    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            int cuadrado = i * i;
            suma = suma + cuadrado;
        }

        System.out.println("La suma de los cuadrados del 1 al 5 es: " + suma);
    }
}
