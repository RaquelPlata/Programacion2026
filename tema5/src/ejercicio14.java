//Escribe un programa que, dada una cantidad de euros introducida por teclado y múltiplo de 5,
// muestre los billetes de cada tipo necesarios para alcanzarla usando billetes de 500, 200, 100, 50, 20, 10 y 5 €, con el mínimo número de billetes.
// Por ejemplo, para 145 € el programa indicará 1 billete de 100,
// 2 billetes de 20 y 1 billete de 5; no vale 29 billetes de 5.
import java.util.Scanner;


public class ejercicio14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
        int cantidad = teclado.nextInt();

        if (cantidad <= 0 || cantidad % 5 != 0) {
            System.out.println("La cantidad debe ser mayor que 0 y múltiplo de 5.");
        } else {
            int billetes;

            billetes = cantidad / 500;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 500");
                cantidad = cantidad % 500;
            }

            billetes = cantidad / 200;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 200");
                cantidad = cantidad % 200;
            }

            billetes = cantidad / 100;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 100");
                cantidad = cantidad % 100;
            }

            billetes = cantidad / 50;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 50");
                cantidad = cantidad % 50;
            }

            billetes = cantidad / 20;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 20");
                cantidad = cantidad % 20;
            }

            billetes = cantidad / 10;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 10");
                cantidad = cantidad % 10;
            }

            billetes = cantidad / 5;
            if (billetes > 0) {
                System.out.println(billetes + " billete(s) de 5");
                cantidad = cantidad % 5;
            }
        }
    }
}