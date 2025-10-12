package EjerciciosDeIntroducciónAlaProgramación1;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /**
         * Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número
         * invertido. Ejemplo, si se introduce 23 que muestre 32.
         */

        int diget1, diget2, numero1, numero2;

        Scanner Sc = new Scanner(System.in);
        System.out.println("Dime numero de dos cifras : ");
        numero1 = Sc.nextInt();

        diget1 = numero1 / 10;
        diget2 = numero1 % 10;

        numero2 = (diget2*10) + diget1;

        System.out.println("el número invertido es: "+ numero2);

    }
}
