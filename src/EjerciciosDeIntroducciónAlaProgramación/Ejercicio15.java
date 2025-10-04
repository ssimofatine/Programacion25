package EjerciciosDeIntroducciónAlaProgramación;

public class Ejercicio15 {
    public static void main(String[] args) {
        /**
         * 15. Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone
         * 2000€ en una cuenta a plazo fijo al 2, 75% anual. Recuerde que al pagarle los intereses el banco le
         * retendrá el 18% para hacienda.
         */

        double Precio1 = 2000.0, t, h;
        t = 2.75 / 100; // a plazo fijo al 2, 75% anual
        h = 18.00 / 100; // retendrá el 18% para hacienda

        double fb = Precio1 * t; // este FB de precio en anual

        double fb2= fb / 2; // este FB de precio de seis meses

        double fb3 = fb2 * h; // este FB Final de precio de seis meses con retendrá el 18% para hacienda

        double fbFinal = fb2 - fb3;
        System.out.println("Interés total: " + fbFinal + " Y precio Final en Seis Meses: " + (Precio1 + fbFinal));









    }
}
