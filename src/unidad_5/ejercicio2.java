package unidad_5;

public class ejercicio2 {
    public static void main(String[] args) {
        //Declaramos las variables.
        for (int index = 1; index<=200; index++) {
            if (index % 2 == 0){ //Hacemos el Mod para que divida entre 2 y si el resultado da 0 muestra los pares.
                System.out.println(index);
            }
        }

    }
}