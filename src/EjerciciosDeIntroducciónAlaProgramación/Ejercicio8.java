package EjerciciosDeIntroducciónAlaProgramación;

import java.util.Scanner;

public class Ejercicio8 {
    static int n1=50;
    public static void main(String[] args) {
        /**
         * 8. Modifica el siguiente programa para hacer que compile y funcione:
         * class Suma {
         * static int n1=50;
         * public static void main(String [] args)
         * {
         * int n2=30, suma=0, n3;
         * suma=n1+n2;
         * System.out.println("LA SUMA ES: " + suma);
         * suma=suma+n3;
         * System.out.println(suma);
         * }
         * }
         */

        int n2=30, suma=0, n3 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("En Este programa de ejercicio 8 tiene "+ n1 + " Y " + n2);
        System.out.println("---------------------");
        System.out.println("Por Favor Dime un numero n3 : ");
        n3=sc.nextInt();
        suma=n1+n2;
        System.out.println("LA SUMA n1 + n2 ES: " + suma);
        suma=suma+n3;
        System.out.println("LA SUMA suma + n3 ES: " + suma);
    }
}
