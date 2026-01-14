//Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
//mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
//primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
//“Alcocer” mostrará “LIOTARALC”
package unidad_6_arrays.ejercicios_B;
import java.util.Scanner;
public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DEclaramos variables
        String nombre;
        String primer_apellido;
        String segundo_apellido;
        //Pedimos al usuario que introduzca los nombres y apellidos y lo convierta en mayusculas.
        System.out.println("Introduce el nombre de la persona: ");
        nombre = sc.nextLine().toUpperCase().substring(0,3);
        System.out.println("Introduce el primer apellido: ");
        primer_apellido = sc.nextLine().toUpperCase().substring(0,3);
        System.out.println("Introduce el segundo apellido: ");
        segundo_apellido = sc.nextLine().toUpperCase().substring(0,3);
        System.out.println(nombre + primer_apellido + segundo_apellido);
    }
}
