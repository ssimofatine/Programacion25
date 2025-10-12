package EjerciciosDeIntroducciónAlaProgramación1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /**
         * Ejercicio 4
         * Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
         * Recordar que la fórmula para la conversión es:
         * C = (F-32)*5/9
         */

        Scanner Sc = new Scanner(System.in);

        System.out.println("Dime valor dado en grados Fahrenheit: ");

        double F,C;
        F = Sc.nextDouble();

        C = (F - 32) * 5 / 9;

        System.out.println("grados Celsius es: " + C);


    }
}
