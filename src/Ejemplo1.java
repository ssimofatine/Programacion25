import java.util.Scanner;

public class Ejemplo1 {
    static void main() {
        int simo;
        double precio;

        Scanner Sc = new Scanner(System.in);

        simo = 15;
        precio = 15.55;

        System.out.println(simo + precio);

        /*
        * Ejemplo
        * */

        System.out.println("Dame un nomero Uno");
        int Num1;
        Num1 = Sc.nextInt();
        System.out.println("Gracias");

        Sc.close();
    }
}
