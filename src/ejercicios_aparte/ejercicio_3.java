//Una empresa de control de árboles necesita saber cuál es el árbol más alto.
//Para ello se introducen por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos cuando se utilice -1 como altura).
//0Los árboles se identifican mediante etiquetas con números únicos correlativos, comenzando en 0.
package ejercicios_aparte;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arbol, altura_arbol, altura_maxima = 0, altura_minima = 0, etiqueta_arbol = 0;

        do {
            System.out.println("Introduce la altura del: " + etiqueta_arbol + " en centimentros.");
            altura_arbol = sc.nextInt();

            if (altura_arbol == -1){
                System.out.println("Introduce una altura valida.");
                etiqueta_arbol++;

            }

        } while(altura_arbol != -1);
    }
}
