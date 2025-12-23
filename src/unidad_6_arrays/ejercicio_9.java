//Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
//enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
//mostrará en qué posiciones del array aparece N
package unidad_6_arrays;
import java.util.Scanner;

public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaramos variables
        int numeros[] = new int[5];
        int N;
        int posicion [] = new int[5];
        int delta = 0;

        //Numeros aleatorios
        //(int)(MIN + Math.random() * (MAX - MIN + 1))

        for (int index = 0; index < numeros.length; index ++) {
            numeros[index] = (int) (1 + Math.random() * (10 - 1 + 1 ));

        }
        System.out.println("Introduce el valor de N: ");
        N = sc.nextInt();

        for (int index = 0; index < numeros.length; index++){

            if (numeros[index] == N){
                posicion[delta] = index;
                delta++;
            }
        }

        for (int index = 0; index < numeros.length; index++) {
            System.out.println("Posicion: " + index +  " valor: " + numeros[index]);
        }
    }
}
