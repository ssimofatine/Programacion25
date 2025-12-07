package Tema3.ArraysMatrices.ArraysVectores;
import java.util.Scanner;

public class Ejercicio3 {

    public static int numeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime 1  el tamaño del array:");
        int tamaño = sc.nextInt();

        System.out.println("Dime el dígito final deseado (entre 0 y 9):");
        int digitoFinal;
        do {
            digitoFinal = sc.nextInt();
            if (digitoFinal < 0 || digitoFinal > 9) {
                System.out.println("Error: introduce un número entre 0 y 9.");
            }
        } while (digitoFinal < 0 || digitoFinal > 9);

        int[] numeros = new int[tamaño];
        int[] numerosConDigitoFinal = new int[tamaño]; // Array para guardar los números que cumplen la condición
        int contador = 0; // Contador para la posición en el segundo array

        // Generar números aleatorios y guardar los que cumplen la condición
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = numeroAleatorio(1, 300);
            System.out.print(numeros[i] + " ");

            if (numeros[i] % 10 == digitoFinal) {
                numerosConDigitoFinal[contador] = numeros[i];
                contador++;
            }
        }

        // Mostrar los números que cumplen la condición
        System.out.println("\n-------------------------");
        System.out.println("Números que acaban en " + digitoFinal + ":");
        for (int i = 0; i < contador; i++) {
            System.out.print(numerosConDigitoFinal[i] + " ");
        }
    }
}