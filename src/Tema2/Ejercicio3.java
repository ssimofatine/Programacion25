package Tema2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int nu_alumno, coste_autobus = 0, coste_por_alumno = 0;
        System.out.println("Cuantos alumnos participan en la actividad: ");
        Scanner Sc = new Scanner(System.in);
        nu_alumno = Sc.nextInt();

        if(nu_alumno >= 100){
            coste_por_alumno = 65;
        }

        if (nu_alumno >= 50 && nu_alumno <=99) {
            coste_por_alumno = 70;

        }
        if (nu_alumno >= 30 && nu_alumno <= 49) {
            coste_por_alumno = 95;

        }
        if (nu_alumno < 30 && nu_alumno > 0) {
            coste_por_alumno = 4000 / nu_alumno;

        }
        if (nu_alumno > 0) {
            coste_autobus = coste_por_alumno * nu_alumno;
            System.out.println("El coste por alumno es: " + coste_por_alumno + " euros");
            System.out.println("El coste del autobús: " + coste_autobus + " euros");

        }else {
            System.out.println("El número de alumnos debe ser un valor positivos ");
        }


    }
}
