package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_de_bucles;

import java.util.Scanner;

public class Ejercicio8 {

	 /*Programa que imprima la tabla de multiplicar de cualquier*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Ingresa un número entre 1 y 10:");
            numero = Integer.parseInt(sc.nextLine());
        } while (numero < 1 || numero > 10);

        System.out.println("Tabla de multiplicar del número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        sc.close();
    }
}
