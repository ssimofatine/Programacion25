package Tema3.ArraysMatrices.Matrices;

public class Ejercicio18 {

    /**
     * Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9. Estos números se deben
     * introducir en un array de 4 filas por 5 columnas.
     * El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La
     * suma total debe aparecer en la esquina inferior derecha.
     * @param
     */

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void mostrarMatrizConSumas(int[][] matriz) {
        int sumaTotal = 0;

        for (int i = 0; i < matriz.length - 1; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length - 1; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFila += matriz[i][j];
                sumaTotal += matriz[i][j];
            }
            System.out.println("|\t" + sumaFila); // Mostrar suma de la fila
        }

        // Mostrar sumas de las columnas y la suma total
        System.out.print("--------------------------------------------------\n");
        for (int j = 0; j < matriz[0].length - 1; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length - 1; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.print(sumaColumna + "\t");
        }
        System.out.println("|\t" + sumaTotal); // Mostrar suma total
    }

    public static void main(String[] args) {
        int[][] matriz = new int[5][6]; // 4 filas + 1 para sumas, 5 columnas + 1 para sumas

        // Generar números aleatorios y calcular sumas parciales
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = numeroAleatorio(0, 9); // Generar número entre 0 y 9
                matriz[i][5] += matriz[i][j]; // Sumar a la última columna (suma de la fila)
                matriz[4][j] += matriz[i][j]; // Sumar a la última fila (suma de la columna)
                matriz[4][5] += matriz[i][j]; // Sumar a la suma total
            }
        }

        mostrarMatrizConSumas(matriz);
    }
}