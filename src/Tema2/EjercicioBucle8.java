package Tema2;

import java.util.Scanner;

public class EjercicioBucle8 {
    public static void main(String[] args) {

        // Pide 10 palabras por teclado y dime cuantas de ellas
        // tiene longitud mayos de 5 cracteres
        // cadena.leght() develve  de la longitud de cadena
         String palabra;

        Scanner Sc = new Scanner(System.in);



        int numero = 0;

        do {
            System.out.println(" dime 10 palabras por teclado: ");
            palabra = Sc.nextLine();
            if (palabra.length() >= 5){
                System.out.println("este "+ palabra + " mayos de 5 cracteres : ");
            }
            System.out.println("--------------");
            System.out.println("de la longitud de cadena" + palabra.length());
            numero++;
        }while (numero != 10);





    }
}
