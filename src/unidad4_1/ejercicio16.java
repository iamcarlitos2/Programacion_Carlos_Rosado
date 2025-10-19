package unidad4_1;

import java.util.Scanner;
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Vamos a pedir que introduzca una calificacion del 0 al 10
        System.out.println("Introduce una califiacion entre el 0 y el 10");
        int calificacion = sc.nextInt();

        //Realizamos las condicionales para ver la calificacion de la nota
         if (calificacion <0 || calificacion>10){
             System.out.println("Error: La calificacion debe de estar entre 0 y 10");
         } else if (calificacion < 3) {
             System.out.println("Muy deficiente");
         } else if (calificacion < 5) {
             System.out.println("Deficiente");
         } else if (calificacion < 6) {
             System.out.println("Bien");
         } else if (calificacion < 9){
             System.out.println("Notable");
         } else if (calificacion >= 9) {
             System.out.println("Sobresaliente");
         }
    }
}