import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // un alumno del modulo de programacion quiere saber su nota final. Esta consta de:
        // 55% de tres notas parciales (Media aritmetica de las tres)
        // 30% Calificacion Examen Final
        // 15% calificacion Trabajo Final
        // Pide los varoles de entrada y muestra

        Scanner Sc = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("Forma De Calcular De Nota Final");
        System.out.println("-------------------------------");

        System.out.println("Por Favor, Dame tu Nota parciales 1: ");
        double parciales1 = Sc.nextDouble();

        System.out.println("Por Favor, Dame tu Nota parciales 2: ");
        double parciales2 = Sc.nextDouble();

        System.out.println("Por Favor, Dame tu Nota parciales 3: ");
        double parciales3 = Sc.nextDouble();

        System.out.println("Por Favor, Calificacion Examen Final: ");
        double ExamenFinal = Sc.nextDouble();

        System.out.println("Por Favor, calificacion Trabajo Final: ");
        double TrabajoFinal = Sc.nextDouble();










    }
}
