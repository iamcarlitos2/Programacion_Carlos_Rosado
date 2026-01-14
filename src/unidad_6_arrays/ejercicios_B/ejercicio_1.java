//Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
//de la cadena en una línea distinta.
package unidad_6_arrays.ejercicios_B;
import java.util.Scanner;
public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creamos la variable string
        String cadena;

        //Pedimos al usuario que introduzca la cadena
        System.out.println("Introduce una cadena de texto: ");
        cadena = sc.nextLine();

        //Dividimos la cadena en palabras
        String[] palabras = cadena.split("");
        //Recorremos la cadena
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
