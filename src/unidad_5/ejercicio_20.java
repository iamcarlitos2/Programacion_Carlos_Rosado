//Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla
//los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su
//valor.
package unidad_5;
import java.util.Scanner;

public class ejercicio_20 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          int N;

        do {
            System.out.println("Introduce el valor de N: ");
            N = sc.nextInt();
            if (N < 0 || N > 20) {
                System.out.println("Introduce otro numero que se encuentre en el rango entre 0 y 20");
            }
        } while (N < 0 || N > 20);

        for (int index = 1; index <= N; index++){
            for (int index2 = 1; index2 <= index; index2++){
                System.out.print(index);

            };
            System.out.println(" ");
        }


    }
}
