package unidad_4;

import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero de horas trabajadas:");
        int horas = sc.nextInt();

        System.out.println("Introduce la tarifa por horas");
        int tarifa = sc.nextInt();

        //Calculamos el salario
        double salarioBruto;
        if (horas <= 35) {
            salarioBruto = horas * tarifa;
        } else {
            salarioBruto = 35 * tarifa + (horas-35) * tarifa * 1.5;
        }

        //Calculamos los impuestos para su posterior resultado
        double impuestos;
        if (salarioBruto <= 500) {
            impuestos = 0;
        } else if (salarioBruto <= 900) {
            impuestos = (salarioBruto - 500) * 0.25;
        } else {
            impuestos = (400 * 0.25) + (salarioBruto - 900) * 0.45;
        }

        //Calculamos el salario neto
        double salarioNeto  = salarioBruto - impuestos;

        //Mostramos los resultados
        System.out.println("Salario bruto: " + salarioBruto + " €");
        System.out.println("Impuestos: " + impuestos + " €");
        System.out.println("Salario neto: " + salarioNeto + " €");
    }
}
