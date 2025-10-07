import java.util.Scanner;

public class EjemploIFelseAnidados {
    public static void main(String[] args) {

        int edad;
        char sexo, amigojefe1;// h , m
        boolean amigojefe = true;

        //Puedes entrar a la discotica si tiene 18 o mas años
        // Puedes Entrara si tiene más de diecisies y eres mujer ()
        // Puedes Entrara si tiene más de diecisies y amigo dej jefe
        // no puedes entrar en otro caso


        Scanner Sc = new Scanner(System.in);
        System.out.println("Por favo Dime tú edad: ");
        edad = Sc.nextInt();
        System.out.println("dime tú sexo Pro ejemplo (H or M): ");
        sexo =  Sc.next().charAt(0);
        System.out.println("Tú amigo del jefe ... Ejemplo (S o N)");
        amigojefe1 = Sc.next().charAt(0);

        if (amigojefe1 == 'n') {
            amigojefe = false;
        }

        if (edad >= 18 && (sexo == 'h' || sexo == 'm')){

            System.out.println("Puedes entrar tú tines 18 o mas años ");

        } else if (edad == 16 && sexo == 'm') {

            System.out.println("Puedes Entrara Tú mujer");

        } else if (edad == 16 && amigojefe) {

            System.out.println("Puedes Entrara Tú amigo del jefe");

        }else {
            System.out.println("no puedes entrar en otro caso");
        }


    }
}
