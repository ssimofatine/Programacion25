public class Ejercicio16 {

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
    }

    public static boolean existe(int[][] matriz, int numero) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                if (elemento == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /* Crea una matriz de 3x6 números enteros aleatorios no repetidos */

        int[][] matriz = new int[3][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numero;
                do {
                    numero = numeroAleatorio(1, 50);
                } while (existe(matriz, numero));
                matriz[i][j] = numero;
            }
        }

        mostrarMatriz(matriz);
    }
}