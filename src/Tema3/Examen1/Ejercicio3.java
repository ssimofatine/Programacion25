package Tema3.Examen1;

import java.util.Scanner;
public class Ejercicio3 {

    public static int GernraNumero(int max, int min) {

        return (int) ((Math.random() * (max - min + 1)) + min);
    }

    //void inicializarTablero(char[][] tablero) para colocar minas aleatorias (sin que
    //coincidan).
    public static void inicializarTablero(char[][] tablero) {
        // aqui pintar (-) in todos matrix (fila culmna)
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                tablero[i][j] = '0';
                tablero[i][j] = '-';
            }
        }

        int c = 0;
        int MAX = 5;
        while (c < MAX) {
            int r = GernraNumero(7 - 1, 0);
            int d = GernraNumero(7 - 1, 0);

            if (tablero[r][d] != 'M') {
                tablero[r][d] = 'M';
                c = c + 1;
            }
        }
    }
    // int contarMinasAdyacentes(char[][] tablero, int fila, int columna) que devuelve el
    //número de minas alrededor de una posición (máximo 8).
    public static int contarMinasAdyacentes(char[][] tablero, int fila, int columna) {
        int c = 0;

        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {

                if (i >= 0 && i < 7 && j >= 0 && j < 7) {

                    if (i != fila || j != columna) {

                        if (tablero[i][j] == 'M') {
                            c = c + 1;
                        }
                    }
                }
            }
        }
        return c;
    }

    public static void mostrarTablero1(char[][] p) {
        for (int i = 0; i < 7; i++) {
            System.out.print(i + "|");
            for (int j = 0; j < 7; j++) {
                System.out.print(p[i][j]);
            }
            System.out.println();
        }
    }

    // boolean haGanado(char[][] tablero) para comprobar victoria
    public static boolean haGanado(char[][] tablero) {
        int c = 0;
        int MAX = 5;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (tablero[i][j] != '-') {
                    c = c + 1;
                }
            }
        }
        boolean c1 = c >= (tablero.length * tablero.length - MAX);
        return c1;
    }
    //void mostrarTablero(char[][] tablero, boolean mostrarMinas) para mostrar el tablero.

    public static void mostrarTablero(char[][] tablero) {
        for(int i=0; i<tablero.length; i++) {
            for(int j=0; j<tablero.length; j++) {
                if (tablero[i][j] == 'M') {
                    tablero[i][j] = 'M';
                }
            }
        }
        mostrarTablero1(tablero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] matrix = new char[7][7];

        int intentos = 15;
        int f, c;

        System.out.println("-------TURNO 3--------");

        inicializarTablero(matrix);

        while (intentos > 0 && !haGanado(matrix)) {

            mostrarTablero1(matrix);
            System.out.println("Intentos: " + intentos);

            System.out.println("Fila 0 " + (matrix.length - 1));
            try {
                f = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error");
                f = -1;
            }

            System.out.println("Columna 0 " + (matrix.length - 1));

            try {
                c = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error");
                c = -1;
            }


            if (f < 0 || f >= matrix.length || c < 0 || c >= matrix.length) {
                System.out.println("fuera de rango.");
                continue;
            }

            if (matrix[f][c] != '-') {
                System.out.println("Casilla ya descubierta.");
                continue;
            }

            intentos--;

            if (matrix[f][c] == 'M') {
                mostrarTablero(matrix);
                System.out.println("Final");
                intentos = 0;

            } else {
                int cM = contarMinasAdyacentes(matrix, f, c);

                matrix[f][c] = (char) (cM + '0');
            }
        }

        System.out.println("-------------------------------------");
        if (haGanado(matrix)) {
            System.out.println("bien");
        } else {
            System.out.println("Termiado");
        }
        mostrarTablero(matrix);
    }
}

