package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_de_bucles;

import java.util.Scanner;

public class Ejercicio11 {

	 /*Programa (utilizando bucles) que muestre por pantalla la siguiente figura. Debe funcionar para n =
	número de líneas, que se pida por teclado.
   *
  **
 ***
*****
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de filas:");
        int numero = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= numero; i++) {

            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}