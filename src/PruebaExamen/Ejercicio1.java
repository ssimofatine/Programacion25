package PruebaExamen;

import java.util.Scanner;

public class Ejercicio1 {
    public static boolean pruebaTrue(int frase1, int primer1, int i) {

        if (i + primer1 > frase1 ) {
            return false;
        }
        return true;
    }

    public static boolean palabraTrue(String frase, String primer, int j, int i) {

        if (frase.charAt(i + j) != primer.charAt(j) ) {
            return false;
        }
        return true;
    }

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


        int frase1 = frase.length();
        int primer1 = primer.length();

        for (int i = 0; i < frase.length() ; i++) {
            boolean prueba = true;
            if (!pruebaTrue(frase1, primer1, i)){
                prueba = false;
            }else {
                for (int j = 0; j < primer.length() ; j++) {
                    if (!palabraTrue(frase, primer, j,i)){
                        prueba = false;
                        break;
                    }
                }
            }

            if (prueba) {
                sb.append(seg);
                i = i + primer.length() - 1;

            }else {
                sb.append(frase.charAt(i));
            }



        }

        System.out.println("--- Resultado ---");
        System.out.println(sb.toString());



    }
}
