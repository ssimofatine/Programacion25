package EjerciciosDeIntroducciónAlaProgramación;

public class Ejercicio2 {
    public static void main(String[] args) {

        /**
         * 2. ¿Cuáles son los valores de a y b después de ejecutar las siguientes instrucciones?
         * a = 3;
         * b = 4;
         * c = 2 * a * b;
         * a = a + 2;
         * b = c – a;
         */

        int a = 3, b = 4;

        int c =  2 * a * b; // resultado C = 24
        System.out.println("c = 2 * a * b :" + c);
        System.out.println("--------------------------------");

         a = a + 2; // resultado a = 5
        System.out.println("a = a + 2 : " + a);
        System.out.println("-------------------------------");

        b = c - a;
        System.out.println("b = c - a : " + b);
        System.out.println("-------------------------------");

        System.out.println("Los Valores de a Y b es : " + "a = " + a + " b = " + b);


    }

}
