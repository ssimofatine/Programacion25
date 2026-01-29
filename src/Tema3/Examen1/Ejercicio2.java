package Tema3.Examen1;

public class Ejercicio2 {

    public static int GenrarNumero(int min, int max) {

        return (int) ((Math.random() * (max - min - 1)) + 1);
    }

    public static double porcentajeParejasConsecutivas(int[] array) {
        int c = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                c = c +1 ;
            }
        }

        return ((double) c / (array.length - 1)) * 100;
    }

    public static int[] carasNoSalidas(int[] array) {
        int cara = 8;
        int[] cont = new int[cara + 1];

        for (int i = 0; i < array.length; i++) {
            cont[array[i]]= cont[array[i]] + 1;
        }

        int nS = 0;
        for (int i = 1; i <= cara; i++) {
            if (cont[i] == 0) {
                nS = nS +1;
            }
        }

        int[] r = new int[nS];
        int j = 0;

        for (int i = 1; i <= cara; i++) {
            if (cont[i] == 0) {
                r[j] = i;
                j = j + 1;
            }
        }
        return r;
    }

    public static void main(String[] args) {

        int[] array = new int[200];

        int cara = 8;

        int[] cont = new int[cara + 1];

        double s = 0;
        double med;

        for (int i = 0; i < array.length; i++) {
            int num = GenrarNumero(1, 8);
            array[i] = num;
            cont[num]++;
            s = s + num;
        }

        int maxV = 0;

        System.out.println("--- Repite ---");
        for (int i = 1; i <= cara; i++) {
            System.out.println("Cara " + i + ": " + cont[i] + " Otra Vez.");
            if (cont[i] > maxV) {
                maxV = cont[i];
            }
        }

        System.out.println("--- La Cara Mucho Repite---");
        for (int i = 1; i <= cara; i++) {
            if (cont[i] == maxV) {
                System.out.println("La Cara " + i + " Repite " + maxV + " Otros");
            }
        }

        med = s / array.length;
        System.out.println("--- Resultado Public ---");
        System.out.println("Media suma " + med);

        double pC = porcentajeParejasConsecutivas(array);
        System.out.println(" Emapr muesrta " + pC);

        int[] nS = carasNoSalidas(array);

        System.out.print("La Caras No Muestra");
        for (int i = 0; i < nS.length; i++) {
        System.out.print(nS[i] +  ", " );
        }
        System.out.println("]");
    }
}
