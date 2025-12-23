package examen_2024;
import java.util.Scanner;

public class menu_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grados_celsius = 0;
        int opcion = 0, numero;

        System.out.println("---MENU PRINCIPAL---");
        System.out.println("Elige una de las siguientes opciones: \n 1) Conversor de temperatura \n 2) Clasificacion de numeros \n 3) Salir");

        do {


            if (opcion == 1) {
                System.out.println("Introduce la temperatura en grados celsius para convertirla en faren heigths: ");
                grados_celsius = sc.nextInt();
                double FH = (grados_celsius * 9 / 5) + 32;

                System.out.println("La conversion son: " + FH + " faren heigths");
            } else if (opcion == 2) {
                System.out.println("Introduce un numero");
                numero = sc.nextInt();

                if (numero == 0) {
                    System.out.println("El numero es cero");
                } else if (numero > 0) {
                    System.out.println("El numero es positivo");
                }else{
                    System.out.println("El numero es negativo");
                }
            } else if (opcion == 3) {
                System.out.println("Saliendo...");
            }
        } while (opcion != 3);
    }
}
