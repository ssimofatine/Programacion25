package Tema2;

import java.util.Scanner;

public class EjercicioBucles4 {
    public static void main(String[] args) throws InterruptedException{

        Scanner Sc = new Scanner(System.in);
        int numTec;
    // potencia de 2 desde 10000 hasta 2
        long contado = 10;
        for (int contador = 8192; contador > 2 ; contador /= 2 ){


            Thread.sleep(1000);
            System.out.print("\b");
            System.out.println(contador + " ");

        }

    }
}
