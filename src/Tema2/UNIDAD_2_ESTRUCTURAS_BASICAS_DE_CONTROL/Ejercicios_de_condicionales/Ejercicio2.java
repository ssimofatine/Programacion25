package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_de_condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Programa que lea un número por teclado e indique si es múltiplo de 2, 3, 5 o 7
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();

        // porfa usar numero 210

        if (num1 % 2 == 0) {
            System.out.println("Tú numero : " + num1+ " múltiplo (2)");

        }
        if (num1 % 3 == 0) {
            System.out.println("Tú numero : " + num1+ " múltiplo (3)");

        }
        if (num1 % 5 == 0) {
            System.out.println("Tú numero : " + num1+ " múltiplo (5)");
        }
        if (num1 % 7 == 0) {
            System.out.println("Tú numero : " + num1+ " múltiplo (7)");
        }


    }
}
