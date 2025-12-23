//Un billete de tren de valencia a madrid cuesta en tarifa normal 32€. Sin embargo, existen tarifas especiales en los siguientes casos:
//65 años o mas 10% de descuento, 12-15 años ambos incluidos 8% de descuento, 4-11 años ambos incluidos 35% de descuento.
//menores de 4 años gratis.
package mas_ejercicios_bucles;
import java.util.Scanner;

public class ejercicio_2_examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tarifa_normal = 32, precio_total = 0, numero_mimebros;
        //Pedimos el numero de mimbros
        System.out.println("Introduce el numero de miembros de la familia:");
        numero_mimebros = sc.nextInt();
        //Usare un for para saber hasta el numero de miembros que voy a llegar y a partir de ahi haremos las comparaciones de los precios.
        for (int index = 1; index <= numero_mimebros; index++) {
            int edad_mimebros;
            double precio;
            //pedimos la edad de los miembros
            System.out.println("Introduce la edad del miembro " + index + " :");
            edad_mimebros = sc.nextInt();

            if (edad_mimebros >= 65){
                //Aplicamos el 10% de descuento de la tarifa normal
                precio = tarifa_normal - (tarifa_normal * 0.10);
                System.out.println(precio);
            } else if (edad_mimebros >= 12 && edad_mimebros <= 15) {
                precio = tarifa_normal - (tarifa_normal * 0.08);
                System.out.println(precio);
            } else if (edad_mimebros >= 4 && edad_mimebros <= 11) {
                precio = tarifa_normal - (tarifa_normal * 0.35);
                System.out.println(precio);
            } else if (edad_mimebros < 4) {
                precio = 0;
            } else {
                precio = tarifa_normal;
            }
            System.out.println("El precio del billete: " + precio + "€");
            precio_total += precio; //Acumulamos el total

        }
        System.out.println("El precio total para la familia es de: " + precio_total + "€");
    }
}
