package Tema2;
import java.util.Scanner;
public class EjemblusBucles {
    public static void main(String[] args) {

        //1. Suma los 10 preimeros numeros (0,1,...,9) Y muestra el resultado
        //2. Pide en un bucle 5 numeros por teclado y di si cada uno es par o impar
        //3. Pide por teclado cuatro notas (doble) y muestra la media de ellas

        int teclado;
        Scanner SC = new Scanner(System.in);

        teclado = SC.nextInt();

        //1.  Suma los 10 preimeros numeros (0,1,...,9) Y muestra el resultado
        int contador =0;
        int suma=0;
        while (contador < 10){
            suma = suma + contador;
            contador++;
        }



    }
}


