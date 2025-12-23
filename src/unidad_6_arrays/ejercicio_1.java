//Crea un programa que pida diez números reales por teclado, los almacene en un array, y
//luego muestre todos sus valores.
package unidad_6_arrays;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numeros[]; //Declaramos numeros como tipo array
        numeros = new int[10]; //Instanciamos numeros a tamaño 10

        for (int index = 0; index < numeros.length; index++){
            System.out.println("Introduce 10 numeros reales: ");
            numero = sc.nextInt();
            numeros[index] = numero;
        }
        for (int index = 0; index < numeros.length; index++){
            System.out.println(numeros[index]);
        }
    }
}
