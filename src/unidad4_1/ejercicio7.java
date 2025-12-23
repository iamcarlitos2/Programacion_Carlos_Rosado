package unidad4_1;

import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos que introduzca las millas marinas
        System.out.print("Introduce una distancia en millas:");
        //leemos las millas marinas
        double millas_marinas = sc.nextDouble();
        //Creamos la variable metros, donde multiplicaremos las millas marinas que hemos introducido, por lo que vale un milla marina
        double milla = 1852;
        double metros = (millas_marinas * milla);

        //Mostramos en consola los metros que hemos obtenido
        System.out.println(millas_marinas + "millas marinas son:" + metros + "metros");



    }
}
