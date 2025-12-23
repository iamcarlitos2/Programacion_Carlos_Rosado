//Programa que saque por pantalla los números primos menores que n.
// Siendo n un número entero positivo introducido por teclado.
// Debes asegurarte que n es positivo.
package mas_ejercicios_bucles;
import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int N;
         boolean numero_primo = false;

        System.out.println("Introduce el valor de N");
        N = sc.nextInt();

        if (N < 0){
            System.out.println("El valor de N debe de ser positivo");
        } else{
            for (int index = 2; index <= N; index++){
                 numero_primo = true;

                 for (int divisor = 2; divisor <= index / 2; divisor++){
                     if (index % divisor == 0 ) {
                         numero_primo = false;
                     }
                 }
                if (numero_primo) {
                    System.out.println("El numero" + index + "es primo");
                }
            }
        }
    }
}
