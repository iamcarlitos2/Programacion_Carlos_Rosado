package unidad_4;

import java.util.Scanner; //importamos el scanner, el cual nos leera lo que introducimos por teclado
public class ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el lado del cuadrado:");
        int lado = sc.nextInt();
        int area = lado*lado;
        System.out.println("El area del cuadrado es:" + area);
    }
}