package EjerciciosDeIntroducciónAlaProgramación;

public class Ejercicio7 {
    public static void main(String[] args) {
        /**
         * 7. ¿Por qué no compila el siguiente programa? Modifícalo para hacer que funcione.
         * class Suma {
         * public static void main(String [] args)
         * {
         * int n1=50,n2=30, // problema de comia >> importante usar (;) en final de codigo
         * boolean suma=0; // problema de boolean >> boolean no entiende número solo suar expreciones true or false
         * suma=n1+n2;
         * System.out.println("LA SUMA ES: " + suma);
         * }
         * }
         */

        int n1=50,n2=30; // Falta de comía, importante usar a (;) en el último
        int suma=0; // borrar boolean Y usar (Int)
        suma=n1+n2;
        System.out.println("LA SUMA ES: " + suma);
    }
}
