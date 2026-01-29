package Tema3;
import java.util.Scanner;

public class JuegoArray {

    public static void ver(char[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }

    public static boolean fin(char[] t) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == '-') {
                return false;
            }
        }
        return true;
    }

    public static char[] palabras(char[] p){
        char[] PalabraOregenal = new char[p.length];
        for (int i = 0; i < p.length; i++) {
            PalabraOregenal[i] = '-';
        }
        return PalabraOregenal;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "JAVA"; // este palabra de Gana

        char[] Palabras = {'J','A','V','A'};
        int v = 6; // Vidas
        boolean acierto;

        char[] p = Palabras;

        char[] t = palabras(p);

        try {
            while (v > 0 && (fin(t) == false)){

                System.out.println("Vidas: " + v);
                ver(t);

                System.out.print("Dime una letra: ");
                String in = sc.nextLine();
                in = in.toUpperCase();


                char l = in.charAt(0);


                acierto = false;


                for (int i = 0; i < p.length; i++) {
                    if (Palabras[i] == l) {
                        t[i] = l;
                        acierto = true;
                    }
                }

                if (!acierto) {
                    v--;
                    System.out.println("no bien");
                } else {
                    System.out.println("Bien :)");
                }

            }
        } catch (Exception e) {
            System.out.println("error" + e);
        }

        System.out.println("------------------------------");

        if (fin(t)) {
            System.out.println("Gana " + s);
        }else {
            System.out.println("no  Gana");
        }



    }
}
