package Tema2;

public class EjercicioBucle7 {
    public static void main(String[] args) {

        // numero que sean multiplos de 3 pero no de 5 entre  100 y 200
        int contador;

        for (contador = 100; contador <=200 ; contador++) {
            if ((contador % 3 == 0) && (contador % 5 != 0) ){
                System.out.println("este numero : " + contador + " multiplos de 3 pero no de 5 entre");


            }



        }
        System.out.println("------------------------------------------------------");
        System.out.println("Contadaor Es : " + contador);

    }
}
