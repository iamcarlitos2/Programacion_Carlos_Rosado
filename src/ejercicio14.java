import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Vamos a pedir que nos introduzan los dos numeros y leeremos estos dos numeros
        System.out.println("Introduce un numero:");
        int primer_numero = sc.nextInt();
        System.out.print("Introduce un segundo numero:");
        int segundo_numero = sc.nextInt();

        //Vamos a ver mediante una condicional, cual de los dos es el mayor cual es el menor o si son iguales.
        if (primer_numero < segundo_numero) {
            System.out.println("El segundo numero que has introducido es el mayor.");
        } else if (primer_numero == segundo_numero) {
            System.out.println("Ambos numeros son iguales");
        } else if (primer_numero > segundo_numero) {
            System.out.println("EL primer numero que has introducido es el mayor.");
        }
    }
}
