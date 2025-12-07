package Tema3.ArraysMatrices.Matrices;

public class Ejercicio15 {

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void llenarMatrizAleatoria(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = numeroAleatorio(1, 10);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println(); 

        }
    }

    public static int[][] sumarMatrices(int[][] matriz1, 
                                        int[][] matriz2) {
        int[][] suma = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j]; 

            }
        }
        return suma;
    }

    public static void main(String[] args) {
        /*Crear dos matrices 3x3 de números enteros (generadas aleatoriamente),
           pintarlas,   
 sumarlas y mostrar su suma.
           El resultado será también una matriz (suma) donde cada elemento será la suma de los elementos
           de las otras matrices en la misma posición.*/

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];

        // Llenar las matrices con números aleatorios
        llenarMatrizAleatoria(matriz1);
        llenarMatrizAleatoria(matriz2);

        // Mostrar las matrices
        System.out.println("Primera matriz:");
        mostrarMatriz(matriz1);
        System.out.println("Segunda matriz:");
        mostrarMatriz(matriz2);

        // Sumar las matrices
        int[][] suma = sumarMatrices(matriz1, matriz2);

        // Mostrar la matriz suma
        System.out.println("La suma de las matrices es:");
        mostrarMatriz(suma);
    }
}
