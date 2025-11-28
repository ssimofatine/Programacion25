package Tema3;

import java.util.Scanner;

public class arrayList1 {
    static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("demi tu numero del palabras porfa: ");
        int use = Integer.parseInt(Sc.nextLine());

        String[] Lista = new String[use];

        for (int i = 0; i < use ; i++) {
            System.out.println("demi palabra para Guardar: ");
            Lista[i] = Sc.nextLine();
        }

        for (int i = 0; i < Lista.length ; i++) {
            System.out.println(" "+ Lista[i]);
        }


    }
}
