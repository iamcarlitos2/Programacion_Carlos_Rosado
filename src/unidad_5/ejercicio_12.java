//Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
//potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
//pantalla
package unidad_5;
import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        int resultado = 1;// Pongo 1 ya que cualquier potencia elevada a 0 es 1

        System.out.println("Introduce el valor de A");
        A = sc.nextInt();
        System.out.println("Introduce el valor de B");
        B = sc.nextInt();

        for (int index = 1; index <= B; index++) {
            resultado *= A;
        }
        System.out.println(A + " Elevado a " + B + " es igual a: " + resultado);
    }
}
