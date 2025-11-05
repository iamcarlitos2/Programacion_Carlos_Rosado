//Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
//termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
package unidad_5;
import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota, nota_diez = 0;

        System.out.println("Introduce una nota (si escribes -1 termina el bucle)");

        do {
            nota = sc.nextInt();

            if (nota == 10) {
                nota_diez++;
                System.out.println("He encontrado: " + nota_diez + " nota con valor de 10");

            }
        } while (nota != -1);
        System.out.println("Error, has introducido una nota incorrecta");
    }
}
