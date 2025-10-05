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
        c = (int) (Math.random() * (10 - 1 + 1) + 1);
        System.out.println("Un número real aleatorio entre 1 y 10 :" + c);
        System.out.println("----------------------------");
        d = (int) (Math.random() * (-50 + 150 + 1) - 150);
        System.out.println("Un número entero negativo entre -50 y -150: " + d);
        System.out.println("----------------------------");
        e = (int) (Math.random() * (100 + 100 + 1) - 100);
        System.out.println("Un número entero entre -100 y 100: " + e);

        System.out.println("----------------------------");
        // Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
        boolean cerrado;
        do {
            f = (int) (Math.random() * (100 - 1 + 1) + 1);
            if (f == 5) {
                cerrado = false;
            } else if (f == 7) {
                cerrado = false;
            } else if (f == 33) {
                cerrado = false;
            } else if (f == 125) {
                cerrado = false;
            } else if (f == 77) {
                cerrado = false;
            }else {
                cerrado = true ;
            }
        }while (cerrado);
        System.out.println("Un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77: " + f);

        System.out.println("------------------------------------");

        // g. Crea un generador aleatorio de uno de los meses del año

        boolean cerrado2;
        String  meses = "";

        do {
            g = (int) (Math.random() * (12 - 1 + 1) + 1);
            if (g == 1) {
                meses = "Enero";
                cerrado2 = false;
            }else if (g == 2) {
                meses = "Febrero";
                cerrado2 = false;
            } else if (g == 3) {
                meses = "Marzo";
                cerrado2 = false;
            } else if (g == 4) {
                meses = "Abril";
                cerrado2 = false;
            }else if (g == 5) {
                meses = "Mayo";
                cerrado2 = false;
            }else if (g == 6) {
                meses = "Junio";
                cerrado2 = false;
            }else if (g == 7) {
                meses = "Julio";
                cerrado2 = false;
            }else if (g == 8) {
                meses = "Agosto";
                cerrado2 = false;
            }else if (g == 9) {
                meses = "Septiembre";
                cerrado2 = false;
            }else if (g == 10) {
                meses = "Octubre";
                cerrado2 = false;
            }else if (g == 11) {
                meses = "Noviembre";
                cerrado2 = false;
            }else if (g == 12) {
                meses = "Diciembre";
                cerrado2 = false;
            }else {
                cerrado2 = true ;
            }

        }while (cerrado2);
        System.out.println("El nombre de este mes es: " + meses);





    }
}
