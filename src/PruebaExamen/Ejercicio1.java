package PruebaExamen;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /**
         *  Implementa un programa que pida al usuario que introduzca una frase, y a
         * continuación que introduzca dos cadenas. El programa debe mostrar por pantalla la frase
         * introducida en primer lugar, en la que se hayan sustituido todas las apariciones de la
         * primera cadena por la segunda cadena. Por ejemplo: si la frase introducida es “Quiero ir a
         * vivir cerca del Guadalquivir”, y las cadenas introducidas a continuación son “ir” e “IRR”, al
         * reemplazar la primera cadena por la segunda obtendríamos como resultado la
         * frase“Quiero IRR a vivIRR cerca del GuadalquivIRR”.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("porfa Ingrese una frase: ");
        String frase = sc.nextLine();
        System.out.println("porfa Ingrese el primer cadena: ");
        String primer = sc.nextLine();
        System.out.println("porfa Ingrese el segundo cadena: ");
        String seg = sc.nextLine();


        StringBuffer sb = new StringBuffer();


        for (int i = 0; i < frase.length() ; i++) {

        }
    }
}
