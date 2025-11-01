package Tema2;

import java.util.Scanner;

public class Ejerciciobucles3 {
    public static void main(String[] args) {

        int numeroAL;
        int numero;

        do {
            numeroAL = (int) (Math.random()*(100 -1 +1)+100);
            System.out.println("numero aliatorio : " + numeroAL);
            Scanner Sc = new Scanner(System.in);
            numero = Sc.nextInt();

            if (numero > numeroAL){
                System.out.println("" );
            } else if (numero < numeroAL) {
                System.out.println();

            }else {

            }
        }while (numero != numeroAL);


    }
}
