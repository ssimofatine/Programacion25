package Tema3;

import java.util.Scanner;


public class EjercicoClase1 {
    static void main(String[] args) {
        String vocales = "aeiouAEIOUÁÓÉÍÚ";
        String teclado;

        Scanner sb = new Scanner(System.in);
        System.out.println("Demi tu nombre or appidos");
        teclado = sb.nextLine();

        int contador = 0;
        for (int i = 0; i < teclado.length(); i++) {
            char letra = teclado.charAt(i);
            if (vocales.contains(String.valueOf(letra))) {
                contador++;
            }
        }

        System.out.println("( "+teclado +" )" + " Y la suma or total letras del vocales es: " + contador);
    }
}
