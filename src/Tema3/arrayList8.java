package Tema3;
import java.util.Scanner;

public class arrayList8 {
    public static int PintarArray() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Porfa dime tu numero del ArrayList: ");
        int num = Integer.parseInt(Sc.nextLine());
        return num;
    }
    public static double[] NumeroArray(int Numero) {
        Scanner Sc = new Scanner(System.in);

        double[] num = new double[Numero];
        for (int i = 0; i < Numero; i++) {
            System.out.println("Digite um valor Array porfa numero decimal: ");
            num[i] = Sc.nextDouble();
        }
        return num;
    }

    public static double PintarDouble(double[] Numero) {
        double[] num = Numero;
        double suma = 0;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        return suma;

    }

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        int Numero = PintarArray();

        double[] NumeroArray1 = NumeroArray(Numero);

        double Total = PintarDouble(NumeroArray1);

        System.out.println("-------------------------------");

        System.out.println("Numero ArrayList es: " + Numero);

        System.out.println("Total " + Total);

        System.out.println("Media es: " + (Total / Numero));

        
    }
}
