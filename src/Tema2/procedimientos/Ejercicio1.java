package Tema2.procedimientos;

public class Ejercicio1 {
    /**
     *
     * @param min
     * @param max
     * @return
     */
    public static int generarAleatorrio(int min, int max){
        return (int) ((Math.random()* max - min + 1) + min) ;
        }

    public static void main(String[] args) {
        /**
         *
         */

        //Crea una función que genere un número aleatorio entre
        //un número entero mínimo y un máximo, y lo devuelva (return)
        //generarAleatorio(int min, int max)
        //Pruébala desde el main llamándola con:
        //generarAleatorio(1, 100)
        //generarAleatorio(-100, 100)
        //generarAleatorio(100, 200)
        //

        System.out.println(generarAleatorrio(1,100));
        System.out.println(generarAleatorrio(-100,100));
        System.out.println(generarAleatorrio(100,200));

    }
}
