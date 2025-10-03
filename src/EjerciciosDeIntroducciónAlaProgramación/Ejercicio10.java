package EjerciciosDeIntroducciónAlaProgramación;

public class Ejercicio10 {
    public static void main(String[] args) {
        /**
         * 10. ¿Qué mostrará el siguiente código por pantalla?
         * int num=5;
         * num += num - 1 * 4 + 1;
         * System.out.println(num);
         * num=4;
         * num %= 7 * num % 3 * 5;
         * System.out.println(num);
         */

        int num=5;
        num += num - 1 * 4 + 1; // forma de caluclar es = 5 + 5 - (1*4 + 1) = 10 - 3 = 7
        System.out.println(num); // pintar en la pantalla es : 7
        num=4; // ahora tiene numero 4 : num guardar valor nuevo 4
        num %= 7 * num % 3 * 5; // forma de calcular es : (4 % ((7* 4 % 3) * 5)) =  (4%((28 % 3) * 5)) = (4 % (1 * 5)) = 4 % 5 = 4
        System.out.println(num); // pintar en la pantalla es : 4
    }
}
