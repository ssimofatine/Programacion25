package EjerciciosDeIntroducciónAlaProgramación;

import java.util.Scanner;

public class Ejercicios3 {
    public static void main(String[] args) {
        /**
         * 3. Expresar las siguientes expresiones como condiciones lógicas.
         * a. a es mayor que 2
         * b. b es menor o igual que 25 pero mayor que 5
         * c. c es mayor que 6 o igual a d
         * d. e es par menor que 50
         * e. f es mayor que a, b y c
         * f. g es igual a 3, 4 ó 5
         */

        int a, b, c, d, e, f, g;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("Ingrese numero de a y b y c y d y e y f y g: ");
        System.out.println("----------------------------");
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextInt();
        System.out.println("Ingrese el valor de c: ");
        c = sc.nextInt();
        System.out.println("Ingrese el valor de d: ");
        d = sc.nextInt();
        System.out.println("Ingrese el valor de e: ");
        e = sc.nextInt();
        System.out.println("Ingrese el valor de f: ");
        f = sc.nextInt();
        System.out.println("Ingrese el valor de g: ");
        g = sc.nextInt();
        System.out.println("----------------------------");

        System.out.println("a es : " + a + " \nb es : " + b + " \nc es : " + c + " \nd es : " + d + " \nf es : " + e + " \ng es : " + f);
        System.out.println("---------------------------------");

        boolean resultadoA = a > 2; // a. a es mayor que 2
        System.out.println("El resultado de a es mayor que 2 es: " + resultadoA);
        System.out.println("-------------------------");
        boolean resultadoB = b <= 25 && b > 5; // b. b es menor o igual que 25 pero mayor que 5
        System.out.println("El resultado b es menor o igual que 25 pero mayor que 5 es: " + resultadoB);
        System.out.println("-------------------------");
        boolean resultadoC = c > 6 || c == d ; // c. c es mayor que 6 o igual a d
        System.out.println("El resultado c es mayor que 6 o igual a d es: " + resultadoC);
        System.out.println("-------------------------");
        boolean resultadoD = e % 2 == 0 && e < 50; // d. e es par menor que 50
        System.out.println("El resultado e es par menor que 50 es: " + resultadoD);
        System.out.println("-------------------------");
        boolean resultadoE = f > a && f > b && f > c; // e. f es mayor que a, b y c
        System.out.println("El resultado f es mayor que a, b y c es: " + resultadoE);
        System.out.println("-------------------------");
        boolean resultadoF = g == 3 || g == 4 || g == 5; // f. g es igual a 3, 4 ó 5
        // g == 3 && g == 4 || g == 5; siempre false pero mejor usar (O) || in ests caso
        System.out.println("El resultado g es igual a 3, 4 ó 5 es: " + resultadoF);
        System.out.println("-------------------------");





    }
}
