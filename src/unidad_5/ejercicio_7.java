//Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando
//cuántos son positivos y cuantos negativos.
package unidad_5;
import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, numero_positivo = 0, numero_negativo = 0;

        for (int index = 1; index <= 10; index++){
            System.out.println("Introduce un numero no nulo:");
            numero = sc.nextInt();

            if (numero < 0) {
                numero_negativo++;
                System.out.println("Se ha introducido " + numero_negativo + " numeros negativos");
            } else {
                numero_positivo++;
                System.out.println("Se ha introducido " + numero_positivo + " numeros positivos");
            }
        }
    }
}