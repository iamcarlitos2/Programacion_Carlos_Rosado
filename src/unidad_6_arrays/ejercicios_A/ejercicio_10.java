//Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
//Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
//mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
//por debajo de la media.
package unidad_6_arrays.ejercicios_A;
import java.util.Scanner;
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaro variables
        int N;

        System.out.println("Introduce el valor de N: ");
        N = sc.nextInt();

        double alturas[] = new double[N];

        double altura = 0;
        double acumulador = 0;

        for (int index = 0; index < alturas.length; index++) {
            System.out.println("Introduce la altura del usuario: ");
            altura = sc.nextDouble();

            alturas[index] = altura;
            acumulador = acumulador + alturas[index];
        }
        double altura_maxima = alturas[0], altura_minima = alturas[0];
        double altura_media = 0;

        for (int index = 0; index < alturas.length; index++) {
            if (alturas[index] > altura_minima) {
                altura_maxima = alturas[index];
            }
            if (alturas[index] < altura_minima) {
                altura_minima = alturas[index];
            }
        }

        altura_media = acumulador / alturas.length;

        int contador = 0;

        for (int index = 0; index < alturas.length; index++) {
            if (alturas[index] < altura_media) {
                contador++;
            }
        }
        System.out.println("Altura media: " + altura_media);
        System.out.println("Altura maxima: " + altura_maxima);
        System.out.println("Altura minima: " + altura_minima);
        System.out.println("Hay " + contador + " personas por debajo de la media");
    }
}
