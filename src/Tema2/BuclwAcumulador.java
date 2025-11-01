package Tema2;

import java.util.Scanner;

public class BuclwAcumulador {
    public static void main(String[] args) {

        // pide 5 número por teclado y guarda en una variable la suma de los
        // que sean impares

        int numeroTeclado, suma;

        Scanner Sc = new Scanner(System.in);




        suma = 0;
        for (int i =1 ; i <= 5; i++){
            System.out.println("por favor dime 5 número: " + "número : " + i);
            numeroTeclado = Sc.nextInt();
            if (numeroTeclado % 2 != 0) {
                suma = suma + numeroTeclado;
            }
        }

        System.out.println("la suma de los que sean impares " + suma);



    }
}
