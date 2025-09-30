import java.util.Scanner;

public class EjmploOperadoresExtra {
    public static void main(String[] args) {

        // Dados los Catetosde un triangulo calcular su hipotenusa y mostrarla

        Scanner scanner = new Scanner(System.in);


        System.out.print(" (Cateto 1): ");
        double cateto1 = scanner.nextDouble();

        System.out.print(" (Cateto 2): ");
        double cateto2 = scanner.nextDouble();

        double cateto1Squared = Math.pow(cateto1, 2);
        double cateto2Squared = Math.pow(cateto2, 2);



        scanner.close();
    }
}
