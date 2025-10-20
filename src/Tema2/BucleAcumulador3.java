package Tema2;

import java.util.Scanner;

public class BucleAcumulador3 {
    public static void main(String[] args) {

        // pide 5 precios de un producto y la contidad de cada uno de ellos
        // precio - cantidad
        // precio - cantidad
        // precio - cantidad
        // precio - cantidad
        // precio - cantidad

        // mostrar el total de la compra

        double precio, cantidad;
        double suma = 0;

        Scanner Sc = new Scanner(System.in);

        double total = 0;

        for (int i = 1; i <= 5 ; i++) {

            System.out.println("Dime percio de " + "(" + i + ")" );
            precio = Sc.nextDouble();
            System.out.println("-----------------");
            System.out.println("Dime cantidad de un producto : ");
            cantidad = Sc.nextDouble();

            total += precio * cantidad; // total = total +(precio * cantidad)

        }

        System.out.println("mostrar el total de la compra : " + total);

    }
}
