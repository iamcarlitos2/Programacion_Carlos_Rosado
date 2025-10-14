import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario que introduzca la edad
        System.out.print("Introduce tu edad:");
        //leemos la edad
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }
}
