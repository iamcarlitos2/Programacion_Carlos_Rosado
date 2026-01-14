//Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
//cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
//mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
//Nº de A's: 3
//Nº de E's: 1
//Nº de I's: 2
//Nº de O's: 0
//Nº de U's: 0
package unidad_6_arrays.ejercicios_B;
import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos varibales
        String frase;
        //Pedimos al usuario que introuzca la frase
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();
        //Hacemos un contador de vocales
        int vocalA = 0;
        int vocalE = 0;
        int vocalI = 0;
        int vocalO = 0;
        int vocalU = 0;
        //Recorremos la frase
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            switch (c){
                case 'a':
                    vocalA++;
                    break;
                case 'e':
                    vocalE++;
                    break;
                case 'i':
                    vocalI++;
                    break;
                case 'o':
                    vocalO++;
                    break;
                case 'u':
                    vocalU++;
                    break;
            }

        }
        //Mostramos las vocales
        System.out.println("Nº de A's: " + vocalA);
        System.out.println("Nº de E's: " + vocalE);
        System.out.println("Nº de I's: " + vocalI);
        System.out.println("Nº de O's: " + vocalO);
        System.out.println("Nº de U's: " + vocalU);

    }
}
