//Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza
//los números desde A hasta B e indicar cuantos hay que sean pares.
package unidad_5;
import java.util.Scanner;

public class ejercicio_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, pares = 0;

        do {
            System.out.println("Introduce el valor de A: ");
            A = sc.nextInt();

            System.out.println("Introduce el valor de B: ");
            B = sc.nextInt();

            if (A > B || A == B) {
                System.out.println("Introduce otro numero: ");
            }
        } while(A > B);

        for (int index = A; index <= B; index++){
            System.out.println(index);

            if (index % 2 == 0){
                pares++;
            }

        }
        System.out.println("Entre A y B hay: " + pares + " numeros pares.");

    }
}
