//Crea un programa que cree dos arrays enteros de tamaño 100. Luego introducira en elprimer array todos los valores del 1 al 100.
//Por ultimo debera copiar todos los valores del primer array al segundo array en orden inverso y mostrar ambos por pantalla.
package unidad_6_arrays;
import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos las variables
        int primer_array[] = new int[100];
        int segundo_array[] = new int[100];

        for (int index = 0; index < 100; index++){
            primer_array[index] = index + 1;
            System.out.println("Primer array: " + primer_array[index]);
        }

        for (int index = 0; index < 100; index++){
            segundo_array[index] = primer_array[99 - index];
            System.out.println("Segundo array: " + segundo_array[index]);
        }

    }
}
