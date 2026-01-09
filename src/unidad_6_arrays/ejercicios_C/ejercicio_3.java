// Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
//introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
//matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
//menores que cero y cuántos son igual a cero
package unidad_6_arrays.ejercicios_C;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Definimos N y M
        int N, M;
        int mayor = 0, menor = 0, igual = 0;

        //Pedimos por pantalla el calor de N y M
        System.out.println("Introduce el valor de N: ");
        N = sc.nextInt();
        System.out.println("Introduce el valor de M: ");
        M = sc.nextInt();
        //Definimos la matriz
        int [][] matriz = new int[N][M];

        //Rellenamos la matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++){
                //Pedimos al usuario un valor
                System.out.print("Introduce un valor: ");
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] == 0){
                    igual = igual + 1;
                } else if (matriz[i][j] > 0) {
                    mayor = mayor + 1;
                } else{
                    menor = menor + 1;
                }

            }
        }
        //Mostramos cuantos son mayores menores e iguales
        System.out.println("Tenemos: " + mayor + " numeros mayores");
        System.out.println("Tenemos: " + menor + " numeros menores");
        System.out.println("Tenemos: " + igual + " numeros iguales");
    }
}
