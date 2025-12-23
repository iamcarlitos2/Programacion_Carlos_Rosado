//. Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y
//luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos.
package unidad_5;
import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, numero_positivo = 0, numero_negativo = 0;

        System.out.println("Introduce un numero (si escribes el 0 se terminara el bucle)");

        do {
            numero = sc.nextInt();;

            if (numero > 0){
                numero_positivo++;
            } else if (numero < 0) {
                numero_negativo++;
            }
        } while (numero != 0);

        System.out.println("Hay " + numero_positivo + " numeros positivos");
        System.out.println("Hay " + numero_negativo + " numeros negativos");
    }
}
