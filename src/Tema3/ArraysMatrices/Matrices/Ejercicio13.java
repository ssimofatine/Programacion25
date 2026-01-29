package Tema3.ArraysMatrices.Matrices;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        /* Crear una tabla bidimensional de tamaño 3x4 de números enteros (leídos desde teclado).
           Mostrar la matriz y la suma de los valores de cada fila.*/

        Scanner sc = new Scanner(System.in);

        int[][] tabla = new int[3][4];

        // Pedir al usuario que introduzca los números
        System.out.println("Introduzca 12 números para la tabla (3 filas x 4 columnas):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                tabla[i][j] = sc.nextInt();
            }
        }

        // Mostrar la tabla
        System.out.println("\nLa tabla introducida es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular y mostrar la suma de cada fila
        System.out.println("\nSuma de cada fila:");
        for (int i = 0; i < 3; i++) {
            int suma = 0;
            for (int j = 0; j < 4; j++) {
                suma += tabla[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + suma);
        }

        sc.close();
    }
}