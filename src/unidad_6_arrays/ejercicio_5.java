//Crea un programa que pida veinte números reales por teclado, los almacene en un array y
//luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores
package unidad_6_arrays;
import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[20];
        int media;
        int sumatorio = 0;

        for (int index = 0; index < numeros.length; index++) {
            System.out.println("Introduce un numero: ");
            numeros[index] = sc.nextInt();

            sumatorio = sumatorio + numeros[index];
        }
        media = sumatorio / numeros.length;
        System.out.println("La media es: " + media);
    }
}
