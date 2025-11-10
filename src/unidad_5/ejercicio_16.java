//Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
package unidad_5;
import java.util.Scanner;

public class ejercicio_16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int numero;
         boolean numero_primo = false;

         System.out.println("Introdue un numero para saber si es primo");
         numero = sc.nextInt();

         for(int index = 1; index <= numero; index++){
             if (numero % 2 == 0) {
                 numero_primo = true;
             }

             if (numero_primo == true && numero != 1){
                 System.out.println("El numero es primo");
             } else {
                 System.out.println("El numero no es primo");
             }

        }


    }
}
