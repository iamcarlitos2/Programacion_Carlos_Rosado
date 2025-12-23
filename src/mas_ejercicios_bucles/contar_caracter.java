//Pedir una cadena
//Pedir un caracter
//Mostrar numero de veces que aparece el caracter en la cadena
package mas_ejercicios_bucles;
import java.util.Scanner;
public class contar_caracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena;
        char caracter;
        int contador = 0;
        System.out.println("Introduce una cadena: ");
        cadena = sc.nextLine();
        System.out.println("Introduce un caracter: ");
        caracter = sc.nextLine().charAt(0);

        for (int index = 0; index < cadena.length(); index++){
            char c = cadena.charAt(index);
            if (c == caracter){
                contador++;
            }
        }
        System.out.println("El numero de caracteres son: " + contador);


    }
}
