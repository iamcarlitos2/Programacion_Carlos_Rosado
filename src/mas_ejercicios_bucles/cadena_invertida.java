//Pedimos una cadena
//mostrar la cadena invertida
package mas_ejercicios_bucles;
import java.util.Scanner;

public class cadena_invertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena;
        System.out.println("Introduce una cadena: ");

        cadena = sc.nextLine().toLowerCase();

        String cadena_invertida = "";

        for (int index = cadena.length() - 1; index >= 0; index--){
            cadena_invertida = cadena_invertida + cadena.charAt(index);
        }

        System.out.println("Cadena invertida: " + cadena_invertida);
    }
}
