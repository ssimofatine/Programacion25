package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_de_condicionales;

import java.util.Scanner;

public class Ejercicio_1 {
    public static int mayor(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        }else if (b > a && b > c) {
            return b;
        }else{
            return c;
        }
    }
    public static void main(String[] args) {
        /**
         * Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
         * los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:
         * public int mayor (int a, int b, int c) { … }
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int c = sc.nextInt();

        int calcular = mayor(a,b,c);

        System.out.println("el mayor de los tres números" + calcular);



    }
}
