package mas_ejercicios_bucles;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion, primer_numero, segundo_numero, suma = 0;

        System.out.println("---MENU---");
        System.out.println("Elige unas de las siquientes opciones: \n 1-Sumar dos numeros \n 2-Salir");
        opcion = sc.nextInt();

        if (opcion==1){
            System.out.println("Introduce por teclado los numeros que quieras sumar");
            System.out.println("Introduce el primer numero: ");
            primer_numero = sc.nextInt();
            System.out.println("Introduce el segundo numero");
            segundo_numero = sc.nextInt();

            suma = (primer_numero +  segundo_numero);
            System.out.println("El valor de la suma es: " + suma);
        } else if (opcion == 2) {
            System.out.println("Saliendo del programa");
        } else {
            System.out.println("El numero introducido no es correcto.");
        }
    }
}
