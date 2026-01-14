// Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
//no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
//el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
//palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
package unidad_6_arrays.ejercicios_B;
import java.util.Scanner;
public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definimos la variable
        String frase;
        String fraseInvertida = "";
        //Pedimos al usuario que introduzca la frase
        System.out.println("Introduzca una frase: ");
        frase = sc.nextLine();

        //Recorremos la frase
        for (int i = frase.length() - 1; i >= 0; i--) {
            //Añadimos el caracter al final
            fraseInvertida += frase.charAt(i);
        }
        //Leemos la frase invertida
        System.out.println(fraseInvertida);

        if (frase.equals(fraseInvertida)) {
            System.out.println("Es un palindromo!");
        } else {
            System.out.println("No es un palindromo");
        }
    }
}
