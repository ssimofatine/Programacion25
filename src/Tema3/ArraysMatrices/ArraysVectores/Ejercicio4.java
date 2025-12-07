package Tema3.ArraysMatrices.ArraysVectores;
import java.util.Scanner;

public class Ejercicio4 {

    /* Programa Java para leer la altura de N personas y calcular la altura media.
       Calcular cuántas personas tienen una
       altura superior a la media y cuántas tienen una altura inferior a la media.
       El valor de N se pide por teclado y debe
       ser entero positivo. */

    public static double numeroAleatorio(double min, double max) {
        return (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            System.out.println("¿Cuántas personas hay? (Introduce un número entero positivo):");
            N = sc.nextInt();
        } while (N <= 0);

        double[] alturas = new double[N];
        double suma = 0;

        System.out.print("Las alturas generadas son: ");
        for (int i = 0; i < N; i++) {
            alturas[i] = numeroAleatorio(100, 200);
            System.out.printf("%.2f | ", alturas[i]);
            suma += alturas[i];
        }

        double media = suma / N;
        System.out.println("\nLa suma total de alturas es: " + suma);
        System.out.println("La media de alturas es: " + media);

        int superiores = 0, inferiores = 0;
        for (double altura : alturas) {
            if (altura > media) {
                superiores++;
            } else if (altura < media) { // Añadido "else if" para no contar la media en ambos
                inferiores++;
            }
        }

        System.out.println("Hay " + superiores + " personas con altura superior a la media.");
        System.out.println("Hay " + inferiores + " personas con altura inferior a la media.");
    }
}