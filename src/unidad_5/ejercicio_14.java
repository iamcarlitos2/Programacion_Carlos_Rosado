package unidad_5;
import java.util.Scanner;

public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad, billete500 = 0, billete200 = 0, billete100 = 0, billete50 = 0, billete20 = 0,  billete10 = 0, billete5 = 0;

        System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
        cantidad = sc.nextInt();

        if (cantidad <= 0 || cantidad % 5 != 0) {
            System.out.println("La cantidad debe ser un múltiplo positivo de 5.");
        } else {
            System.out.println(("La cantidad que has introducido es incorrecta"));
        }



        int resto = cantidad;


    }
}
