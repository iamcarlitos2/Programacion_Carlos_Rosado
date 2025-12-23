package examen_2025;
import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = 0, grupo_aficionados = 0, aficionados = 0;
        double precio_grada_general = 45, precio_preferencia_lateral = 65, precio_tribuna_central = 90, precio_otra_zona = 40;
        double precio_final_grada, costo_final_entradas = 0;
        String nombre, zona_estadio;
        char socio;

        System.out.println("---Bienvenido al partido de futbol---");

        // Validación de datos
        do {
            System.out.println("Introduzca el numero de grupos: ");
            grupo_aficionados = sc.nextInt();

            System.out.println("Introduzca el numero de aficionados: ");
            aficionados = sc.nextInt();

            if (grupo_aficionados <= 0 || aficionados <= 0) {
                System.out.println("Error: los valores deben ser mayores que 0.");
            }

        } while (grupo_aficionados <= 0 || aficionados <= 0);

        sc.nextLine(); // limpiar buffer

        // Procesar aficionados
        for (int delta = 0; delta < grupo_aficionados; delta++){
            for (int index = 0; index < aficionados; index++) {

                System.out.println("Introduzca el nombre del aficionado: ");
                nombre = sc.next().toLowerCase();

                System.out.println("Introduce la edad del aficionado: ");
                edad = sc.nextInt();

                System.out.println("Introduce la zona del estadio: (gg/pl/tc/ot)");
                zona_estadio = sc.next().toLowerCase();

                precio_final_grada = switch (zona_estadio) {
                    case "gg" -> precio_grada_general;
                    case "pl" -> precio_preferencia_lateral;
                    case "tc" -> precio_tribuna_central;
                    default -> precio_otra_zona;
                };

                System.out.println("Introduce si el aficionado es socio (s/n): ");
                socio = sc.next().toLowerCase().charAt(0);

                if (socio == 's') {
                    precio_final_grada *= 0.85; // 15% descuento
                }

                if (edad < 14) {
                    precio_final_grada -= 5;
                }

                // Acumular al total
                costo_final_entradas += precio_final_grada;
            }
        }


        System.out.println("\n El costo total de todas las entradas es: " + costo_final_entradas + " €");
    }
}
