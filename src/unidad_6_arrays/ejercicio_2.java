// Crea un programa que pida diez números reales por teclado, los almacene en un array, y
//luego muestre la suma de todos los valores.
package unidad_6_arrays;
import java.util.Scanner;
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumatorio = 0;
        int numeros[];
        numeros = new int[10];

        for (int index = 0; index < numeros.length; index++) {
            System.out.println("Introduce un numero: ");
            numeros[index] = sc.nextInt();

            sumatorio = sumatorio + numeros[index];
        }
        System.out.println("La suma de todos los valores es: " + sumatorio);
    }
}
