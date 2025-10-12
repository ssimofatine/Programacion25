package Tema2;

import java.util.Scanner;

public class EjercicioIF2 {
    public static void main(String[] args) {

        //EJERCICIO PARA DETERMINAR SI TE DAN UNA BECA Y DE QUÉ TIPO
        //Requisitos generales (deben cumplirse los dos):
        //1. No tener más de dos asignaturas suspensas
        //2. Ingresos familiares inferiores a 2000€/mes

        //Si se cumplen te van a dar un tipo de beca
        //BECA COMPLETA: si se cumple alguna de estas condiciones (OR)
        //1. Ingresos inferiores a 800€/mes
        //2. Vives en zona vulnerable
        //3. Discapacidad superior al 60%
        //BECA PARCIAL: si se cumple alguna de estas condiciones (OR)
        //1. Ingresos inferiores a 1000€/mes y Familia numerosa
        //2. Ingresos inferiores a 1200€/mes
        //3. Ingresos inferiores a 1100€/mes y vives en zona vulnerable
        //4. Discapacidad entre el 40 y 60%
        //BECA SIMPLE: si se cumple alguna de estas condiciones (OR)
        //1. Ingresos familiares entre 1400€/mes y 1800€/mes
        //2. Discapacidad entre el 20 y 40%

        //V.E.: ingresosMensualesFamilia, asignaturasSuspensas, zonaVulnerable (true/false),
        //      discapacidad(0-100), familiaNumerosa (true/false)
        //V.S.: si te dan beca o no, y en caso afirmativo qué tipo de beca

        Scanner Sc = new Scanner(System.in);
        char asignaturas;
        int  IngresosFamiliares;

        System.out.println("Por Favoe ¿Reprobaste más de dos asignaturas? (S o N)");
        asignaturas = Sc.next().charAt(0);
        System.out.println("-----------------------------------");
        System.out.println("a quie ngresos tú familiares: ");
        IngresosFamiliares = Sc.nextInt();
        System.out.println("------------------------------------");
        System.out.println("Donde Vives .. Tú casa muy lejos y vulnerable escribe (S o N)");
        char Vives = Sc.next().charAt(0);
        System.out.println("------------------------------------");
        System.out.println(" tienes Discapacidad Por favor escribe cuanto tienes por ejemplo (20 or 60 or 100 ...)");
        int Discapacidad = Sc.nextInt();
        System.out.println("---------------------------------------");
        System.out.println("Tú Tienes Familla grande :");
        char famillaGrande = Sc.next().charAt(0);
        System.out.println("-----------RESYLTADO-------------");



        if ( asignaturas == 's') {
            System.out.println("Lo Siento No obtndras la beca");

        } else if (IngresosFamiliares <= 800 && Vives == 's' && Discapacidad == 60) {
            System.out.println("BECA COMPLETA");
            
        } else if (IngresosFamiliares <= 1000 && famillaGrande == 's') {
            System.out.println("BECA PARCIAL");
        }else if (IngresosFamiliares <= 1100 && Vives == 's') {
            System.out.println("BECA PARCIAL");
        }else if (IngresosFamiliares <=1200 ) {
            System.out.println("BECA PARCIAL");
        }else if (Discapacidad >= 40 && Discapacidad <= 60 ) {
            System.out.println("BECA PARCIAL");
        } else if ((IngresosFamiliares >=1400 && IngresosFamiliares <=1800) || (Discapacidad >= 20 && Discapacidad <=40)) {
            System.out.println("BECA SIMPLE");
        }


    }
}
