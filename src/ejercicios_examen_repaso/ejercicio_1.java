//Calcula la tarifa en una estacion de esqui. Una estacion de esqui ofrece diferentes precio segun la edad de los visitantes y
//el tiempo de acceso a las pistas.
package ejercicios_examen_repaso;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pase_diario = 50;
        double precio_tarifa;
        String nombre = "";
        int edad = 0;
        
        do {
            //Añadimos los datos que se piden
            System.out.println("Introduce el nombre del visitante: ");
            nombre = sc.nextLine();
            System.out.println("Introduce la edad del visitante: ");
            edad = sc.nextInt();
            //Calculamos las tarifas
            
            if (edad < 6){
                pase_diario = 0;
            } else if (edad >= 6 && edad <= 12) {
                precio_tarifa = (pase_diario / 2);
                System.out.println(precio_tarifa);
            } else if (edad >= 13 && edad <= 17) {
                precio_tarifa = (pase_diario / 0.2 );
                System.out.println(precio_tarifa);
            } else if (edad >= 60) {
                precio_tarifa = (pase_diario / 0.3);
                System.out.println(precio_tarifa);
            } else{

            }
        }while(edad < 0);
    }
}
