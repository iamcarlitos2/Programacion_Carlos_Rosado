import java.util.Scanner;
public class ejercicio11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario que introduzca un numero 
        System.out.println("Introduce un numero");
        int primer_numero = sc.nextInt();
        System.out.println("Introduce un segundo numero");
        int segundo_numero = sc.nextInt();

        System.out.println("Vamos a comprobar que numero es mas grande que el otro....");

        if (primer_numero > segundo_numero) {
            System.out.println(primer_numero + "es el mayor");
        } else {
            System.out.println("El segundo numero es el mayor");
        }
    }
}