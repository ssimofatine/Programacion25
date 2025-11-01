package Tema2;

public class EjercicioBucle9 {
    public static void main(String[] args) {
        // Lenza un dado de 20 caras 50 veces y dime cuantas sale un criteco (20)
        // V.E Tirada del dado
        // V.S número de veces que salido (20)
        // Disño
        //


        int tiradaDelDado, numeroDeVeces;

        int contador = 0;

        for (int i = 1; i <= 50 ; i++) {

            tiradaDelDado = (int) (Math.random()*(20 -1 +1) +1);

            if (tiradaDelDado == 20){
                System.out.println("--------------");
                System.out.println(tiradaDelDado + " eso es un crítico");
                contador++;
            }

        }

        System.out.println("Total tiradas eso es un crítico: " + contador);

    }
}
