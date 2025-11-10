//Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último
//dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
//El total de números introducidos, excluido el 0.
//El total de números fallados.
package unidad_5;
import java.util.Scanner;
public class ejercicio_17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int numero, ultimo_numero, numeros_introducidos, numeros_fallados;
         ultimo_numero = 0;
         numeros_introducidos = 0;
         numeros_fallados = 0;

         do {
             System.out.println("Introduce un numero (si el numero es 0 se corta el bucle)");
             numero = sc.nextInt();

             if (numero > ultimo_numero){
                 System.out.println("Continua introduciendo numeros:");
                 numeros_introducidos++;
                 ultimo_numero = numero; //hacemos que el numero introducido pase a ser el ultimo numero.
                 //System.out.println(ultimo_numero); //hago un print para ver si me coge el valor del numero anterior
             } else if (numero != 0 &&  ultimo_numero <= 0) {
                 System.out.println("Has introducido un numero erroneo");
                 numeros_fallados++;
             }

         } while(numero != 0);

        System.out.println("He encontrado un total de: " + numeros_introducidos + " numeros introducidos.");
        System.out.println("He encontrado un total de: " +  numeros_fallados + " numeros fallados.");

    }
}
