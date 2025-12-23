//Escribe una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo.
// Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
// la media, el número de alumnos y cuántos son mayores de edad.
package ejercicios_aparte;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad, mayores = 0, numero_alumnos = 0, media = 0, total_edad = 0;

        do {
            System.out.println("Introduce la edad de los alumnos: ");
            edad = sc.nextInt();

            if (edad >= 0) {
                edad = edad + total_edad;
                numero_alumnos ++;
                media = total_edad / numero_alumnos;

                if (edad >= 18) {
                    mayores++;

                }
            }

        } while (edad >= 0);

        System.out.println("La media de las edades es: " + media);
        System.out.println("El numero total de alumnos es: " + numero_alumnos);
        System.out.println("Alumnos mayores de edad: " + mayores);
    }
}
