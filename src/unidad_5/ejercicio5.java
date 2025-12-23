package unidad_5;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        int factorial = 1;

        for (int index = 1; index <= numero; index++) { //El index en este caso seria el acumulador.
            factorial = factorial * index;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
