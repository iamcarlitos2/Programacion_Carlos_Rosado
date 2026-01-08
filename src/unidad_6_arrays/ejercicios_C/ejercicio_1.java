//Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
//y luego muestre la matriz por pantalla.
package unidad_6_arrays.ejercicios_C;

public class ejercicio_1 {
    public static void main(String[] args) {
        //Definimos la matriz
        int [][] matriz = new int[5][5];
        int contador = 1;

        //Rellenamos la matriz
        for (int index = 0; index < 5; index++){
            //Recorremos las columnas
            for (int delta = 0; delta < 5; delta++) {
                matriz[index][delta] = contador;
                contador = contador + 1;
            }
        }

        //Mostramos la matriz por pantalla
        for (int index = 0; index < 5; index++){
            for (int delta = 0; delta < 5; delta++){
                System.out.print(matriz[index][delta] + " ");
            }
            //Hacemos salto de linea
            System.out.println();
        }
    }
}
