package EjerciciosDeIntroducciónAlaProgramación;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /**
         * 13. Realiza un programa en Java con una variable entera t la cual contiene un tiempo en segundos y
         * queremos conocer este tiempo, pero expresado en horas, minutos y segundos.
         */

        int t;
        Scanner SC = new Scanner(System.in);
        System.out.println("Por Favor Introduzca el Tiempo en segundos: ");
        t = SC.nextInt();
        // Forma De Calcular
        int resultado,hora,minutos,segundos,segundosFinal;
        hora = t / 3600;
        minutos = (t % 3600)/60;
        segundos = (t % 3600);
        segundosFinal = segundos % 60;

        System.out.println("-------------------------");
        System.out.println("Tiempo: " + hora + "H :" + minutos + "M :" + segundosFinal + "S");




    }
}
