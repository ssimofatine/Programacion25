package Tema3.ArraysMatrices.ArraysVectores;
import java.util.Arrays;

public class Ejercicio2 {

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] intercambiarPrimeroYUltimo(int[] array) {
        if (array.length < 2) {
            return array; // No se puede intercambiar si hay menos de 2 elementos
        }

        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args)   {
        /* Crea una función que reciba como parámetro un array de 10 enteros,
           debe devolver el mismo array donde se
           hayan intercambiado el primer elemento y el último elemento.*/

        int[] numeros = new int[10];

        // Llenar el array con números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeroAleatorio(1, 10);
        }

        // Mostrar el array original
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Intercambiar el primer y último elemento
        intercambiarPrimeroYUltimo(numeros);

        // Mostrar el array después del intercambio
        System.out.println("Array cambiado: " + Arrays.toString(numeros));
    }
}