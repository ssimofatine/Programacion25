package Tema3;
import java.util.Random;
import java.util.Scanner;
public class FincaHumedad {

    /**
     * Una finca agrícola dispone de una serie de sensores de humedad del suelo distribuidos por diferentes zonas
     * del terreno. Cada sensor registra un valor entero entre 0 y 100.
     * Se pide implementar un programa en Java que trabaje con un array de valores de humedad, y que:
     * - Indique cuántos sensores están por debajo del nivel mínimo recomendado,
     * que será un valor dado por el usuario (por ejemplo, 30).
     * - Obtenga un nuevo array con los valores de los sensores que necesitan riego urgente.
     * - Calcule la media de humedad de toda la parcela.
     * - Determine si existe alguna zona crítica, definida como tres sensores consecutivos con
     * humedad menor al mínimo recomendado.
     *
     * Genera un array de ejemplo con 1000 valores aleatorios entre 0 y 100 para simular los sensores.
     */


    //este funcion de geniral Aleatorio del número max y min
    public static int genNum(int max, int min) {
        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }

    // este funcion para generar array
    public static int[] genA(int t) {
        int[] a = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = genNum(100, 0);
        }
        return a;
    }

    // este funcion por suma cada sensoers
    public static int contBajo(int[] a, int m) {
        int c = 0; // Contador de sensores bajos
        for (int i = 0; i < a.length; i++) {
            if (a[i] < m) {
                c++;
            }
        }
        return c;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 1000;
        int[] a = genA(MAX);
        int m = 0;
        int c;
        double media;
        int[] r;
        boolean critica;
    }
}
