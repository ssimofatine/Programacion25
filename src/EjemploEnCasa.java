import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class EjemploEnCasa {

    public static void main(String[] args) {
        /**
         * Contador de vocales
         * Pide al usuario una palabra y muestra cuántas vocales contiene.
         */

        Scanner Sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra del vocales: ");
        String palabra = Sc.nextLine();

        String vocales = "aeiouAEIOUáéíúóÁÉÍÚÓ";

        int contador = 0;

        List <Character> palabrar1 = new ArrayList<>();

        for (int i = 0 ; i <= palabra.length() - 1 ; i++){
            char letra = palabra.charAt(i);
            if (vocales.contains(String.valueOf(letra))){
                contador++;
                palabrar1.add(letra);
            }

        }

        System.out.println("Palabra: " + palabra + " Contador: " + contador);
        System.out.println("-------------------");
        System.out.println("Palabra del vocales: " + palabrar1);

    }
}
