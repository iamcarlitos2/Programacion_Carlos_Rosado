import java.util.Scanner;
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pedimos al usuario que ingrese las horas
        System.out.println("Ingresa las horas (0-23)");
        int horas = sc.nextInt();
        //Pedimos que introduzca los minutos
        System.out.println("Introduce los minutos (0-59)");
        int minutos = sc.nextInt();
        //Pedinmos al ususario que ingrese los segundos
        System.out.println("Ingrese los segundos (0-59)");
        int segundos = sc.nextInt();

        //sumamos los segundos el ++ es lo mismo que poner segundos = segundos + 1;
        segundos++;

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
        System.out.printf("La hora será: ", horas, minutos, segundos); //Colocamos printf, ya que nos permite colocar dos digitos
    }
}
