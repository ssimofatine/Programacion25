package EjerciciosDeIntroducciónAlaProgramación;

public class Ejercicio17 {
    public static void main(String[] args) {
        /**
         * 17. Escriba expresiones que almacenen en variables lo siguiente:
         * a. Crear un número entero positivo aleatorio entre 1 y 49.
         * b. Generar un número aleatorio positivo par.
         * c. Generar un número real aleatorio entre 1 y 10.
         * d. Crear un número entero negativo entre -50 y -150.
         * e. Crear un número entero entre -100 y 100.
         * f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
         * g. Crea un generador aleatorio de uno de los meses del año
         */

        int a, b, c, d, e, f, g;

        a = (int) (Math.random() * (49 -1 + 1) + 1);
        System.out.println("Un número entero positivo aleatorio entre 1 y 49: " + a);
        System.out.println("--------------------------");

        do {
            b = (int) (Math.random() * (49 -1 + 1) + 1);
        }while (b % 2 != 0);
        System.out.println("Un número aleatorio positivo par: " + b);

        System.out.println("----------------------------");


    }
}
