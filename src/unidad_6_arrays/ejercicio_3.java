//Crea un programa que pida diez números reales por teclado, los almacene en un array, y
//luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
package unidad_6_arrays;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[];
        numeros = new int[10];
        int maximo = 0, minimo = 0;

        for (int index = 0; index < numeros.length; index++){
            System.out.println("Introduce un numero: ");
            numeros[index] = sc.nextInt();

            if (numeros[index] > maximo){
                maximo = numeros[index];
            }else if (numeros[index] < minimo){
                minimo = numeros[index];
            }
        }
        System.out.println("El maximo es: " + maximo);
        System.out.println("El minimo es: " + minimo);

    }
}
