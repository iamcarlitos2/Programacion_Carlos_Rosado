//Escriba un programa para mostrar los primeros n términos de la serie de Fibonacci.
package mas_ejercicios_bucles;
import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, numero_anterior = 0, numero_posterior = 1;

        System.out.println("Introduce el numero hasta el que quieres llegar de la serie Fibonacci: ");
        N = sc.nextInt();

        for (int index = 0; index <= N; index++){

            int siguiente_numero = numero_anterior + numero_anterior;

            numero_anterior = numero_posterior;
            numero_posterior = siguiente_numero;


            System.out.println(" " + siguiente_numero);
        }
    }
}
