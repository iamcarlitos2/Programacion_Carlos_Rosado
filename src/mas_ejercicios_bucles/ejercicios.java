package mas_ejercicios_bucles;

public class ejercicios {
    public static void main(String[] args) {
        String palabra = "SOL";
        String cadenaCodificada ="";
        for (int i = 0; i<palabra.length(); i++){
            char caracterOriginal = palabra.charAt(i);
            if (i % 2 == 0){
                cadenaCodificada = cadenaCodificada + caracterOriginal + i;
            } else{
                cadenaCodificada = cadenaCodificada + caracterOriginal;
            }
        }
        System.out.println(cadenaCodificada);
    }
}

