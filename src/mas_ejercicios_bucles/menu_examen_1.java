package mas_ejercicios_bucles;
import java.util.Scanner;

public class menu_examen_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double C;
        int opcion, numero;

        do {
            System.out.println("--MENU--");
            System.out.println("Elige una de las siguientes opciones: \n 1) Conversor de temperatura \n 2) Clasificación de numero \n 3) Introduce dos numeros e indica cual es mayor menor o si son iguales \n 4) Salir");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Introduce la temperatura en grados celsius para que sea convertida a farent heigths");
                C = sc.nextDouble();
                double FH = (C * 9/5 ) + 32;

                System.out.println("La conversion a farent heigths es: " + FH);

            } else if (opcion == 2) {
                System.out.println("Introduce un numero para clasificarlo: ");
                numero = sc.nextInt();

                if (numero == 0){
                    System.out.println("El numero es 0");
                } else if (numero >= 1) {
                    System.out.println("El numero es positivo");
                }else{
                    System.out.println("El numero es negativo");
                }
            } else if (opcion == 3) {
                int numero_1 = 0;
                int numero_2 = 0;
                System.out.println("Introduce el primer numero: ");
                numero_1 = sc.nextInt();
                System.out.println("Introduce el segundo numero: ");
                numero_2 = sc.nextInt();

                if (numero_1 > numero_2) {
                    System.out.println("El primer numero es mayor que el segundo");
                } else if (numero_2 > numero_1) {
                    System.out.println("El segundo numero es mayor que el primero");
                } else {
                    System.out.println("Ambos numeros son iguales");
                }
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa..");
            }
        } while (opcion != 4);
    }
}
