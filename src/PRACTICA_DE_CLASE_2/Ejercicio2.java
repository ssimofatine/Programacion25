package PRACTICA_DE_CLASE_2;

public class Ejercicio2 {

    public static int GenrarNumero(int max, int min) {
        return (int) ((Math.random() *(max - min + 1)) + min);
    }

    public static int detCol(int n) {
        if (n == 0) {
            return 0;
        }

        if (n >= 1 && n <= 10 && n % 2 != 0) {
            return 1;
        } else if (n >= 19 && n <= 28 && n % 2 != 0) {
            return 1;
        } else if (n >= 11 && n <= 18 && n % 2 == 0) {
            return 1;
        } else if (n >= 29 && n <= 36 && n % 2 == 0) {
            return 1;
        }else {
            return 2;
        }
    }

    public static int[] contarColores(int n) {
        int[] array = new int[3];

        for (int i = 0; i < n; i++) {
            int num = GenrarNumero(37,1);
            int num1 = detCol(num);


            if (num1 == 1) {
                array[0]= array[0] +1;
            } else if (num1 == 2) {
                array[1] = array[1] + 1;
            } else {
                array[2]= array[2] + 1;
            }
        }
        return array;
    }

    static void main(String[] args) {

        System.out.println("--- parteda 1 ==> HASTA 0 ---");

        int n;
        int t = 0;
        int s = 0;
        int c;
        String nomC;

        do {
            n = GenrarNumero(37,1);
            t = t + 1;
            s += n;
            c = detCol(n);

            if (c == 0) nomC = "VERDE";
            else if (c == 1) nomC = "ROJO";
            else nomC = "NEGRO";

            System.out.println("Tirada " + t + ": " + n + " -> " + nomC);

        } while (n != 0);

        System.out.println("total tiradas hasta 0: " + t);
        System.out.println("suma total de numeros: " + s);

        System.out.println("--- parteda 2: FUNCION contarColores() ---");

        int[] r50 = contarColores(50);
        System.out.println(" 50 tiradas:");
        System.out.println("Rojos: " + r50[0] + ", Negros: " + r50[1] + ", Verdes: " + r50[2]);

        int[] r200 = contarColores(200);
        System.out.println("200 tiradas:");
        System.out.println("Rojos: " + r200[0] + ", Negros: " + r200[1] + ", Verdes: " + r200[2]);

    }
}
