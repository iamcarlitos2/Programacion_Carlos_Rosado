//Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números
//naturales.
package unidad_5;

public class ejercicio_18 {
    public static void main(String[] args) {

        int suma = 0;

        for (int index = 1; index <= 5; index++){
            suma = suma + (index * index);
            System.out.println("La suma de los cuadrados es: " +  suma);
        }
    }
}
