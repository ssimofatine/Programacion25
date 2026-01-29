package Tema3;
import java.util.Scanner;

public class arryList7 {

    public static int TotalUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfa Dami Total Del Usuario: ");
        int total = Integer.parseInt(sc.nextLine());
        return total;
    }

    public static double[]  NotasAlumno(int total) {
        Scanner sc = new Scanner(System.in);
        double[] Notas = new double[total];
        for(int i = 0 ; i < Notas.length ; i++){
            // mi problema olvide suma = 0 + 1
            System.out.println("Porfa Dami Nota " + (i + 1) + ": ");
            Notas[i] = sc.nextDouble();

        }
        return  Notas;
    }

    public static String[]  NombresAlumno(int total) {
        Scanner sc = new Scanner(System.in);
        String[] Nombres = new String[total];
        for(int i = 0 ; i < Nombres.length ; i++){
            System.out.println("Porfa Dami Nombres" + (i + 1) + ": ");
            Nombres[i] = sc.nextLine();
        }
        return Nombres;
    }

    public static void main(String[] args) {

        int total = TotalUsuario();


        double[]  NotasAlumnoFinal = NotasAlumno(total);

        String[]  NombresAlumnoFinal = NombresAlumno(total);

        for(int i = 0 ; i < total ; i++){
            System.out.println("El Nombre Alumno/a es: " + NombresAlumnoFinal[i] + " Y Notas: " + NotasAlumnoFinal[i]);
            System.out.println("--------------------------");
        }

    }
}
