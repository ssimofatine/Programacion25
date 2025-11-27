package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_con_bucles_y_condicionales;
import java.util.Scanner;

public class Ejercicio18 {

/*Diseña un método que indique si un número entero pasado como parámetro es o no un número primo
(devuelve un boolean). Un número primo es aquel que tiene por divisores el 1 y el propio número,
únicamente.*/

    /*numeros primo: es el numero que se puede devidir entre 1 y el mismo*/

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
        System.out.println("Introduce un número entero:");
        int numero = sc.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
        sc.close();
    }
}