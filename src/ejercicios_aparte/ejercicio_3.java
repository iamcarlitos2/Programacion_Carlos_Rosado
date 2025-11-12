//Una empresa de control de árboles necesita saber cuál es el árbol más alto.
//Para ello se introducen por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos cuando se utilice -1 como altura).
//0Los árboles se identifican mediante etiquetas con números únicos correlativos, comenzando en 0.
package ejercicios_aparte;
import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arbol, altura_arbol = 0, altura_maxima = 0, altura_minima = 0, arbol_max = 0;

        System.out.println("Introduce la altura de los arboles en centimentros: ");

        do {
            System.out.println("Altura del arbol: ");
            altura_arbol = sc.nextInt();

            if (altura_arbol != -1){
                if(altura_arbol <= 0){
                    System.out.println("Los centimetros introducidos no son validos");
                } else {
                    arbol++;

                    if (arbol == 1){
                        altura_minima = altura_maxima;
                    }

                    if (altura_arbol > altura_maxima){
                        altura_maxima = altura_arbol;
                        arbol_max = arbol;
                    }

                    if (altura_arbol < altura_minima){
                        altura_minima = altura_arbol;
                    }
                }
            }

        } while(altura_arbol != -1);

        System.out.println("total de arboles validos: " + arbol);;
        System.out.println("Altura maxima: " + altura_maxima + "arbol mas alto: " + arbol_max);
        System.out.println("Altura minima: " + altura_minima);
    }
}
