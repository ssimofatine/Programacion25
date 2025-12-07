package Tema3.ArraysMatrices.ArraysVectores;

public class Ejercicio1 {

    public static int numeroAleatorio(int min, int max) {
        // este metodo del aleatorio
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        /* Programa Java que guarda en un array 20 números enteros que se generen aleatoriamente
           entre -100 y 100.
           A continuación, se recorre el array y calcula cuántos números son positivos y cuántos
           negativos */

        int[] numeros = new int[20];
        int contadorNegativos = 0;
        int contadorPositivos = 0;

        // Generar números aleatorios y contar positivos y negativos
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeroAleatorio(-100, 100); // Corregido el orden de los argumentos
            System.out.println(numeros[i]);

            if (numeros[i] < 0) {  // Cambiado a < 0 para contar solo los negativos
                contadorNegativos++;
            } else {
                contadorPositivos++;
            }
        }

        System.out.println("Hay " + contadorNegativos + " números negativos en el array.");
        System.out.println("Hay " + contadorPositivos + " números positivos en el array.");
    }
}