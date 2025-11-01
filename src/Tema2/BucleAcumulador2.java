package Tema2;

public class BucleAcumulador2 {
    public static void main(String[] args) {
        // número elevado o otro número, sin usar Math.pow
        //

        int base = 2, exponente = 3; // 2 elevado 3
        int resultado = 1;

        //



        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base; // También se puede escribir como: resultado *= base;
        }

        System.out.println(base + " elevado a " + exponente + " es igual a: " + resultado);


    }
}
