//Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
//utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
//cuántos valores del array son igual o superiores a R.
package unidad_6_arrays;
import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double reales[] = new double[100];
        double R;
        int cont_reales = 0;

        System.out.println("Introduce un valor: ");
        R = sc.nextDouble();
        for (int index = 0; index < reales.length; index++){
             reales[index] = Math.random();
             if (reales[index] >= R) {
                 cont_reales++;
             }
        }
        System.out.println("Valores iguales o susperiores: " + cont_reales);
    }

}
