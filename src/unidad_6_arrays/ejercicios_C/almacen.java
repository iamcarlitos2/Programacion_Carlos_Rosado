//Se debe hacer una vez al año un inventario valorizado del stock de piezas de ordenador que hay en
//los almacenes de una fabrica. Se sabe que la industria cuenta con M almacenes y N piezas.
//Implementar un programa, que llene la matriz inventario de M x N a la que llamaremos stock,
//donde ( M representa las filas / almacenes) y ( N representa las columnas / piezas), un vector de N
//elementos llamado nombres donde se almacenarán los nombres de las piezas y un vector llamado
//precios de N elementos con los precios de cada una de las piezas

//• Dado un almacén (seleccionado por el usuario) indicar Valor total de cada pieza.
//• Valor total de cada almacén, se debe mostrar todos los almacenes con su valor total.
//• Total general, valor de todas las piezas de todos los almacenes.
//• Indicar almacén y pieza con stock cero.

package unidad_6_arrays.ejercicios_C;
import java.util.Scanner;

public class almacen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //M = numero de almacenes
        //N = numero de piezas
        int M, N;
        int valortotalpieza = 0;

        System.out.println("Introduce el numero de almacenes: ");
        M = sc.nextInt();
        System.out.println("Introduce el numero de piezas: ");
        N = sc.nextInt();

        sc.nextLine();
        //Definimos la matriz
        int stock[][] = new int[M][N];
        //Definimos los nombres de las piezas
        String nombre[] = new String[N];
        //Definimos el precio de las piezas
        double precio[] = new double[N];

        //Rellenamos el vector de los nombres
        for (int i = 0; i < N; i++){
            System.out.println("Introduce el nombre de la pieza: " + (i+1));
            nombre[i] = sc.nextLine();
        }

        //Rellenamos el vector de los precios
        for (int i = 0; i < N; i++){
            System.out.println("Introduce el precio de: " + nombre[i]);
            precio[i] = sc.nextDouble();
        }

        //Rellenamos la matriz del stock, sabiendo cuantos productos que hay en cada almacen
        for (int i = 0; i < M; i++) {
            System.out.println("Almacen: " + (i+1));
            for (int j = 0; i < N; i++) {
                System.out.println("Cantidad de: " + nombre[j]);
                stock[i][j] = sc.nextInt();
            }
        }

    }
}
