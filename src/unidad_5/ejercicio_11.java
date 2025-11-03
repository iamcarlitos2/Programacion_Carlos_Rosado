//Realiza un programa que sume independientemente los pares y los impares de los números
//comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
package unidad_5;
import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, numeros_pares=0, numeros_impares=1;

        for(int index = 100; index <= 200; index++){
            if (index % 2 == 0){
                numeros_pares += index;
            } else {
                numeros_impares += index;
            }
        }
        System.out.println("La suma de numeros pares es: " + numeros_pares);
        System.out.println("La suma de numeros impares es: " + numeros_impares);
    }
}
