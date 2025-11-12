//Escribir un programa que muestre los multiplos de 7 menores de 100

package ejercicios_aparte;

public class ejercicio_4 {
    public static void main(String[] args) {

        for (int index = 1; index <= 100; index++){
            if (index % 7 == 0) {
                System.out.println("Multiplos de 7: " + index);
            }
        }
    }
}
