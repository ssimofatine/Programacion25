package PRACTICA_DE_CLASE_2;

import java.util.Scanner;

public class Ejercicio1 {
    /**
     * mi profesor javi, este metodo del return Vocales
     * @return
     */
    public static char Vocales(char vocal) {

        char returne = vocal;

        if (vocal == 'a' || vocal == 'A') {
            returne = '4';
        } else if (vocal == 'e' || vocal == 'E') {
            returne = '3';
        } else if (vocal == 'i' || vocal == 'I') {
            returne = '1';
        } else if (vocal == 'o' || vocal == 'O') {
            returne = '0';
        } else if (vocal == 'u' || vocal == 'U'){
            returne = '9';
        }

        return returne;
    }

    public static void MetodoDelAprobar(char UnaLetra, StringBuffer resultado, StringBuffer Palabra){

        if (UnaLetra == ' ') {
            invYAgr(resultado, Palabra);

            resultado.append(' ');
            // yo puedo metodo delet en Palabra para liembiar palbras hasta null con bocle while (premiero hasta final .length())
            while (Palabra.length() > 0) {
                Palabra.deleteCharAt(0);
            }
        } else {
            Palabra.append(UnaLetra);
        }

    }

    public static void invYAgr(StringBuffer resultado, StringBuffer Palabra) {

        for (int i = Palabra.length() - 1; i >= 0; i--) {
            // en bocle (For) yo quiero coje una letra con metodo (char)
            char letra = Palabra.charAt(i);
            // ahora ir a función y lugo verificar Vocales
            char cs = Vocales(letra);
            // . append addemas espacio
            resultado.append(cs);
        }
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String PalabraUsuario ;

        System.out.println("por favor dami tu palabras: ");

        PalabraUsuario = sc.nextLine();

        StringBuffer resultado = new StringBuffer();
        StringBuffer Palabra = new StringBuffer();

        for (int i = 0; i < PalabraUsuario.length(); i++) {
            // ahora coje una letra en char
            char UnaLetra = PalabraUsuario.charAt(i);

            MetodoDelAprobar(UnaLetra, resultado, Palabra);

        }

        // ahora usar palabra en resultado del stringBuffer y luego verficar palabra del .length() mayor que 0
        if (Palabra.length() > 0) {
            invYAgr(resultado, Palabra);
        }

        // mostrar resultado
        System.out.println("Resultado final:");
        System.out.println(resultado.toString());




    }
}
