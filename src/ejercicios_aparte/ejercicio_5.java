//Programa que lee las notas de 10 examenes de una asignatura:
//Las tres primeras notas ponderan el 20 por ciento de la nota final, las tres segundas ponderan el 30 por ciento de la nota final
//Y las 4 ultimas ponderan el 50 por ciento de la nota final

package ejercicios_aparte;
import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas, suma20 = 0, suma30 = 0, suma50 = 0;

        for (int index = 1; index <= 10; index++){

            System.out.println("Intrduce las notas de los alumnos: ");
            notas = sc.nextDouble();

            if (index <= 3) {
                suma20 = suma20 + notas;
            } else if (index <= 6) {
                suma30 = suma30 + notas;
            } else {
                suma50 = suma50 + notas;
            }
        }

        double nota_final = (suma20 / 3) * 0.2 + (suma30 / 3) * 0.3 + (suma50 / 4) * 0.5;
        System.out.println("La nota final es: " +nota_final);
    }
}
