package EjerciciosDeIntroducciónAlaProgramación;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        /**
         * 11. Realiza un programa que calcule el área y el perímetro de un círculo de radio 3,6 metros.
         */

        Scanner Sc = new Scanner (System.in);
        double area, perimetro, radio,Pi;
        Pi = 3.14;
        radio = 3.6;

        area = 2 * (Pi * radio);
        System.out.println("El area del perimetro es: " + area);
        perimetro = Pi * Math.pow(radio, 2);

        System.out.println("El perimetro es: " + perimetro);




    }
}
