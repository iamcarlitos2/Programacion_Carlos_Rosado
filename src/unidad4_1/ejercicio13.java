package unidad4_1;

import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Vamos a pedir al usuario que nos introduzca dos numeros
        System.out.println("Introduceme un primer numero:");
        //Leemos el primer numero
        int primer_numero = sc.nextInt();
        //Pedimos el segundo numero y lo leemos
        System.out.println("Introduce un segundo numero");
        int segundo_numero = sc.nextInt();

        //Hacemos las comprobaciones de los numeros para que nos diga la forma ascendente
        if (primer_numero < segundo_numero) {
            System.out.println("Numeros en forma ascendente: " + primer_numero + "," + segundo_numero);
        } else if (primer_numero > segundo_numero) {
            System.out.println("Numeros en forma ascendente: " + segundo_numero + "," + primer_numero);
        } else{
            System.out.println("Ambos numeros son iguales.");
        }
    }
}
