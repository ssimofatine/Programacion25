package Tema2;

public class EjercicioTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("----------------------");

        for (int k = 4; k >= 1 ; k--) {
            int contador;
            contador = k;
            while (contador != 0){
                System.out.print(" ");
                contador--;
            }

            for (int j = k; j <= 4 ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
