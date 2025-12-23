//Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
//todos los valores desde P hasta Q, y lo muestre por pantalla.
package unidad_6_arrays;
import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P;
        int Q;
        System.out.println("Introduce el valor de P: ");
        P = sc.nextInt();
        System.out.println("Introduce el valor de Q: ");
        Q = sc.nextInt();

        int tamaño = ( Q - P ) + 1;
        int numeros[] = new int[tamaño];



        for (int index = 0 ; index < tamaño; index++) {
            numeros[index] = P;
            P++;
        }
    }

}
