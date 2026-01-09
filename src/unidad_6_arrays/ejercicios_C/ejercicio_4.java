//Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
//1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
//programa mostrará la nota mínima, máxima y media de cada alumno.
package unidad_6_arrays.ejercicios_C;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Definimos la matriz
        float matriz[][] = new float[4][5];
        float maxima = 0, minima = 0, media = 0;

        //Rellenamos la matriz
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++) {
                //Pedimos al usuario que ingrese las notas
                System.out.print("Introduce las notas del alumnmo: " + (i + 1) + " y la asignatura " + (j + 1) + " :");
                matriz[i][j] = sc.nextFloat();
            }
        }
        //Recorremos la matriz
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                if (matriz[i][j] > maxima) {
                    maxima = matriz[i][j];
                } else if(matriz[i][j] < minima){
                    minima = matriz[i][j];
                }
                media = media + matriz[i][j];
            }
            //Calculas la media
            media = media / 5;
            System.out.println("Alumno" + (i + 1) + " :");
            System.out.println("La nota maxima es: " + maxima);
            System.out.println("La nota minima es: " + minima);
            System.out.println("La nota media es: " + media);

            media = 0;
            maxima = 0;
            minima = 10;

        }


    }
}
