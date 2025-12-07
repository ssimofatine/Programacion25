package Tema3.ArraysMatrices.Matrices;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*Crear una matriz “marco” de tamaño 8x6. Una matriz “marco”
        es aquella que todos sus elementos son 0 salvo los
        de los bordes que deben ser 1. Mostrarla.*/

        /**
         * 1 1 1 1 1 1
         * 1 0 0 0 0 1
         * 1 0 0 0 0 1
         * 1 0 0 0 0 1
         * 1 0 0 0 0 1
         * 1 0 0 0 0 1
         * 1 0 0 0 0 1
         * 1 1 1 1 1 1
         */

         int marco[][] = new int[8][6];
        System.out.println(marco.length);
        //fila ---  de 0 a 7
        for (int i = 0; i < marco.length; i++) {
            //culomna ||| de 0 a 5 elementos.
            for (int j = 0; j < marco[i].length; j++) {

                if (i == 0 || i== marco.length-1 || j == 0 || j == marco[i].length-1 ){
                    marco[i][j] = 1;
                }else {
                    marco[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }



    }
}
