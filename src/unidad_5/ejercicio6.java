package unidad_5;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativo, numero = 0;

        for (int i = 1; i <= 10; i++) { //Haremos que el bucle se repita 10 veces, por eso lo inicializamos en 1
            System.out.println("Ingresa un numero no nulo");
            negativo = sc.nextInt();
            if (negativo < 0) {
                numero++;
            }

            System.out.println("Has introducido " + numero + " números negativos.");
        }
    }
}