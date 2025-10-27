package unidad_5;


public class ejercicio3 {
    public static void main(String[] args) {
        //Declaramos las variables
        int contador = 1;
        int maximo  = 200;
        //Ponemos la variable while ya que nos pide un contador desde un principio.
        while (contador <= maximo) {
            contador++;
            if(contador%2 == 0){ //hacemos el modulo para que saque los numeros pares ya que los divide entre dos y el resultado da 0
                System.out.println("Numero:" + contador);
            }
        }

    }
}
