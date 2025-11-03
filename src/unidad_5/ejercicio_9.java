//Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números
//naturales.
package unidad_5;

public class ejercicio_9 {
    public static void main(String[] args) {

        int suma = 0, producto = 1; //Ponemos el producto a 1 porque sino cualquiero numero multiplicado por 0 es 0

        for (int index = 1; index <= 10; index++){

            suma+= index;
            producto *= index;
        }

        System.out.println("La suma de los primeros 10 numeros naturales es: " + suma);
        System.out.println("El producto de los primeros 10 numeros naturales es: " + producto);
    }
}
