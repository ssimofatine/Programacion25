package EjerciciosDeIntroducciónAlaProgramación;

public class Ejrcicio18 {
    public static void main(String[] args) {
        /**
         * 18. ¿Qué resultados se obtienen al realizar las operaciones siguientes? Si hay errores en la compilación,
         * corríjalos y dé una explicación de por qué suceden.
         * int a = 10, b = 3 , e = 1, d, e;
         * float x, y;
         * x= a / b;
         * c = a < b && c;
         * d = a + b++;
         * e = ++a – b;
         * y = (float)a / b;
         */

        // int a = 10, b = 3 , e = 1, d, e; // problema de variable (e = 1) con otro varaible (e) no verdadero pero mejor usar solo varable e = 1 y borrar otro
        int a = 10, b = 3 , e = 1, d;
        float x, y;
        boolean c; // importante usar boolean para condiciones
        x = (float) a / b; // mejor usar float
        c = a < b;
        d = a + b++;
        e = ++a - b;
        y = (float) a / b;

        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
