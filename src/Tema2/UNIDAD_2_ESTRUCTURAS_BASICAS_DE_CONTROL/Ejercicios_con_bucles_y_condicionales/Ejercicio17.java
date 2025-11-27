package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_con_bucles_y_condicionales;
import java.util.Scanner;

public class Ejercicio17 {
/* Programa que lea un entero positivo introducido por el usuario y que muestre
    por pantalla todos sus divisores. */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo:");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido.");
            return;
        }

        System.out.println("Los divisores de " + numero + " son:");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
