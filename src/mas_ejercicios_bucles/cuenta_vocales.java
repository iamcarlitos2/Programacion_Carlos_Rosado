//solicitar una cadena y mostrar el numero de vocales que tiene

package mas_ejercicios_bucles;
import java.util.Scanner;
public class cuenta_vocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = "";
        int contador = 0;
        System.out.println("Introduce una palabra: ");
        cadena = sc.nextLine().toLowerCase();

        for (int index = 0; index < cadena.length(); index++) {
            char c = cadena.charAt(index);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;

            }
        }
        System.out.println("Numero de vocales: " + contador);
    }
}
