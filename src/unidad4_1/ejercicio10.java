package unidad4_1;

import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario que introduzca un numero
        System.out.println("Introduce un primer numero:");
        int primer_numero = sc.nextInt();
        System.out.println("Introduce un segundo numero:");
        int segundo_numero = sc.nextInt();

        int suma = primer_numero + segundo_numero;
        int resta = primer_numero -  segundo_numero;
        int producto = primer_numero * segundo_numero;
        int division;

        if (segundo_numero == 0) {
             division = 0; //Le decimos que tamien esta disponible la division entre 0
        } else {
             division = (primer_numero/segundo_numero);
        }

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("El producto es: " + producto);
        System.out.println("La división es: " + division);

    }
}
