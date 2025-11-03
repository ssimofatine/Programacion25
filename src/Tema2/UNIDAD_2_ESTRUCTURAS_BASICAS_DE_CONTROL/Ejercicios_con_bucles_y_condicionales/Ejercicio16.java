package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_con_bucles_y_condicionales;
import java.util.Scanner;

public class Ejercicio16 {

/* Programa que lea por teclado una serie de números enteros hasta que introduzca el
     -1 y obtenga su media. Deberá mostrarla por pantalla.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        do {
            System.out.println("Ingrese un número:");
            numero = Integer.parseInt(sc.nextLine());
            if (numero != -1) {
                suma += numero;
                contador++;
            }
        } while (numero != -1);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No se ingresaron números.");
        }
        sc.close();
    }
}