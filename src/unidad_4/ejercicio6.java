package unidad_4;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos que se introduzca el precio del articulo
        System.out.println("Introduce el precio del articulo:");
        //leemos el precio del articulo
        double precio_articulo = sc.nextDouble();
        //Pediomos que introduzca el precio de venta real
        System.out.println("Introduce el preico de venta:");
        //leemos el precio de venta
        double precio_venta = sc.nextDouble();
        //calculamos el descuento
        double descuento = ((precio_articulo -  precio_venta) / precio_articulo) * 100;

        //Mostramos por la consola el descuento
        System.out.println("El descuento es de:" + descuento);
    }
}
