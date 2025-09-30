import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        // lae de teclado dos valores de tipo double num1, num2
        // Intercambia el valor de las variables y pintato pro pantalla

        Scanner Sc = new Scanner(System.in);

        double num1, num2, Temp;

        System.out.println("Dime num1: ");
        num1 = Sc.nextDouble();

        System.out.println("Dime num2: ");
        num2 = Sc.nextDouble();

        // Intercambia el valor
        Temp = num2;
        num2 = num1;
        num1 = Temp;

        System.out.println("ntercambia el valor num1 a num1 : " + num1);

        System.out.println("ntercambia el valor num2 a num2 : " + num2);

    }
}
