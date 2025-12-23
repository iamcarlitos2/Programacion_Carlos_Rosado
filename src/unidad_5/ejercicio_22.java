//Realiza un programa que pida un número y construya por pantalla su pirámide
package unidad_5;
import java.util.Scanner;

public class ejercicio_22 {
    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingresa un numero para realizar tu piramide: ");
            numero = sc.nextInt();

            if (numero <= 0) {
                System.out.println("Elige otro numero");
            }
        } while (numero <= 0);

        for (int index = 1; index <= numero; index++) {
            for (int index2 = numero; index2 >= index; index2--) {
                System.out.print(" ");
            } for (int index3 = 1; index3 <= (2 * 1 - index); index3++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
