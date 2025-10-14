import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Leemos el primer numero
        System.out.println("Introduce un numero:");
        int numero1 = sc.nextInt();
        //Leemos el segundo numero
        System.out.println("Introduce un segundo numero:");
        int numero2 = sc.nextInt();

        //Calculamos la suma
        int suma = numero1 + numero2;
        //calculamos la resta
        int resta = numero1 - numero2;
        //Calculamos el producto
        int producto = numero1*numero2;
        //Calculamos la division
        int division = numero1 / numero2;
        //Mostramos por consola el resultado
        System.out.println("La suma de los numeros es:" +  suma + "La resta es:" + resta + "El producto es:" + producto + "La division es:" + division);
    }
}