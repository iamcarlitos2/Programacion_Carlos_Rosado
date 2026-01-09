//Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
//multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla
package unidad_6_arrays.ejercicios_C;

public class ejercicio_2 {
    public static void main(String[] args) {
        //definimos la matriz
        int [][] matriz = new int[10][10];

        //Recorremos la matriz
        for (int index = 0; index < 10; index++){
            for (int delta = 0; delta < 10; delta++){
                //Rellenamos la matriz
                matriz[index][delta] = (index + 1) * (delta + 1);
                //Mostramos la matriz por pantalla
                System.out.print(matriz[index][delta] + "\t");
            }
            //Hacemos el salto de linea
            System.out.println();
        }
    }
}
