package EjerciciosDeIntroducciónAlaProgramación;

public class Ejercicio9 {
    public static void main(String[] args) {
        /**
         * 9. El siguiente programa tiene 3 fallos, averigua cuáles son y modifica el programa para que funcione.
         * class Cuadrado {
         * public static void main(String [] args)
         * {
         *  int numero=2, // fallo uno es punto coma en el último
         *  cuad=numero * número; // fallo dos es (ú) y usar (int) en cuad
         *  System.out.println("EL CUADRADO DE "+NUMERO+" ES: " + cuad); // fallo Tres es (laletra capetal)
         * }
         * }
         */

        int numero=2;
        int cuad = numero * numero;
        System.out.println("EL CUADRADO DE "+numero+" ES: " + cuad);
    }
}
