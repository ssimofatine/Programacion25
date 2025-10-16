package Tema2;

import java.io.DataInput;

public class EjercicioBucle10 {
    public static void main(String[] args) {

        //Lanza dos dados de 12 caras 100 veces
        // Di cuantes veces salen los dos dados iguales

        int dado1, dado2, veces = 0;

        for (int i = 1; i <= 100 ; i++) {

            dado1 = (int) (Math.random()*(12 - 1 + 1) + 1);
            dado2 = (int) (Math.random()*(12 - 1 + 1) + 1);
            System.out.println("este numer de cara dado uno es : "+ dado1 + " y dado dos es : " + dado2);
            System.out.println("==================================================================");

            if (dado1 == dado2){
                System.out.println("-----------------------------------");
                System.out.println("************************************");
                System.out.println("dado uno equql dado dos es : " + dado1 + " = " + dado2);
                System.out.println();
                System.out.println();
                veces++;
            }

        }
        System.out.println("---------------------------------");
        System.out.println("cuantes veces salen los dos dados iguales " + veces);

    }
}
