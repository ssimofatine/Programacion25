package EjerciciosDeIntroducciónAlaProgramación1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        /*
         * Ejercicio 6
         * Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas
         * horas y minutos corresponde.
         * Por ejemplo: 1000 minutos son 16 horas y 40 minutos.
         */

        Scanner Sc = new Scanner(System.in);

        System.out.println("Por Favor Dime una cantidad de minutos : ");
        int Minutos, Horas;
        Minutos = Sc.nextInt();

        Horas = Minutos / 60 ;

        int Minutos1 = Minutos % 60;

        System.out.println("horas y minutos corresponde Es: " + Horas+"H:"+ Minutos1+"M ");


    }
}
