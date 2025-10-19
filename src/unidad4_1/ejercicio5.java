package unidad4_1;

import java.util.Scanner;
public class ejercicio5 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos la longitud del radio
        System.out.println("Introduce la longirud del radio:");
        //leemos el radio
        double radio = sc.nextDouble();
        //calculamos la longitud de la circunferencia
        double longitud_circunferencia =  (2 * Math.PI * radio); //usamos double ya que java no puede pasar de un entero a un decimal
        double area_circulo = (Math.PI * radio * radio);
        double volumen_esfera = ((3.0/4.0)* Math.PI * radio * radio);
        //Mostramos el resultado por consola
        System.out.println("La longitu de la circunferencia es de:" + longitud_circunferencia);
        System.out.println("El area del circulo es de:" + area_circulo);
        System.out.println("El volumen de la esfera es de:" + volumen_esfera);



    }
}