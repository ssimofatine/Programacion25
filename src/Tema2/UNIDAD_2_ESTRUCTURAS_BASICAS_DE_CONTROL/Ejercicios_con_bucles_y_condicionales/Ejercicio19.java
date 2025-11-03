package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_con_bucles_y_condicionales;
import java.util.Scanner;

public class Ejercicio19 {

/*Programa que, dado un número entero positivo introducido por teclado, visualice por pantalla
todos los números primos menores que él. Utiliza la función del ejercicio anterior. Ejemplo:

Dime un número: 15
> Los primos menores de 15 son: 1,2,3,5,7,11,13*/

    // Método esPrimo copiado del Ejercicio 18
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo:");
        int numero = sc.nextInt();

        System.out.println("Los números primos menores que " + numero + " son:");
        for (int i = 2; i < numero; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }
}