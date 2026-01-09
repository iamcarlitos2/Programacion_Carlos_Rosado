//Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
//empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
//información de N personas distintas (valor también introducido por teclado). Para cada
//persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
//guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
//género.

package unidad_6_arrays.ejercicios_C;
import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //N = numero de personas
        int N, genero, salario;
        //contador hombre y mujer
        int contadorH = 0, contadorM = 0;
        int suma_hombres = 0, suma_mujeres = 0;
        int media_hombres = 0, media_mujeres = 0;
        //Introducir el numero de personas
        System.out.print("Intorduce el numero de personas: ");
        N = sc.nextInt();

        //Definimos la matriz
        int personas[][] = new int[N][2];

        //Rellenamos la matriz
        for (int i = 0; i < N; i++) {
            System.out.println("Introduce 0 si es un hombre o 1 si es una mujer");
            genero = sc.nextInt();
            personas[i][0] = genero;

            System.out.println("Introduce el salario: ");
            salario = sc.nextInt();

            personas[i][1] = salario;

        }

        //Recorremos la matriz
        for (int i = 0; i < N; i++){
            if (personas[i][0] == 0){
                contadorH = contadorH + 1;
                suma_hombres += personas[i][1];
            } else {
                contadorM = contadorM + 1;
                suma_mujeres += personas[i][1];
            }
        }

        //Calculamos las medias
        media_hombres = suma_hombres / contadorH;
        media_mujeres = suma_mujeres / contadorM;

        //Mostramos resultados
        System.out.println("Sueldo medio de los hombres: " + media_hombres);
        System.out.println("Suelo medio de las mujeres: " + media_mujeres);
    }
}
