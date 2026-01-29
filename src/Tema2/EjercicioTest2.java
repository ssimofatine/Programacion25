package Tema2;
import java.util.Scanner;
public class EjercicioTest2 {
    public static void pintarbara(int n){

        for( int i = 0; i < n; i++){
            System.out.print("|");

        }

    }

    public static void calcular(int num){
        String numero = String.valueOf(num);
        int num1 = 0;
        int num2 = 0;

        for(int i=0; i<numero.length(); i++){

            num1 = num % 10;
            pintarbara(num1);
            if (num1 == 0) {
                System.out.print("-");
            }if (i != numero.length() - 1) {
                System.out.print(" - ");
            }
            num2 = num / 10;
            num = num2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("porfa introduce tu numero: ");
        int num = sc.nextInt();

        calcular(num);



        sc.close();


    }
}
