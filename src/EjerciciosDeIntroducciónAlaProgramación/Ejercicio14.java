package EjerciciosDeIntroducciónAlaProgramación;

public class Ejercicio14 {
    public static void main(String[] args) {
        /**
         * 14. Realiza un programa en Java que genere números de forma aleatoria simulando la tirada de un dado.
         */

        // tengo un dado tiene 6 caras en cada cara tiene numero por ejemplo la cara uno tiene numero 1 or 2,3,4,5,6
        int tirada;
        tirada = (int)(Math.random()*(6 - 1 + 1) + 1); // forma de calcular aleatorio de dado es = (numeroMax - 1 + numeroMin) + numeroMin
        System.out.println(tirada);


    }
}
