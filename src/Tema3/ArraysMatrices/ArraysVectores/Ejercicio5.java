package Tema3.ArraysMatrices.ArraysVectores;
import java.util.Scanner;

public class Ejercicio5 {

    /**
     * Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el
     * menor valor. Usar un array para almacenar los valores y sacar toda la información en una sola iteración del array.
     * Si puedes mejóralo implementando una función para cada tarea (media, mayor, menor), pasando el array.
     * @param
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer los números y calcular la media, el mayor y el menor en una sola iteración
        int suma = 0;
        int mayor = Integer.MIN_VALUE;  // Inicializar con el valor mínimo posible
        int menor = Integer.MAX_VALUE;  // Inicializar con el valor máximo posible

        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            suma += numeros[i];

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        double media = (double) suma / numeros.length;

        // Mostrar los resultados
        System.out.print("Números introducidos: ");
        for (int numero : numeros) {
            System.out.print(numero + " | ");
        }
        System.out.println("\nLa media: " + media);
        System.out.println("El mayor: " + mayor);
        System.out.println("El menor: " + menor);
    }
}