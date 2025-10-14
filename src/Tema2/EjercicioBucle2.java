package Tema2;

public class EjercicioBucle2 {
    public static void main(String[] args) {

        // numero impares del 1 al 100, pintalos seguidos separados por comas

        int contador = 1;
        while (contador <= 100){
            System.out.print(contador + ", ");
            contador += 2;
        }

        System.out.println("");

        contador = 1;

        while (contador <= 100){
            if (contador % 2 == 1){
                System.out.print(contador + ", ");
            }
            contador++;


        }



    }
}
