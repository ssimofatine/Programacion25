package Tema3;
import java.util.Scanner;
public class test2 {
    final static int T = 7;
    final static int MAX_M = 5;

    public static int GernraNumero(int max, int min) {

        return (int) ((Math.random() * (max - min + 1)) + min);
    }

    public static void ini(char[][] m, char[][] p) {

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                m[i][j] = '0';
                p[i][j] = '_';
            }
        }

        int c = 0;
        while (c < MAX_M) {
            int r = GernraNumero(T - 1, 0);
            int d = GernraNumero(T - 1, 0);

            if (m[r][d] != 'M') {
                m[r][d] = 'M';
                c++;
            }
        }
    }

    public static int contM(char[][] m, int f, int d) {
        int c = 0;

        for (int i = f - 1; i <= f + 1; i++) {
            for (int j = d - 1; j <= d + 1; j++) {

                if (i >= 0 && i < T && j >= 0 && j < T) {

                    if (i != f || j != d) {

                        if (m[i][j] == 'M') {
                            c++;
                        }
                    }
                }
            }
        }
        return c;
    }

    public static void ver(char[][] p) {
        for (int i = 0; i < T; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < T; j++) {
                System.out.print(p[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean ganó(char[][] p) {
        int c = 0;
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                if (p[i][j] != '_') {
                    c++;
                }
            }
        }
        return c >= (T * T - MAX_M);
    }

    public static void verTodo(char[][] matrix, char[][] p) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                if (matrix[i][j] == 'M') {
                    p[i][j] = 'M';
                }
            }
        }
        ver(p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] matrix = new char[7][7];
        char[][] p = new char[7][7];

        int in = 15; // in: intentos restantes
        int f, d; // f: fila, d: columna

        ini(matrix, p);

        while (in > 0 && !ganó(p)) {

            ver(p);
            System.out.println("Intentos: " + in);

            try {
                System.out.println("Fila (0-" + (matrix.length - 1) + "): ");
                f = Integer.parseInt(sc.nextLine());

                System.out.println("Columna (0-" + (matrix.length - 1) + "): ");
                d = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Error de entrada.");
                continue;
            }


            if (f < 0 || f >= matrix.length || d < 0 || d >= matrix.length) {
                System.out.println("Coordenadas fuera de rango.");
                continue;
            }

            if (p[f][d] != '_') {
                System.out.println("Casilla ya descubierta.");
                continue;
            }

            in--;

            if (matrix[f][d] == 'M') {
                verTodo(matrix, p);
                System.out.println("\n*** ¡MINA! GAME OVER. ***");
                in = 0; // إنهاء اللعب

            } else {
                int cM = contM(matrix, f, d); // cM: contador de minas adyacentes

                p[f][d] = (char) (cM + '0');
            }
        }

        System.out.println("============================");
        if (ganó(p)) {
            System.out.println("*** ¡FELICIDADES! ¡GANASTE! ***");
        } else {
            System.out.println("*** PARTIDA TERMINADA. ***");
        }
        verTodo(matrix, p);
    }
}
