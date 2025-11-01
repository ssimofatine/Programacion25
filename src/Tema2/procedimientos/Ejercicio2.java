package Tema2.procedimientos;

public class Ejercicio2 {

    public static void  pintarAsteriscos(int num){
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void  pintarAsteriscosDos(int numA){
        for (int i = 0; i < numA; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        //Crear un procedimiento que pinte en la misma línea
        //tantos asteriscos como indique un parámetro llamado num
        //Al final que pinte un salto de línea


        pintarAsteriscos(5);
        pintarAsteriscos(4);
        pintarAsteriscos(3);
        pintarAsteriscos(2);
        pintarAsteriscos(1);

        // otro idea

        System.out.println("------------------------------------------");

        for (int i = 0; i < 10; i++) {
            pintarAsteriscosDos(i);
        }



    }
}
