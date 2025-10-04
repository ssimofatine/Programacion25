package EjerciciosDeIntroducciónAlaProgramación;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /**
         * 12. Realiza un programa en Java que, dadas dos variables a y b, intercambie los valores de a y b.
         */

        int a,b,intercambie;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero (A) : ");
        a = sc.nextInt();
        System.out.println("-------------------------------");
        System.out.println("Introduzca el segundo numero (B) : ");
        b = sc.nextInt();
        System.out.println("-------------------------------");

        // ahora intercambie los valores de a y b
        intercambie = a;
        a = b;
        b = intercambie;

        System.out.println("intercambie los valores de a y b ");
        System.out.println("--------------------------");
        System.out.println("ahora número (A) = " + a);
        System.out.println("ahora número (B) = " + b);


    }
}
