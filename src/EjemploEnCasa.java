import java.util.Scanner;
public class EjemploEnCasa {

    public static void main(String[] args) {
        /**
         * Contador de vocales
         * Pide al usuario una palabra y muestra cuántas vocales contiene.
         */

        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra del vocales: ");
        String palabra = Sc.nextLine();

        // palabra = "elsimo"


        String laLetra = "aieouAIEOUáíéóúÁÉÍÓÚ";

        int contador = 0;

        for (int i =0 ; i <= palabra.length() - 1 ; i++ ) {
            char letra = palabra.charAt(i);
            if (laLetra.contains(String.valueOf(letra))) {
                contador++;
            }
        }

        System.out.println("Palabra: " + palabra + " Contador: " + contador);

    }
}
