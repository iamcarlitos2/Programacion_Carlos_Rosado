package unidad_5;
import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
        int cantidad = sc.nextInt();

        if (cantidad <= 0 || cantidad % 5 != 0) {
            System.out.println("La cantidad debe ser un múltiplo positivo de 5.");
        } else {
            System.out.println(("La cantidad que has introducido es incorrecta"));
        }

        int[] billetes = {500, 200, 100, 50, 20, 10, 5};
        int[] cantidadBilletes = new int[billetes.length];

        int resto = cantidad;

        for (int i = 0; i < billetes.length; i++) {
            cantidadBilletes[i] = resto / billetes[i];
            resto = resto % billetes[i];
        }

        System.out.println("\nPara obtener " + cantidad + "€ necesitas:");
        for (int i = 0; i < billetes.length; i++) {
            if (cantidadBilletes[i] > 0) {
                System.out.println(cantidadBilletes[i] + " billete(s) de " + billetes[i] + "€");
            }
        }

    }
}
