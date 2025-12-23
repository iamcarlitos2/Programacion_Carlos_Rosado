//Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
//introducimos por teclado.
package unidad_5;
import java.util.Scanner;
public class ejercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un numero:");
        numero = sc.nextInt();

        for (int index = 1; index <=numero; index++){
            if (index % 3 == 0) { //Pongo el index porque es el acumulador y es el que va sumando ya que el numero es estatico.
                System.out.println(index);
            }
        }
    }
}
