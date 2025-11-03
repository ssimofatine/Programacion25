package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_de_bucles;

import java.util.Scanner;

public class Ejercicio7 {

	/* Función que calcule el factorial de un número entero positivo pasado como parámetro.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para calcular su factorial:");
        int numero = Integer.parseInt(sc.nextLine());

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial del número " + numero + " es: " + factorial);
        sc.close();
    }
}