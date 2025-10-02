package EjerciciosDeIntroducciónAlaProgramación;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /**
         * 4. Decir si son verdaderas o falsas las siguientes expresiones:
         * a. (3<=7) && (7<=7) ===> resultado true
         * b. !((–8>1) && (3<=4)) ===> resultado true
         * c. “Hola” == “Hola ” ===> resultado false
         * d. ((2<=5) && (3>=6)) || (2>–1) ===> resultado true
         * e. ((2<=5) || (3>=6)) && (2>–1) ===> resultado true
         **/
        Scanner sc = new Scanner(System.in);
        boolean respuestadoA = (3<=7) && (7<=7); // resultado true
        System.out.println(respuestadoA);
        System.out.println("----------------------"); // resultado true
        boolean respuestadoB = !((-8>1) && (3<=4));
        System.out.println(respuestadoB);
        System.out.println("----------------------"); // resultado false
        boolean respuestadoC = "Hola" == "Hola ";
        System.out.println(respuestadoC);
        System.out.println("----------------------");
        boolean respuestadoD = ((2<=5) && (3>=6)) || (2>-1); // resultado true
        System.out.println(respuestadoD);
        System.out.println("-----------------------");
        boolean respuestadoE = ((2<=5) || (3>=6)) && (2>-1); // resultado true
        System.out.println(respuestadoE);
        System.out.println("-----------------------");

    }
}
