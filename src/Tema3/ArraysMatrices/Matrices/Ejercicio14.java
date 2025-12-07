package Tema3.ArraysMatrices.Matrices;

public class Ejercicio14 {

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int encontrarMayor(int[][] tabla) {
        int mayor = tabla[0][0];
        for (int[] fila : tabla) {
            for (int elemento : fila) {
                if (elemento > mayor) {
                    mayor = elemento;
                }
            }
        }
        return mayor;
    }

    public static int encontrarMenor(int[][] tabla) {
        int menor = tabla[0][0];
        for (int[] fila : tabla) {
            for (int elemento : fila) {
                if (elemento < menor) {
                    menor = elemento;
                }
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        /*4. Crear una matriz 5x3 de números enteros (aleatorios) y
           mostrar el menor, el mayor y la media de los elemento*/

        int[][] tabla = new int[5][3];

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = numeroAleatorio(1, 10);
            }
        }

        // Mostrar la matriz
        System.out.println("La matriz generada es:");
        for (int[] fila : tabla) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        // Calcular la suma de los elementos
        int suma = 0;
        for (int[] fila : tabla) {
            for (int elemento : fila) {
                suma += elemento;
            }
        }

        // Calcular la media
        double media = (double) suma / (tabla.length * tabla[0].length);

        // Encontrar el mayor y el menor
        int mayor = encontrarMayor(tabla);
        int menor = encontrarMenor(tabla);

        // Mostrar los resultados
        System.out.println("------------------------------------------");
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La media de los números es: " + media);
        System.out.println("------------------------------------------");
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}