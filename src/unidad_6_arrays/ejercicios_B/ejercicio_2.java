// Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
//además de si son iguales sin diferenciar entre mayúsculas y minúsculas
package unidad_6_arrays.ejercicios_B;
import java.util.Scanner;
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //definimos las variables
        String cadena;
        String cadena1;
        //Pedimos al usuario que introduzca las cadenas
        System.out.println("Introduce una cadena de texto: ");
        cadena = sc.nextLine();
        System.out.println("Introduce otra cadena de texto:");
        cadena1 = sc.nextLine();

        //Comparamos si las cadenas son iguales
        if (cadena.equals(cadena1)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas no son iguales.");
        }
    }
}
