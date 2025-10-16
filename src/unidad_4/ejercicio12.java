package unidad_4;

import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario que introduzca un numero
        System.out.println("Introduce un numero:");
        //Leemos el numero
        int numero = sc.nextInt();

        //Hacemos la condicicon
        if (numero >= 0) {
            System.out.println("El numero que has introducido es positivo");
        } else {
            System.out.println("El numero que has introducido es negativo");
        }

   }
}
