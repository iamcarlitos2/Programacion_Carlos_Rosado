import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Vamos a pedir al usuario que nos introduzca 3 numeros diferentes y leeremos estos
        System.out.println("Introduce un primer numero:");
        int primer_numero = sc.nextInt();
        System.out.println("Introduce un segundo numero:");
        int segundo_numero = sc.nextInt();
        System.out.println("Introduce un tercer numero");
        int tercer_numero = sc.nextInt();

        //Vamos a realizar las condicionales para ver cual es el mayor de ellos.
        if (primer_numero > segundo_numero && primer_numero> tercer_numero) {
            System.out.println(primer_numero + " es el numero mayor");
        } else if (segundo_numero > primer_numero && segundo_numero > tercer_numero) {
            System.out.println(segundo_numero + " es el numero mayor");
        } else if (tercer_numero > primer_numero && tercer_numero > segundo_numero) {
            System.out.println(tercer_numero + " es el numero mayor");
        } else if (primer_numero == segundo_numero && primer_numero == tercer_numero && segundo_numero == tercer_numero){
            System.out.println("Los numeros no pueden ser iguales");
        }
    }
}