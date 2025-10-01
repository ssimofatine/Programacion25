package EjerciciosDeIntroducciónAlaProgramación;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         * Si A = 6, B = 2, C = 3, indicar el resultado final de las siguientes expresiones aritméticas:
         * a. (A * C) % C
         * b. A * B / C
         * c. C % B + C * B
         * d. A % ( A * B * C / (B + C) )
         * e. B * B + C – B * (A % B )
         */

        int A = 6;
        int B = 2;
        int C = 3;

        int resultadoA = (A * C) % C; // el resultado = 0
        System.out.println("a. (A * C) % C : " + resultadoA);

        System.out.println("------------------------------------");
        int resultadoB = (B * A) / C; // el resultado = 4
        System.out.println("b. (B * A) % C : " + resultadoB);

        System.out.println("------------------------------------");
        int resultadoC = (C % B) + (C * B); // el resultado = 7
        System.out.println("c. C % B + C * B : " + resultadoC);

        System.out.println("------------------------------------");
        int resultadoD = A % ( A * B * C / (B + C) ); // el resultado = 6
        System.out.println("a. (A * C) % B + C * B : " + resultadoD);

        System.out.println("------------------------------------");
        int resultadoE = (B * B) + C - (B * (A % B )); // el resultado = 7
        System.out.println("b. (B * A) % B - C * B : " + resultadoE);


    }
}
