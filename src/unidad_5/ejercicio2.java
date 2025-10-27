package unidad_5;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos las variables.
        for (int i = 1; i<=200; i++) {
            if (i%2 == 0){ //Hacemos el Mod para que divida entre 2 y si el resultado da 0 muestra los pares.
                System.out.println(i);
            }
        }

    }
}