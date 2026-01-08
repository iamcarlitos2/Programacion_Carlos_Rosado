//Crea un programa que pida veinte números enteros por teclado, los almacene en un array y
//luego muestre por separado la suma de todos los valores positivos y negativos
package unidad_6_arrays.ejercicios_A;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[20];
        int maximo = 0, minimo = 0;

        for (int index = 0; index < numeros.length; index++){
            System.out.println("Introduce un numero: ");
            numeros[index] = sc.nextInt();

            if (numeros[index] >= maximo){
                maximo = maximo + numeros[index];

            } else{
                minimo = minimo + numeros[index];

            }
        }
        System.out.println("Suma de los positivos: " + maximo);
        System.out.println("Suma de los negativos: " + minimo);
    }
}
