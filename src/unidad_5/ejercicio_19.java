//Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces
//igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá
//escribir un único asterisco
package unidad_5;
import java.util.Scanner;

public class ejercicio_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Escribe un numero: ");
        numero = sc.nextInt();

        if (numero <= 0 ) {
            System.out.print("*");
        } else {
            for (int index = 1; index <= numero; index++){
                System.out.print("*");
            }
        }
    }
}
