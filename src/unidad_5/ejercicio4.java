package unidad_5;
import java.util.Scanner;

public class ejercicio4 {
   public static void main(String[] args) {
        //Definimos el scanner
       Scanner sc = new Scanner(System.in);

       //Declaramos las variables
       int contador, N;
       contador = 1;
       //Pedimos al usuario que nos introduzca el numero N
       System.out.print("Introduce el valor del numero N:");
       N = sc.nextInt(); //Leemos el valor del numero N

       while (contador <= N) {
           System.out.println("Numero:" + contador);
           contador++;
       }
    }
}
