import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una calificacion numerica entre el 0 y el 10: ");
        double calificacion = sc.nextDouble();
        if (!(calificacion < (double)0.0F) && !(calificacion > (double)10.0F)) {
            if (calificacion < (double)3.0F) {
                System.out.println("Muy deficiente");
            } else if (calificacion < (double)5.0F) {
                System.out.println("Insuficiente");
            } else if (calificacion < (double)6.0F) {
                System.out.println("Bien");
            } else if (calificacion < (double)9.0F) {
                System.out.println("Notable");
            } else if (calificacion >= (double)9.0F) {
                System.out.println("Sobresaliente");
            }
        } else {
            System.out.println(":x: La calificacion debe de estar entre 0 y 10");
        }

    }
}
