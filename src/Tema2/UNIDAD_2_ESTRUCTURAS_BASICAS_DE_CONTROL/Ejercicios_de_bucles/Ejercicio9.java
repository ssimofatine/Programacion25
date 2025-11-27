package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_de_bucles;

import java.util.Scanner;

public class Ejercicio9 {

	/*Crea un método que, dado un número entero pasado como parámetro, devuelva cuántos dígitos lo*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        int numero = sc.nextInt();

        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        System.out.println("El número de dígitos en este número es: " + contador);
        sc.close();
    }
}