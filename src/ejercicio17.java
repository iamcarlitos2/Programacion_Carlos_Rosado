import java.util.Scanner;
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario que ingrese las horas (0-23)
        System.out.println("Ingresa las horas (0-23)");
        int horas = sc.nextInt();
        //Pedimos al ususario que introduzca los minutos
        System.out.print("Ingresa los minutos (0-59)");
        int minutos = sc.nextInt();
        //Pedimos al usuario que ingrese los segundos
        System.out.println("Ingresa los segundos (0-59)");
        int segundos = sc.nextInt();

        //Sumamos los segundos con el ++, que es lo mismo que poner segundos = segundos + 1
        segundos ++;

        //Hacemos las condicionales
        if (segundos == 60){
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            horas++;
        }
        if (horas == 24) {
            horas = 0;
        }

        //Mostramos por consola el resultado
        System.out.printf("La hora sera: ", horas, minutos, segundos); //Colocamos el printf, ya que nos permite colocar mas de dos digitos

    }
}