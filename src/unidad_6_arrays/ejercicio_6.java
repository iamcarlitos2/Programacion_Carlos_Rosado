//Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
//escriba M en todas sus posiciones y lo muestre por pantalla
package unidad_6_arrays;
import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int M;

        System.out.println("Introduce el valor de N: ");
        N = sc.nextInt();
        System.out.println("Introduce el valor de M: ");
        M = sc.nextInt();

        int array[] = new int[N];

        for (int index = 0; index < array.length; index++) {
            array[N] = M;
        }
    }
}
