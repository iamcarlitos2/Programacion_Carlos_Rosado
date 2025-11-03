//Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta
//adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el
//usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado).
package unidad_5;
import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, numero_minimo = 1, numero_maximo = 100;
        String repuesta_usuario;
        System.out.println("Piensa un numero  entre el 1 y el 100");

        do {
            numero = (numero_minimo + numero_maximo) / 2; //Hacemos la division de los numeros para ver cual es el punto medio
            System.out.println("¿El numero que has pensado es: " + numero + " ?");
            System.out.println("Introduce si es mayor, menor o igual");
            repuesta_usuario = sc.nextLine();

            if (repuesta_usuario.equals("mayor")) {
                numero_minimo = numero + 1; //si el numero es mayor subo el minimo
            } else if (repuesta_usuario.equals("menor")) {
                numero_maximo = numero - 1; //Si el numero es menor, hya que bajar el maximo
            }
        } while (!repuesta_usuario.equals("igual"));
        System.out.println("Tu numero era: " + numero);

    }
}
