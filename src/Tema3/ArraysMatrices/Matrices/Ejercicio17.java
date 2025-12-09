package Tema3.ArraysMatrices.Matrices;

import java.util.Arrays;

public class Ejercicio17 {

    /**
     * 17. Ordenar matrices. Crea una matriz de enteros de dos dimensiones de 50x50 elementos, rellénala con números
     * aleatorios entre 1 y 500. A continuación, realiza dos funciones:
     * a. ordenaFilas(matriz): que ordene la matriz por filas, cada fila de la matriz quedará ordenada de menor a
     * mayor.
     * b. ordenaColumnas(matriz): que ordene la matriz por columnas, cada columna quedará ordenada de
     * menor a mayor, independientemente de las demás.
     */
    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    
    public static void main(String[] args) {
        int[][] matriz = new int[50][50];

        // Rellenar la matriz con números aleatorios
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numeroAleatorio(500,1);
            }
        }

        ordenaFilas(matriz);

        System.out.println("Matriz ordenada por filas:");
        mostrarMatriz(matriz);

        // Ordenar la matriz por columnas
        ordenaColumnas(matriz);

        System.out.println("\nMatriz ordenada por columnas:");
        mostrarMatriz(matriz);
    }

    public static void ordenaFilas(int[][] matriz) {
        for (int[] fila : matriz) {
            Arrays.sort(fila);
        }
    }

    public static void ordenaColumnas(int[][] matriz) {
        // Transponer la matriz
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        ordenaFilas(transpuesta);

      
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = transpuesta[j][i];
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }
}
